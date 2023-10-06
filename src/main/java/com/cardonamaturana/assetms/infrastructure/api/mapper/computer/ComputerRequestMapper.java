package com.cardonamaturana.assetms.infrastructure.api.mapper.computer;

import com.cardonamaturana.assetms.domain.entity.Computer;
import com.cardonamaturana.assetms.infrastructure.api.dto.request.ComputerRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ComputerRequestMapper {

  @Mapping(source = "statusId", target = "status.id")
  Computer toEntity(ComputerRequest computerRequest);

}
