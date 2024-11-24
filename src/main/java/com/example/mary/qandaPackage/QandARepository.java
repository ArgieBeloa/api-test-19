package com.example.mary.qandaPackage;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface QandARepository  extends MongoRepository<QandAModel, String> {


}
