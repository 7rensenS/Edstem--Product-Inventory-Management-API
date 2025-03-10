package com.edstem.product.inventory.Entity;

public class AppliedDiscounts {
	private String type;
	private Double percentage;

	AppliedDiscounts() {
	}

	public AppliedDiscounts(String type, Double percentage) {
		super();
		this.type = type;
		this.percentage = percentage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "AppliedDiscounts [type=" + type + ", percentage=" + percentage + "]";
	}

}
