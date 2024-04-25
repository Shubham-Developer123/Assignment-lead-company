package com.example.productcatalogue.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id2) {
		this.id = id2;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String[] getCategories() {
		return categories;
	}
	public void setCategories(String[] categories) {
		this.categories = categories;
	}
	public Map<String, String> getAttributes() {
		return attributes;
	}
	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}
	public Availability getAvailability() {
		return availability;
	}
	public void setAvailability(Availability availability) {
		this.availability = availability;
	}
	public List<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	public Product(Long id, String name, String description, double price, String[] categories,
			Map<String, String> attributes, Availability availability, List<Rating> ratings) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.categories = categories;
		this.attributes = attributes;
		this.availability = availability;
		this.ratings = ratings;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	private double price;
    private String[] categories;
    private Map<String, String> attributes;
    private Availability availability;
    private List<Rating> ratings;
               @Override                                                                                                         
               public String toString() {                                                                                        
            	return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price              
               			+ ", categories=" + Arrays.toString(categories) + ", attributes=" + attributes + ", availability="             
               			+ availability + ", ratings=" + ratings + "]";                                                                 
               }   
}