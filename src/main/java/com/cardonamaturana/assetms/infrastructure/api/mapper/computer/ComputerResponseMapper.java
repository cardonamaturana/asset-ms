package com.cardonamaturana.assetms.infrastructure.api.mapper.computer;

import com.cardonamaturana.assetms.domain.entity.Computer;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.ComputerResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComputerResponseMapper {

  ComputerResponse toDto(Computer technological);

}
