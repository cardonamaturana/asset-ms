package com.cardonamaturana.assetms.domain.service.asset;

import com.cardonamaturana.assetms.domain.entity.Asset;
import reactor.core.publisher.Mono;

public interface AssetSaveService {

  Mono<Asset> save(Asset asset);

}
