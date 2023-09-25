package com.cardonamaturana.assetms.infrastructure.repository.Asset;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.Param;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AssetRepository extends ReactiveMongoRepository<AssetDto, String> {


  @Query("{ 'personalEmail': ?0, '_class': {'$in': ['EmployeeDto', 'PragmaticoDto', 'ContributorDto'] }}")
  Mono<AssetDto> getByEmail(@Param("employeeEmail") Mono<String> employeeEmail);

  @Query("{ 'status._id': ?0, '_class': {'$in': ['EmployeeDto', 'PragmaticoDto', 'ContributorDto'] } }")
  Flux<AssetDto> getByCompanyId(ObjectId companyId);


}
