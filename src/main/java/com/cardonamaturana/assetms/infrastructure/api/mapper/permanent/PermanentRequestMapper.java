package com.cardonamaturana.assetms.infrastructure.api.mapper.permanent;

import com.cardonamaturana.assetms.domain.entity.Permanent;
import com.cardonamaturana.assetms.infrastructure.api.dto.request.PermanentRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PermanentRequestMapper {

  @Mapping(source = "statusId", target = "status.id")
  Permanent toEntity(PermanentRequest permanentRequest);

}
