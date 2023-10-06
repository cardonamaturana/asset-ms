package com.cardonamaturana.assetms.infrastructure.api.mapper.status;

import com.cardonamaturana.assetms.domain.entity.Status;
import com.cardonamaturana.assetms.infrastructure.api.dto.request.StatusRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface StatusRequestMapper {

  Status toEntity(StatusRequest statusRequest);

}
