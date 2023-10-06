package com.cardonamaturana.assetms.infrastructure.adaters.status;

import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.domain.service.status.StatusSaveService;
import com.cardonamaturana.assetms.infrastructure.repository.status.StatusMapper;
import com.cardonamaturana.assetms.infrastructure.repository.status.StatusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StatusSaveAdapter implements StatusSaveService {

  private final StatusRepository statusRepository;
  private final StatusMapper statusMapper;

  @Override
  public Mono<Status> save(Status status) {
    return statusRepository.save(statusMapper.toDto(status))
        .map(statusMapper::toEntity);
  }
}
