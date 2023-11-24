package com.javacompentency.Calculator.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javacompentency.Calculator.model.RequestResponseCache;

public interface CalculatorDao extends MongoRepository<RequestResponseCache, String>{

}
