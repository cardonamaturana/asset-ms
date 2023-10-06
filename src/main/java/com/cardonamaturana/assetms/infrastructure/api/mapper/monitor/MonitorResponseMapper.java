package com.cardonamaturana.assetms.infrastructure.api.mapper.monitor;

import com.cardonamaturana.assetms.domain.entity.Monitor;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.MonitorResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MonitorResponseMapper {

  @Mapping(source = "assigneeId" , target = "assigneeResponse.id")
  MonitorResponse toDto(Monitor monitor);

}
