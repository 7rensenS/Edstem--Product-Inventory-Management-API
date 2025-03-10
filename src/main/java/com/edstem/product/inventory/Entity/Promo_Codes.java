package com.edstem.product.inventory.Entity;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "promo_codes")
public class Promo_Codes {
	@Id
	private String code;
	@Column(nullable = false)
	private Double discount_percentage;
	@Column
	private Boolean active;
	@Column
	private LocalDate valid_until;

	public Promo_Codes() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getDiscount_percentage() {
		return discount_percentage;
	}

	public void setDiscount_percentage(Double discount_percentage) {
		this.discount_percentage = discount_percentage;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public LocalDate getValid_until() {
		return valid_until;
	}

	public void setValid_until(LocalDate valid_until) {
		this.valid_until = valid_until;
	}

	@Override
	public int hashCode() {
		return Objects.hash(active, code, discount_percentage, valid_until);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Promo_Codes other = (Promo_Codes) obj;
		return Objects.equals(active, other.active) && Objects.equals(code, other.code)
				&& Objects.equals(discount_percentage, other.discount_percentage)
				&& Objects.equals(valid_until, other.valid_until);
	}

	@Override
	public String toString() {
		return "Promo_Codes [code=" + code + ", discount_percentage=" + discount_percentage + ", active=" + active
				+ ", valid_until=" + valid_until + "]";
	}

}
