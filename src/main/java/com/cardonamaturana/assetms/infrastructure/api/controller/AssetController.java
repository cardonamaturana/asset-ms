package com.cardonamaturana.assetms.infrastructure.api.controller;

import com.cardonamaturana.assetms.application.asset.AssetGetAllApplication;
import com.cardonamaturana.assetms.application.asset.AssetGetByIdApplication;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.AssetResponse;
import com.cardonamaturana.assetms.infrastructure.api.mapper.asset.AssetResponseMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/asset")
@RequiredArgsConstructor
public class AssetController {


  private final AssetGetAllApplication assetGetAllApplication;
  private final AssetGetByIdApplication assetGetByIdApplication;
  private final AssetResponseMapper assetResponseMapper;


  @GetMapping()
  @Operation(summary = "Get all assets", description = "Obtain all register for asset", responses = {
      @ApiResponse(responseCode = "200", description = "obtained successfully"),
      @ApiResponse(responseCode = "500", description = "error in response")})
  @ResponseStatus(HttpStatus.OK)
  public Flux<AssetResponse> getAllAsset() {
    return assetGetAllApplication.getAll().map(assetResponseMapper::toDto);
  }

  @GetMapping("/id")
  @Operation(summary = "Get asset for id ", description = "Obtain one register of asset for id", responses = {
      @ApiResponse(responseCode = "200", description = "obtained successfully"),
      @ApiResponse(responseCode = "500", description = "error in response")})
  @ResponseStatus(HttpStatus.OK)
  public Mono<AssetResponse> getAssigneeById(@RequestParam("assetId") String assetId) {
    return assetGetByIdApplication.get(Mono.just(assetId))
        .map(assetResponseMapper::toDto);
  }


}
