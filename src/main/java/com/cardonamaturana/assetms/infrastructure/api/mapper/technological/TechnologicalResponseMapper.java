package com.cardonamaturana.assetms.infrastructure.api.mapper.technological;

import com.cardonamaturana.assetms.domain.entity.Technological;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.TechnologicalResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TechnologicalResponseMapper {

  @Mapping(source = "assigneeId", target = "assigneeResponse.id")
  TechnologicalResponse toDto(Technological technological);

}
