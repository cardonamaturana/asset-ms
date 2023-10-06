package com.cardonamaturana.assetms.application.asset;

import com.cardonamaturana.assetms.application.asset.process.AssetProcess;
import com.cardonamaturana.assetms.domain.entity.Asset;
import com.cardonamaturana.assetms.domain.service.asset.AssetSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AssetSaveApplication {

  private final AssetSaveService assetSaveService;
  private final AssetProcess assetProcess;

  public Mono<Asset> save(Asset asset) {
    return assetProcess.processForSave(asset).flatMap(assetSaveService::save);
  }

}
