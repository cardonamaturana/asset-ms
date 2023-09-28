package com.cardonamaturana.assetms.infrastructure.client;

import com.cardonamaturana.assetms.infrastructure.client.mapper.AssigneeResponseMapper;
import com.cardonamaturana.assetms.infrastructure.client.response.AssigneeResponse;
import com.cardonamaturana.assetms.shared.utils.CustomHeaders;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MyClientService {

  private final WebClient webClient;
  private final AssigneeResponseMapper assigneeResponseMapper;

  @Autowired
  public MyClientService(Builder webClientBuilder, AssigneeResponseMapper assigneeResponseMapper) {
    this.webClient = webClientBuilder.baseUrl("http://127.0.0.1:8081/assignee").build();
    //TODO: DEJAR LA CONEXION EN TERMINOS DE VARIABLES DE ENTORNO
    this.assigneeResponseMapper = assigneeResponseMapper;
  }

  public Mono<AssigneeResponse> obtenerAssigneePorId(String assigneId) {
    return webClient.get()
        .uri(uriBuilder -> uriBuilder.path("/id")
            .queryParam("assigneeId", assigneId)
            .build())
        .retrieve()
        .toEntity(Map.class).map(result -> {
              HttpHeaders headers = result.getHeaders();
              List<String> headerValues = headers.get(CustomHeaders.X_OBJECT_TYPE.getMessage());
              String header =
                  Objects.nonNull(headerValues) && !headerValues.isEmpty() ? headerValues.get(0) : null;
              return assigneeResponseMapper.toDto(header, result.getBody());
            }
        );
  }

}
