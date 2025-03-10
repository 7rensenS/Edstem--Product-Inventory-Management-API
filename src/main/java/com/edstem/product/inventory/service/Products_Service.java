package com.edstem.product.inventory.service;

import org.springframework.stereotype.Service;

import com.edstem.product.inventory.Entity.Products;
import com.edstem.product.inventory.repository.Products_Repository;

@Service
public class Products_Service {
	private Products_Repository repository;
	
	public Products_Service(Products_Repository repository) {
		this.repository=repository;
	}
	
	public Double getBasePrice(String productId) {
		Products products =repository.findById(productId).orElseThrow();
		return products.getBase_price();
	}
}
