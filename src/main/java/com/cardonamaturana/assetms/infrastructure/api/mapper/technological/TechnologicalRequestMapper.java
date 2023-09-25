package com.cardonamaturana.assetms.infrastructure.api.mapper.technological;

import com.cardonamaturana.assetms.domain.entity.Technological;
import com.cardonamaturana.assetms.infrastructure.api.dto.request.TechnologicalRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TechnologicalRequestMapper {

  @Mapping(source = "statusId", target = "status.id")
  Technological toEntity(TechnologicalRequest technologicalRequest);

}
