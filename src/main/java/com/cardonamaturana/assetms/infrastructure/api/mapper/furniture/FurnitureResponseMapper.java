package com.cardonamaturana.assetms.infrastructure.api.mapper.furniture;

import com.cardonamaturana.assetms.domain.entity.Furniture;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.FurnitureResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FurnitureResponseMapper {

  @Mapping(source = "assigneeId" , target = "assigneeResponse.id")
  FurnitureResponse toDto(Furniture furniture);

}
