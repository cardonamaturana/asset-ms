package com.cardonamaturana.assetms.application.asset;

import com.cardonamaturana.assetms.application.asset.process.AssetProcess;
import com.cardonamaturana.assetms.domain.entity.Asset;
import com.cardonamaturana.assetms.domain.service.asset.AssetGetAllService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class AssetGetAllApplication {

  private final AssetGetAllService assetGetAllService;
  private final AssetProcess assetProcess;

  public Flux<Asset> getAll() {
    return assetGetAllService.getAll()
        .flatMap(result -> assetProcess.processForGetAll(result));
  }

}
