package com.cardonamaturana.assetms.infrastructure.repository.abstractasset;

import com.cardonamaturana.assetms.domain.entity.AbstractAsset;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AbstractAssetMapper {

  AbstractAsset toEntity(AbstractAssetDto abstractAssetDto);

  AbstractAssetDto toDto(AbstractAsset abstractAsset);

}
