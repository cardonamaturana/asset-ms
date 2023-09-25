package com.cardonamaturana.assetms.infrastructure.api.mapper.permanent;

import com.cardonamaturana.assetms.domain.entity.Permanent;
import com.cardonamaturana.assetms.infrastructure.api.dto.response.PermanentResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermanentResponseMapper {

  PermanentResponse toDto(Permanent permanent);

}
