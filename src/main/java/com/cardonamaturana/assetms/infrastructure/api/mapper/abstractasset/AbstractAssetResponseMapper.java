package com.cardonamaturana.assetms.infrastructure.api.mapper.abstractasset;

import com.cardonamaturana.assetms.domain.entity.AbstractAsset;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.AbstractAssetResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AbstractAssetResponseMapper {

  @Mapping(source = "assigneeId" , target = "assigneeResponse.id")
  AbstractAssetResponse toDto(AbstractAsset technological);

}
