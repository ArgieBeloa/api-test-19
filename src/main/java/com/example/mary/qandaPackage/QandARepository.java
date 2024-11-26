package com.example.mary.qandaPackage;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface QandARepository  extends MongoRepository<QandAModel, String> {

    Optional<QandAModel> findBySubjectId(String subjectId); // Custom query method

}
