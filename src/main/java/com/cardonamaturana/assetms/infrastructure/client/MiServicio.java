package com.cardonamaturana.assetms.infrastructure.client;

import com.cardonamaturana.assetms.infrastructure.client.response.AssigneeResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class MiServicio {

  private final WebClient webClient;

  public MiServicio(WebClient.Builder webClientBuilder) {
    this.webClient = webClientBuilder.baseUrl("http://127.0.0.1:8081/assignee").build();
  }

    public Mono<AssigneeResponse> obtenerAssigneePorId(String assigneId) {
        return webClient.get()
            .uri(uriBuilder -> uriBuilder.path("/id")
                .queryParam("assigneeId", assigneId)
                .build())
            .retrieve()
            .bodyToMono(AssigneeResponse.class);
    }

}
