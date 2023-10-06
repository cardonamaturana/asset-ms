package com.cardonamaturana.assetms.application.status;

import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.domain.service.status.StatusSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StatusSaveApplication {

  private final StatusSaveService statusSaveService;

  public Mono<Status> save(Status status) {
    return statusSaveService.save(status);
  }

}
