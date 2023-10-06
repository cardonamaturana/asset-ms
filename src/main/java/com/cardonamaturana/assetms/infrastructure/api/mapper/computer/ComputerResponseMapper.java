package com.cardonamaturana.assetms.infrastructure.api.mapper.computer;

import com.cardonamaturana.assetms.domain.entity.Computer;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.ComputerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ComputerResponseMapper {

  @Mapping(source = "assigneeId" , target = "assigneeResponse.id")
  ComputerResponse toDto(Computer technological);

}
