package com.cardonamaturana.assetms.infrastructure.repository.licence;

import com.cardonamaturana.assetms.domain.entity.Licence;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LicenceMapper {

  Licence toEntity(LicenceDto licenceDto);

  LicenceDto toDto(Licence licence);

}
