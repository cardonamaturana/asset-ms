package com.cardonamaturana.assetms.infrastructure.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class FurnitureController {
//
//  private final AssigneeSaveApplication assigneeSaveApplication;
//  private final EmployeeGetAllApplication employeeGetAllApplication;
//  private final EmployeeGetAllByCompanyIdApplication employeeGetAllByCompanyIdApplication;
//  private final AssigneeUpdateApplication assigneeUpdateApplication;
//  private final EmployeeRequestMapper employeeRequestMapper;
//  private final EmployeeUpdateRequestMapper employeeUpdateRequestMapper;
//  private final EmployeeResponseMapper employeeResponseMapper;
//  private final AssigneeResponseMapper assigneeResponseMapper;
//
//  @PostMapping()
//  @Operation(summary = "Create employee", description = "Create a new employee into database", responses = {
//      @ApiResponse(responseCode = "200", description = "create successful"),
//      @ApiResponse(responseCode = "400", description = "error in any field of JSON request")})
//  public Mono<ResponseEntity<EmployeeResponse>> saveEmployee(
//      @RequestBody EmployeeRequest employeeRequest) {
//    return assigneeSaveApplication.save(employeeRequestMapper.toEntity(employeeRequest))
//        .map(saved -> ResponseEntity.status(
//            HttpStatus.CREATED).body(employeeResponseMapper.toDto((Employee) saved)));
//  }
//
//  @PutMapping()
//  @Operation(summary = "Update Employee Responsible", description = "Update a existent employee into database", responses = {
//      @ApiResponse(responseCode = "200", description = "Updated successfully"),
//      @ApiResponse(responseCode = "400", description = "Error in any field of JSON request")})
//  public Mono<ResponseEntity<EmployeeResponse>> updateEmployee(
//      @RequestBody EmployeeUpdateRequest employeeUpdateRequest) {
//    return assigneeUpdateApplication.update(
//            employeeUpdateRequestMapper.toEntity(employeeUpdateRequest))
//        .map(updated -> ResponseEntity.status(
//            HttpStatus.OK).body(employeeResponseMapper.toDto((Employee) updated)));
//  }
//
//
//  @GetMapping()
//  @Operation(summary = "Get all employee", description = "Obtain all register for employee", responses = {
//      @ApiResponse(responseCode = "200", description = "obtained successfully"),
//      @ApiResponse(responseCode = "500", description = "error in response")})
//  @ResponseStatus(HttpStatus.OK)
//  public Flux<AssigneeResponse> getAllEmployee() {
//    return employeeGetAllApplication.getAll().map(assigneeResponseMapper::toDto);
//  }
//
//  @GetMapping("/{companyId}")
//  @Operation(summary = "Get employees for status id", description = "Obtain all employees registered by companyId", responses = {
//      @ApiResponse(responseCode = "200", description = "obtained successfully"),
//      @ApiResponse(responseCode = "500", description = "error in response")})
//  @ResponseStatus(HttpStatus.OK)
//  public Flux<AssigneeResponse> getAllEmployeesByCompanyId(@PathVariable() String companyId) {
//    return employeeGetAllByCompanyIdApplication.getAll(companyId)
//        .map(assigneeResponseMapper::toDto);
//  }

}
