package com.cardonamaturana.assetms.infrastructure.repository.status;

import com.cardonamaturana.assetms.domain.entity.Status;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StatusMapper {

  Status toEntity(StatusDto statusDto);

  StatusDto toDto(Status status);

}
