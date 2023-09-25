package com.cardonamaturana.assetms.infrastructure.api.mapper.technological;

import com.cardonamaturana.assetms.domain.entity.Technological;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.TechnologicalResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TechnologicalResponseMapper {

  TechnologicalResponse toDto(Technological technological);

}
