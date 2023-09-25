package com.cardonamaturana.assetms.infrastructure.api.mapper.maintenance;

import com.cardonamaturana.assetms.domain.entity.Maintenance;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.MaintenanceResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MaintenanceResponseMapper {

  MaintenanceResponse toDto(Maintenance maintenance);

}
