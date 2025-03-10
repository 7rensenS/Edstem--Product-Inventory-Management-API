package com.edstem.product.inventory.Entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_types")
public class User_Types {

	@Id
	private String type;
	@Column(nullable = false)
	private Double discount_percentage;

	public User_Types() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getDiscount_percentage() {
		return discount_percentage;
	}

	public void setDiscount_percentage(Double discount_percentage) {
		this.discount_percentage = discount_percentage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(discount_percentage, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User_Types other = (User_Types) obj;
		return Objects.equals(discount_percentage, other.discount_percentage) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "User_Types [type=" + type + ", discount_percentage=" + discount_percentage + "]";
	}

}
