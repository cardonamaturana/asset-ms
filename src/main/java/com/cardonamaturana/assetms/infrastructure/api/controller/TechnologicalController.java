package com.cardonamaturana.assetms.infrastructure.api.controller;

import com.cardonamaturana.assetms.application.asset.AssetSaveApplication;
import com.cardonamaturana.assetms.infrastructure.api.dto.request.ComputerRequest;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.AssetResponse;
import com.cardonamaturana.assetms.infrastructure.api.mapper.asset.AssetResponseMapper;
import com.cardonamaturana.assetms.infrastructure.api.mapper.computer.ComputerRequestMapper;
import com.cardonamaturana.assetms.infrastructure.api.mapper.computer.ComputerResponseMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/asset")
@RequiredArgsConstructor
public class TechnologicalController {

  private final AssetSaveApplication assetSaveApplication;
  private final ComputerRequestMapper computerRequestMapper;
  private final ComputerResponseMapper computerResponseMapper;
  private final AssetResponseMapper assetResponseMapper;


  @PostMapping("/technological/computer")
  @Operation(summary = "Create computer", description = "Create a new computer into database", responses = {
      @ApiResponse(responseCode = "200", description = "create successful"),
      @ApiResponse(responseCode = "400", description = "error in any field of JSON request")})
  public Mono<ResponseEntity<AssetResponse>> saveComputer(
      @RequestBody ComputerRequest computerRequest) {
    return assetSaveApplication.save(computerRequestMapper.toEntity(computerRequest))
        .map(saved -> ResponseEntity.status(
                HttpStatus.CREATED)
            .body(assetResponseMapper.toDto(saved)));
  }


}
