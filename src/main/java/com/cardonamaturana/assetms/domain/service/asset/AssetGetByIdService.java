package com.cardonamaturana.assetms.domain.service.asset;

import com.cardonamaturana.assetms.domain.entity.Asset;
import reactor.core.publisher.Mono;

public interface AssetGetByIdService {

  Mono<Asset> get(Mono<String> id);

}
