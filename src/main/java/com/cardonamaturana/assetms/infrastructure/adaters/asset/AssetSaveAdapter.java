package com.cardonamaturana.assetms.infrastructure.adaters.asset;

import com.cardonamaturana.assetms.domain.entity.Asset;
import com.cardonamaturana.assetms.domain.service.asset.AssetSaveService;
import com.cardonamaturana.assetms.infrastructure.repository.Asset.AssetMapper;
import com.cardonamaturana.assetms.infrastructure.repository.Asset.AssetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AssetSaveAdapter implements AssetSaveService {

  private final AssetRepository assetRepository;
  private final AssetMapper assetMapper;

  @Override
  public Mono<Asset> save(Asset asset) {
    return assetRepository.save(assetMapper.toDto(asset))
        .map(assetMapper::toEntity);
  }
}
