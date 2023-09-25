package com.cardonamaturana.assetms.infrastructure.adaters.status;

import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.domain.service.status.StatusGetByIdService;
import com.cardonamaturana.assetms.infrastructure.repository.status.StatusMapper;
import com.cardonamaturana.assetms.infrastructure.repository.status.StatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StatusGetByIdAdapter implements StatusGetByIdService {

  private final StatusRepository statusRepository;
  private final StatusMapper statusMapper;

  @Override
  public Mono<Status> get(Mono<String> id) {
    return statusRepository.findById(id).map(statusMapper::toEntity);
  }
}
