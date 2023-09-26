package com.cardonamaturana.assetms.infrastructure.client.mapper;

import com.cardonamaturana.assetms.infrastructure.client.response.ContributorResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContributorResponseMapper {

  ContributorResponse toDto(ContributorResponse contributor);

}
