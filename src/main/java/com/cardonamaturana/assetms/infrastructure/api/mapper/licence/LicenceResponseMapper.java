package com.cardonamaturana.assetms.infrastructure.api.mapper.licence;

import com.cardonamaturana.assetms.domain.entity.Licence;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.LicenceResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LicenceResponseMapper {

  LicenceResponse toDto(Licence licence);

}
