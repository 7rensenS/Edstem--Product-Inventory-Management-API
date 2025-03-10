package com.edstem.product.inventory.repository;

import org.springframework.data.repository.CrudRepository;

import com.edstem.product.inventory.Entity.Quantity_Discounts;

public interface Quantity_Discounts_Repository extends CrudRepository<Quantity_Discounts, Long>{

	Quantity_Discounts findByMin_Quantity(int quantity);

}
