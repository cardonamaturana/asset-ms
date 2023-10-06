package com.cardonamaturana.assetms.infrastructure.api.mapper.furniture;

import com.cardonamaturana.assetms.domain.entity.Furniture;
import com.cardonamaturana.assetms.infrastructure.api.dto.request.FurnitureRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FurnitureRequestMapper {

  @Mapping(source = "statusId", target = "status.id")
  Furniture toEntity(FurnitureRequest furnitureRequest);

}
