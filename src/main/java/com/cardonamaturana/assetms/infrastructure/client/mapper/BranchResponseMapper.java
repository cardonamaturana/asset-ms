package com.cardonamaturana.assetms.infrastructure.client.mapper;

import com.cardonamaturana.assetms.infrastructure.client.response.BranchResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BranchResponseMapper {

  BranchResponse toDto(BranchResponse branch);

}
