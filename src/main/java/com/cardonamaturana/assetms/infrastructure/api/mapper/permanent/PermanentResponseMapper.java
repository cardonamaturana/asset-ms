package com.cardonamaturana.assetms.infrastructure.api.mapper.permanent;

import com.cardonamaturana.assetms.domain.entity.Permanent;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.PermanentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PermanentResponseMapper {

  @Mapping(source = "assigneeId" , target = "assigneeResponse.id")
  PermanentResponse toDto(Permanent permanent);

}
