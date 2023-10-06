package com.cardonamaturana.assetms.infrastructure.adaters.asset;

import com.cardonamaturana.assetms.domain.entity.Asset;
import com.cardonamaturana.assetms.domain.service.asset.AssetGetAllService;
import com.cardonamaturana.assetms.infrastructure.repository.Asset.AssetMapper;
import com.cardonamaturana.assetms.infrastructure.repository.Asset.AssetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Service
public class AssetGetAllAdapter implements AssetGetAllService {

  private final AssetRepository assetRepository;
  private final AssetMapper assetMapper;

  @Override
  public Flux<Asset> getAll() {
    return assetRepository.findAll().map(assetMapper::toEntity);
  }
}
