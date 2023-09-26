package com.cardonamaturana.assetms.infrastructure.api.mapper.maintenance;

import com.cardonamaturana.assetms.domain.entity.Maintenance;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.MaintenanceResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MaintenanceResponseMapper {

  @Mapping(source = "assigneeId" , target = "assigneeResponse.id")
  MaintenanceResponse toDto(Maintenance maintenance);

}
