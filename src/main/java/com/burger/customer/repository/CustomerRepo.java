package com.burger.customer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.burger.customer.model.customer;

@Repository
public interface CustomerRepo extends MongoRepository<customer, String> {

}
