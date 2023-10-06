package com.cardonamaturana.assetms.infrastructure.api.mapper.status;

import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.StatusResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StatusResponseMapper {

  StatusResponse toDto(Status status);

}
