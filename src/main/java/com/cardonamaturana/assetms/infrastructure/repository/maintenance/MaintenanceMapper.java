package com.cardonamaturana.assetms.infrastructure.repository.maintenance;

import com.cardonamaturana.assetms.domain.entity.Maintenance;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MaintenanceMapper {

  Maintenance toEntity(MaintenanceDto maintenanceDto);

  MaintenanceDto toDto(Maintenance maintenance);

}
