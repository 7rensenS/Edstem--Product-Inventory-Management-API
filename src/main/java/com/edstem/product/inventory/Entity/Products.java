package com.edstem.product.inventory.Entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {

	@Id
	private String id;
	@Column(nullable = false)
	private String name;
	@Column
	private String description;
	@Column(nullable = false)
	private Double base_price;
	@Column
	private String category;
	@Column(nullable = false)
	private Integer available_quantity;

	public Products() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getBase_price() {
		return base_price;
	}

	public void setBase_price(Double base_price) {
		this.base_price = base_price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getAvailable_quantity() {
		return available_quantity;
	}

	public void setAvailable_quantity(Integer available_quantity) {
		this.available_quantity = available_quantity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(available_quantity, base_price, category, description, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(available_quantity, other.available_quantity)
				&& Objects.equals(base_price, other.base_price) && Objects.equals(category, other.category)
				&& Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", description=" + description + ", base_price=" + base_price
				+ ", category=" + category + ", available_quantity=" + available_quantity + "]";
	}

}
