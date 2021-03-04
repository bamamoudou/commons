package com.tripmaster.common;

public class UserAttraction {
	public User user;
	public AttractionData attraction;

	public UserAttraction(User user, AttractionData attraction) {
		this.user = user;
		this.attraction = attraction;
	}

	public UserAttraction() {
	}
}