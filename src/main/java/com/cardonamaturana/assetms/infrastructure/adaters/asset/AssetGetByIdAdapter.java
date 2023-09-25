package com.cardonamaturana.assetms.infrastructure.adaters.asset;

import com.cardonamaturana.assetms.domain.entity.Asset;
import com.cardonamaturana.assetms.domain.service.asset.AssetGetByIdService;
import com.cardonamaturana.assetms.infrastructure.repository.Asset.AssetMapper;
import com.cardonamaturana.assetms.infrastructure.repository.Asset.AssetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AssetGetByIdAdapter implements AssetGetByIdService {

  private final AssetRepository assetRepository;
  private final AssetMapper assetMapper;

  @Override
  public Mono<Asset> get(Mono<String> id) {
    return assetRepository.findById(id).map(assetMapper::toEntity);
  }
}
