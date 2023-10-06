package com.cardonamaturana.assetms.application.asset;

import com.cardonamaturana.assetms.application.asset.process.AssetProcess;
import com.cardonamaturana.assetms.domain.entity.Asset;
import com.cardonamaturana.assetms.domain.service.asset.AssetGetByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AssetGetByIdApplication {

  private final AssetGetByIdService assetGetByIdService;
  private final AssetProcess assetProcess;

  public Mono<Asset> get(Mono<String> assigneeId) {
    return assetGetByIdService.get(assigneeId)
        .flatMap(assignee -> assetProcess.processForGetAssignee(assignee));
  }

}
