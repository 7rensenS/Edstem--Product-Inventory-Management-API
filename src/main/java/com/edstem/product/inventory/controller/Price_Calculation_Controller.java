package com.edstem.product.inventory.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edstem.product.inventory.Entity.Price_Calculation;
import com.edstem.product.inventory.Entity.Product_Price;
import com.edstem.product.inventory.service.Price_Calculation_Service;

@RestController
@RequestMapping("/api/products")
public class Price_Calculation_Controller {

	private Price_Calculation_Service service;
	
	Price_Calculation_Controller(){}

	Price_Calculation_Controller(Price_Calculation_Service service) {
		this.service = service;
	}
	
	@PostMapping("/price-calculation")
	public Product_Price priceCalculation(@RequestBody Price_Calculation price_Calculation) {
		return service.priceCalculation(price_Calculation);
	}

}
