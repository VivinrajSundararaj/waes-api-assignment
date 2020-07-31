package com.waes.api.dao;

import com.waes.api.dto.BinaryDataComparison;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Interface that describes a MongoDB repository, Spring Boot will infer the
 * needed methods and beans so we just need to Autowire it
 *
 * @author Vivinraj Sundararaj
 */
public interface BinaryDataRepository extends MongoRepository<BinaryDataComparison, Integer> {

}
