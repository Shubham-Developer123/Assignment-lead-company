package com.example.productcatalogue.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Availability {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private boolean inStock;
    private int quantity;
	public Availability() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Availability(boolean inStock, int quantity) {
		super();
		this.inStock = inStock;
		this.quantity = quantity;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Availability [inStock=" + inStock + ", quantity=" + quantity + "]";
	}
	
}