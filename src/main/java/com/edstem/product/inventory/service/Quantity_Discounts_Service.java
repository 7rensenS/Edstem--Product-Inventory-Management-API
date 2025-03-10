package com.edstem.product.inventory.service;

import org.springframework.stereotype.Service;

import com.edstem.product.inventory.Entity.Quantity_Discounts;
import com.edstem.product.inventory.repository.Quantity_Discounts_Repository;

@Service
public class Quantity_Discounts_Service {

	private Quantity_Discounts_Repository repository;

	Quantity_Discounts_Service(Quantity_Discounts_Repository repository) {
		this.repository = repository;
	}

	public Double getQuantityDiscount(int quantity) {
		Quantity_Discounts quantity_Discounts = repository.findByMin_Quantity(quantity);
		return  quantity_Discounts.getDiscount_percentage();
	}
}
