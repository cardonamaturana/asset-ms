package com.cardonamaturana.assetms.infrastructure.client;

import com.cardonamaturana.assetms.infrastructure.client.response.AssigneeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

@FeignClient(url = "${feign-clients.assignee.url}", name = "assignee-ms")
public interface AssigneeClient {

  @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
  Flux<AssigneeResponse> getAllAssignee();

}