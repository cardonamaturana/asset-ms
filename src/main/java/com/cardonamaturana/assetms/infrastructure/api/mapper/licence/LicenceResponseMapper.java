package com.cardonamaturana.assetms.infrastructure.api.mapper.licence;

import com.cardonamaturana.assetms.domain.entity.Licence;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.LicenceResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LicenceResponseMapper {

  @Mapping(source = "assigneeId" , target = "assigneeResponse.id")
  LicenceResponse toDto(Licence licence);

}
