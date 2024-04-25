package com.example.productcatalogue.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rating {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;
    private int rating;
    private String comment;
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rating(String userId, int rating, String comment) {
		super();
		this.userId = userId;
		this.rating = rating;
		this.comment = comment;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "Rating [userId=" + userId + ", rating=" + rating + ", comment=" + comment + "]";
	}
    
}