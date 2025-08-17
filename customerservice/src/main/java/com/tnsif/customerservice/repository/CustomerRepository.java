package com.tnsif.customerservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.ErrorResponse;

import com.tnsif.customerservice.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	List<ErrorResponse> getJoinInformation();

	<S> Customer save(Iterable<S> customer);

}

