package com.cardonamaturana.assetms.domain.service.asset;

import com.cardonamaturana.assetms.domain.entity.Asset;
import reactor.core.publisher.Flux;

public interface AssetGetAllService {

  Flux<Asset> getAll();

}
