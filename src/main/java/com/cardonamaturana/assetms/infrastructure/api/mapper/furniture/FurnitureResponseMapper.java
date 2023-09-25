package com.cardonamaturana.assetms.infrastructure.api.mapper.furniture;

import com.cardonamaturana.assetms.domain.entity.Furniture;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.FurnitureResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FurnitureResponseMapper {

  FurnitureResponse toDto(Furniture furniture);

}
