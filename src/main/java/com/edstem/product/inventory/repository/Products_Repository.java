package com.edstem.product.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.edstem.product.inventory.Entity.Products;

public interface Products_Repository extends CrudRepository<Products, String> {

}
