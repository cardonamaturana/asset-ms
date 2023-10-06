package com.cardonamaturana.assetms.application.asset.process;


import com.cardonamaturana.assetms.domain.entity.Asset;
import com.cardonamaturana.assetms.domain.service.asset.AssetGetByIdService;
import com.cardonamaturana.assetms.domain.service.status.StatusGetByIdService;
import com.cardonamaturana.assetms.shared.exceptions.base.asset.StatusNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class AssetProcess {

  private final AssetGetByIdService assetGetByIdService;
  private final StatusGetByIdService statusGetByIdService;

  public Mono<Asset> processForSave(Asset asset) {
    return addStatus(asset);
  }

  public Mono<Asset> processForGetAssignee(Asset asset) {
    return addStatus(asset);
  }

  public Mono<Asset> processForGetAll(Asset asset) {
    return addStatus(asset);
  }


  private Mono<Asset> addStatus(Asset asset) {
    return statusGetByIdService.get(Mono.just((asset).getStatus().getId()))
        .flatMap(statusResult -> {
          asset.setStatus(statusResult);
          return Mono.just(asset);
        }).switchIfEmpty(Mono.error(new StatusNotFoundException()));
  }

}