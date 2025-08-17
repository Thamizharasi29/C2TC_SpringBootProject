package com.tnsif.spring__dat__jpa__mapping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tnsif.spring__dat__jpa__mapping.dto.OrderResponse;
import com.tnsif.spring__dat__jpa__mapping.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	@Query("SELECT c FROM Customer c")
	List<Customer> findAllCustomers();

	List<OrderResponse> getJoinInformation();

	@SuppressWarnings("unchecked")
	Customer save(Customer customer);

	<S> Customer save(S customer);

}
