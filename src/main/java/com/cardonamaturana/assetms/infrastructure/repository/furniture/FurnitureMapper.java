package com.cardonamaturana.assetms.infrastructure.repository.furniture;

import com.cardonamaturana.assetms.domain.entity.Furniture;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FurnitureMapper {

  Furniture toEntity(FurnitureDto furnitureDto);

  FurnitureDto toDto(Furniture furniture);

}
