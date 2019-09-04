package com.respo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByFirstName(String firstName);

}