package com.cardonamaturana.assetms.infrastructure.repository.computer;

import com.cardonamaturana.assetms.domain.entity.Computer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ComputerMapper {

  Computer toEntity(ComputerDto computerDto);

  ComputerDto toDto(Computer computer);

}
