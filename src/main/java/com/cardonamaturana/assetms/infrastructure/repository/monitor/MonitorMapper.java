package com.cardonamaturana.assetms.infrastructure.repository.monitor;

import com.cardonamaturana.assetms.domain.entity.Monitor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MonitorMapper {

  Monitor toEntity(MonitorDto monitorDto);

  MonitorDto toDto(Monitor monitor);

}
