package com.cardonamaturana.assetms.infrastructure.client.mapper;

import com.cardonamaturana.assetms.infrastructure.client.response.PragmaticoResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PragmaticoResponseMapper {

  PragmaticoResponse toDto(PragmaticoResponse pragmatico);

}
