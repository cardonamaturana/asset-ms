package com.cardonamaturana.assetms.infrastructure.api.mapper.abstractasset;

import com.cardonamaturana.assetms.domain.entity.AbstractAsset;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.AbstractAssetResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AbstractAssetResponseMapper {

  AbstractAssetResponse toDto(AbstractAsset technological);

}
