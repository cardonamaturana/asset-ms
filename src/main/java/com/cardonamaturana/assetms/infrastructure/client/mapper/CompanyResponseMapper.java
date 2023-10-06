package com.cardonamaturana.assetms.infrastructure.client.mapper;

import com.cardonamaturana.assetms.infrastructure.client.response.CompanyResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CompanyResponseMapper {


  CompanyResponse toDto(CompanyResponse company);

}
