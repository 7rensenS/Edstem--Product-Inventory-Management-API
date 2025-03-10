package com.edstem.product.inventory.Entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "quantity_discounts")
public class Quantity_Discounts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private Integer min_quantity;
	@Column(nullable = false)
	private Double discount_percentage;

	public Quantity_Discounts() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getMin_quantity() {
		return min_quantity;
	}

	public void setMin_quantity(Integer min_quantity) {
		this.min_quantity = min_quantity;
	}

	public Double getDiscount_percentage() {
		return discount_percentage;
	}

	public void setDiscount_percentage(Double discount_percentage) {
		this.discount_percentage = discount_percentage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(discount_percentage, id, min_quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quantity_Discounts other = (Quantity_Discounts) obj;
		return Objects.equals(discount_percentage, other.discount_percentage) && Objects.equals(id, other.id)
				&& Objects.equals(min_quantity, other.min_quantity);
	}

	@Override
	public String toString() {
		return "Quantity_Discounts [id=" + id + ", min_quantity=" + min_quantity + ", discount_percentage="
				+ discount_percentage + "]";
	}

}
