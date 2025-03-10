package com.edstem.product.inventory.service;

import org.springframework.stereotype.Service;

import com.edstem.product.inventory.Entity.User_Types;
import com.edstem.product.inventory.repository.User_Types_Repository;

@Service
public class User_Types_Service {
	private User_Types_Repository types_Repository;

	public User_Types_Service(User_Types_Repository types_Repository) {
		this.types_Repository = types_Repository;
	}

	public Double getUserTypeDiscount(String userType) {
		User_Types user_Types = types_Repository.findById(userType).orElseThrow();
		return user_Types.getDiscount_percentage();
	}

	
	
	
}
