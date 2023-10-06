package com.cardonamaturana.assetms.infrastructure.api.mapper.abstractasset;

import com.cardonamaturana.assetms.domain.entity.AbstractAsset;
import com.cardonamaturana.assetms.infrastructure.api.dto.request.AbstractAssetRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AbstractAssetRequestMapper {

  @Mapping(source = "statusId", target = "status.id")
  AbstractAsset toEntity(AbstractAssetRequest abstractAssetRequest);

}
