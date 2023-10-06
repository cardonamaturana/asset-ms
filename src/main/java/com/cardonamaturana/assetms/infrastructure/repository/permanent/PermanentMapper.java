package com.cardonamaturana.assetms.infrastructure.repository.permanent;

import com.cardonamaturana.assetms.domain.entity.Permanent;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermanentMapper {

  Permanent toEntity(PermanentDto permanentDto);

  PermanentDto toDto(Permanent permanent);

}
