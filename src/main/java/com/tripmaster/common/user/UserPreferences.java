package com.tripmaster.common.user;

public class UserPreferences {
	public int attractionProximity = Integer.MAX_VALUE;
	public double lowerPricePoint = 0;
	public double highPricePoint = Double.MAX_VALUE;
	public int tripDuration = 1;
	public int ticketQuantity = 1;
	public int numberOfAdults = 1;
	public int numberOfChildren = 0;

	public UserPreferences() {
	}

	public int getAttractionProximity() {
		return attractionProximity;
	}

	public void setAttractionProximity(int attractionProximity) {
		this.attractionProximity = attractionProximity;
	}

	public double getLowerPricePoint() {
		return lowerPricePoint;
	}

	public void setLowerPricePoint(double lowerPricePoint) {
		this.lowerPricePoint = lowerPricePoint;
	}

	public double getHighPricePoint() {
		return highPricePoint;
	}

	public void setHighPricePoint(double highPricePoint) {
		this.highPricePoint = highPricePoint;
	}

	public int getTripDuration() {
		return tripDuration;
	}

	public void setTripDuration(int tripDuration) {
		this.tripDuration = tripDuration;
	}

	public int getTicketQuantity() {
		return ticketQuantity;
	}

	public void setTicketQuantity(int ticketQuantity) {
		this.ticketQuantity = ticketQuantity;
	}

	public int getNumberOfAdults() {
		return numberOfAdults;
	}

	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}
}