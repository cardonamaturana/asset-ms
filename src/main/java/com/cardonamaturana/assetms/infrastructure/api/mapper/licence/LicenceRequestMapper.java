package com.cardonamaturana.assetms.infrastructure.api.mapper.licence;

import com.cardonamaturana.assetms.domain.entity.Licence;
import com.cardonamaturana.assetms.infrastructure.api.dto.request.LicenceRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LicenceRequestMapper {

  @Mapping(source = "statusId", target = "status.id")
  Licence toEntity(LicenceRequest licenceRequest);

}
