package com.cardonamaturana.assetms.domain.service.status;

import com.cardonamaturana.assetms.domain.entity.Status;
import reactor.core.publisher.Mono;

public interface StatusSaveService {

  Mono<Status> save(Status status);

}
