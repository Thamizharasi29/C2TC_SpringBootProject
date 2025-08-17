package com.tnsif.spring__dat__jpa__mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.spring__dat__jpa__mapping.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
