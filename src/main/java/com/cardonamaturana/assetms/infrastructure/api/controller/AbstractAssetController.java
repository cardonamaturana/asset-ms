package com.cardonamaturana.assetms.infrastructure.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pragmatico")
@RequiredArgsConstructor
public class AbstractAssetController {
//
//  private final AssigneeSaveApplication assigneeSaveApplication;
//  private final AssigneeUpdateApplication assigneeUpdateApplication;
//  private final PragmaticoRequestMapper pragmaticoRequestMapper;
//  private final PragmaticoUpdateRequestMapper pragmaticoUpdateRequestMapper;
//  private final PragmaticoResponseMapper pragmaticoResponseMapper;
//
//  @PostMapping()
//  @Operation(summary = "Create Pragmatic Responsible", description = "Create a new pragmatic into database", responses = {
//      @ApiResponse(responseCode = "201", description = "Created successfully"),
//      @ApiResponse(responseCode = "400", description = "Error in any field of JSON request")})
//  public Mono<ResponseEntity<PragmaticoResponse>> savePragmatico(
//      @RequestBody PragmaticoSaveRequest pragmaticoSaveRequest) {
//    return assigneeSaveApplication.save(pragmaticoRequestMapper.toEntity(pragmaticoSaveRequest))
//        .map(saved -> ResponseEntity.status(
//            HttpStatus.CREATED).body(pragmaticoResponseMapper.toDto((Pragmatico) saved)));
//  }
//
//
//  @PutMapping()
//  @Operation(summary = "Update Pragmatic Responsible", description = "Update a existent pragmatic into database", responses = {
//      @ApiResponse(responseCode = "200", description = "Updated successfully"),
//      @ApiResponse(responseCode = "400", description = "Error in any field of JSON request")})
//  public Mono<ResponseEntity<PragmaticoResponse>> updatePragmatico(
//      @RequestBody PragmaticoUpdateRequest pragmaticoUpdateRequest) {
//    return assigneeUpdateApplication.update(
//            pragmaticoUpdateRequestMapper.toEntity(pragmaticoUpdateRequest))
//        .map(updated -> ResponseEntity.status(
//            HttpStatus.OK).body(pragmaticoResponseMapper.toDto((Pragmatico) updated)));
//  }

}
