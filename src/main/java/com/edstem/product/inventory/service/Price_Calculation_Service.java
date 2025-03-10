package com.edstem.product.inventory.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.edstem.product.inventory.Entity.AppliedDiscounts;
import com.edstem.product.inventory.Entity.Price_Calculation;
import com.edstem.product.inventory.Entity.Product_Price;

@Service
public class Price_Calculation_Service {
	private Products_Service products_Service;
	private Quantity_Discounts_Service discounts_Service;
	private Promo_Codes_Service promo_Codes_Service;
	private User_Types_Service types_Service;

	public Price_Calculation_Service(Products_Service products_Service, Quantity_Discounts_Service discounts_Service,
			Promo_Codes_Service promo_Codes_Service, User_Types_Service types_Service) {
		this.products_Service = products_Service;
		this.discounts_Service = discounts_Service;
		this.promo_Codes_Service = promo_Codes_Service;
		this.types_Service = types_Service;
	}

	public Product_Price priceCalculation(Price_Calculation price_Calculation) {
		Product_Price price = new Product_Price();
		List<AppliedDiscounts> appliedDiscounts = new ArrayList<>();

		// SET PRODUCT ID
		price.setProductId(price_Calculation.getProductId());

		// SET ORGINAL PRICE
		Double productPrice = products_Service.getBasePrice(price_Calculation.getProductId());
		price.setOriginalPrice(productPrice);

		// SET APPLIED DISCOUNTS
		Double totalDiscount = 0.0;
		Double quantityDiscount = 0.0;
		Double promocodeDiscount = 0.0;
		Double userTypeDiscount = 0.0;

		// FETCHING QUANTITY WISE DISCOUNT
		if (price_Calculation.getQuantity() > 0) {
			quantityDiscount = discounts_Service.getQuantityDiscount(price_Calculation.getQuantity());
		}

		// FETCHING PROMOCODE DISCOUNT
		if (!(price_Calculation.getPromoCode().isEmpty())) {
			promocodeDiscount = promo_Codes_Service.getPromoCodeDiscount(price_Calculation.getPromoCode());
			appliedDiscounts.add(new AppliedDiscounts(price_Calculation.getPromoCode(), promocodeDiscount));
		}

		// FETCHING USER TYPE DISCOUNT
		if (!(price_Calculation.getUserType().isEmpty())) {
			userTypeDiscount = types_Service.getUserTypeDiscount(price_Calculation.getUserType());
			appliedDiscounts.add(new AppliedDiscounts(price_Calculation.getUserType(), userTypeDiscount));
		}

		totalDiscount = quantityDiscount + promocodeDiscount + userTypeDiscount;

		// SET APPLIED DISCOUNT TO CLASS
		price.setAppliedDiscounts(appliedDiscounts);

		// SET FINAL PRICE
		Double pointPersentageValue = totalDiscount / 100;
		Double final_price = productPrice * pointPersentageValue;
		price.setFinalPrice(final_price);

		// SET TOTAL SAVINGS
		Double totalSavings = productPrice - final_price;
		price.setTotalSavings(totalSavings);

		return price;
	}

}
