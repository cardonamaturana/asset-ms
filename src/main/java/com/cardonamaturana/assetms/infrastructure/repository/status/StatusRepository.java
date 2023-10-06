package com.cardonamaturana.assetms.infrastructure.repository.status;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface StatusRepository extends ReactiveMongoRepository<StatusDto, String> {


}
