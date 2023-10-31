package com.cardonamaturana.assetms.infrastructure.client;

import com.cardonamaturana.assetms.infrastructure.client.mapper.AssigneeResponseMapper;
import com.cardonamaturana.assetms.infrastructure.client.response.AssigneeResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.Duration;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MyClientService {

  private final WebClient webClient;
  private final AssigneeResponseMapper assigneeResponseMapper;
  private final StringRedisTemplate redisTemplate;
  private final ObjectMapper objectMapper;

  @Value("${MS.ASSIGNEE.URL}")
  private String URL;

  @Value("${MS.ASSIGNEE.PATH}")
  private String PATH;

  @Autowired
  public MyClientService(Builder webClientBuilder, AssigneeResponseMapper assigneeResponseMapper,
      StringRedisTemplate redisTemplate, ObjectMapper objectMapper) {
    this.webClient = webClientBuilder.baseUrl(URL + "/" + PATH).build();
    this.assigneeResponseMapper = assigneeResponseMapper;
    this.redisTemplate = redisTemplate;
    this.objectMapper = objectMapper;
  }

  public Mono<AssigneeResponse> getAssigneeById(String assigneeId) throws JsonProcessingException {
    ValueOperations<String, String> valueOps = redisTemplate.opsForValue();
    String value = valueOps.get(assigneeId);
    if (Objects.nonNull(value)) {
      EventDto event = objectMapper.readValue(valueOps.get(assigneeId), EventDto.class);
      return Mono.just(assigneeResponseMapper.toDto(event));
    }

    return webClient.get()
        //TODO: ENVIRONMENT VARIABLES FOR THIS PATH
        .uri(uriBuilder -> uriBuilder.path("/id")
            .queryParam("assigneeId", assigneeId)
            .build())
        .retrieve()
        .toEntity(String.class).map(result -> {
              final EventDto eventResult = new EventDto(result.getHeaders().toSingleValueMap(),
                  result.getBody());
              try {
                if (Objects.nonNull(eventResult)) {
                  // guardar el redis la respuesta del microservicio para futuras consultas.
                  valueOps.set(assigneeId, objectMapper.writeValueAsString(eventResult),
                      Duration.ofMillis(10000));
                  return assigneeResponseMapper.toDto(eventResult);
                }

              } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
              }
              return new AssigneeResponse();
            }

        );
  }

}
