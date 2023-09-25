package com.cardonamaturana.assetms.infrastructure.api.mapper.monitor;

import com.cardonamaturana.assetms.domain.entity.Monitor;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.MonitorResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MonitorResponseMapper {

  MonitorResponse toDto(Monitor monitor);

}
