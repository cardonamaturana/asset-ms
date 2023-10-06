package com.cardonamaturana.assetms.infrastructure.api.controller;

import com.cardonamaturana.assetms.application.status.StatusSaveApplication;
import com.cardonamaturana.assetms.infrastructure.api.dto.request.StatusRequest;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.StatusResponse;
import com.cardonamaturana.assetms.infrastructure.api.mapper.status.StatusRequestMapper;
import com.cardonamaturana.assetms.infrastructure.api.mapper.status.StatusResponseMapper;
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
@RequestMapping("/status")
@RequiredArgsConstructor
public class StatusController {

  private final StatusSaveApplication statusSaveApplication;
  private final StatusRequestMapper statusRequestMapper;
  private final StatusResponseMapper statusResponseMapper;


  @PostMapping()
  @Operation(summary = "Create status", description = "Create a new status into database", responses = {
      @ApiResponse(responseCode = "200", description = "create successful"),
      @ApiResponse(responseCode = "400", description = "error in any field of JSON request")})
  public Mono<ResponseEntity<StatusResponse>> saveStatus(
      @RequestBody StatusRequest statusRequest) {
    return statusSaveApplication.save(statusRequestMapper.toEntity(statusRequest))
        .map(saved -> ResponseEntity.status(
                HttpStatus.CREATED)
            .body(statusResponseMapper.toDto(saved)));
  }


}
