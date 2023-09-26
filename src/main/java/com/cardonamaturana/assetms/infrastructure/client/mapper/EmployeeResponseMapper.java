package com.cardonamaturana.assetms.infrastructure.client.mapper;

import com.cardonamaturana.assetms.infrastructure.client.response.EmployeeResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeResponseMapper {

  EmployeeResponse toDto(EmployeeResponse employee);

}
