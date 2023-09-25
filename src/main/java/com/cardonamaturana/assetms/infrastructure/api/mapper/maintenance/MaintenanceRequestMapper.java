package com.cardonamaturana.assetms.infrastructure.api.mapper.maintenance;

import com.cardonamaturana.assetms.domain.entity.Maintenance;
import com.cardonamaturana.assetms.infrastructure.api.dto.request.MaintenanceRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MaintenanceRequestMapper {

  @Mapping(source = "statusId", target = "status.id")
  Maintenance toEntity(MaintenanceRequest maintenanceRequest);

}
