package com.edstem.product.inventory.service;

import com.edstem.product.inventory.Entity.Promo_Codes;
import com.edstem.product.inventory.repository.Promo_Codes_Repository;

public class Promo_Codes_Service {
	private Promo_Codes_Repository promo_Codes_Repository;

	public Promo_Codes_Service(Promo_Codes_Repository promo_Codes_Repository) {
		this.promo_Codes_Repository = promo_Codes_Repository;
	}
	
	public Double getPromoCodeDiscount(String promoCode) {
		Promo_Codes promo_Codes = promo_Codes_Repository.findById(promoCode).orElseThrow();
		if(promo_Codes.getActive())
			return promo_Codes.getDiscount_percentage();
		else
			return 0.0;
	}
}
