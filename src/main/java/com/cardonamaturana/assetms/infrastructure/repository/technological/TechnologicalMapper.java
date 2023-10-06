package com.cardonamaturana.assetms.infrastructure.repository.technological;

import com.cardonamaturana.assetms.domain.entity.Technological;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TechnologicalMapper {

  Technological toEntity(TechnologicalDto technologicalDto);

  TechnologicalDto toDto(Technological technological);

}
