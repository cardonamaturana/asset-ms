package com.cardonamaturana.assetms.infrastructure.api.mapper.monitor;

import com.cardonamaturana.assetms.domain.entity.Monitor;
import com.cardonamaturana.assetms.infrastructure.api.dto.request.MonitorRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MonitorRequestMapper {

  @Mapping(source = "statusId", target = "status.id")
  Monitor toEntity(MonitorRequest monitorRequest);

}
