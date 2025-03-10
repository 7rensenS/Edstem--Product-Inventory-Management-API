package com.edstem.product.inventory.Entity;

import java.util.List;

public class Product_Price {

	private String productId;
	private Double originalPrice;
	private Double finalPrice;
	private AppliedDiscounts appliedDiscounts;
	private Double totalSavings;

	public Product_Price() {
	}

	public Product_Price(String productId, Double originalPrice, Double finalPrice, AppliedDiscounts appliedDiscounts,
			Double totalSavings) {
		super();
		this.productId = productId;
		this.originalPrice = originalPrice;
		this.finalPrice = finalPrice;
		this.appliedDiscounts = appliedDiscounts;
		this.totalSavings = totalSavings;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public AppliedDiscounts getAppliedDiscounts() {
		return appliedDiscounts;
	}

	public void setAppliedDiscounts(List<AppliedDiscounts> appliedDiscounts) {
		for (AppliedDiscounts discounts : appliedDiscounts) {
			this.appliedDiscounts = discounts;
		}

	}

	public Double getTotalSavings() {
		return totalSavings;
	}

	public void setTotalSavings(Double totalSavings) {
		this.totalSavings = totalSavings;
	}

	@Override
	public String toString() {
		return "Product_Price [productId=" + productId + ", originalPrice=" + originalPrice + ", finalPrice="
				+ finalPrice + ", appliedDiscounts=" + appliedDiscounts + ", totalSavings=" + totalSavings + "]";
	}

}
