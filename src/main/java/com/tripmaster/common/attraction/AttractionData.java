package com.tripmaster.common.attraction;

import java.util.UUID;

import com.tripmaster.common.location.LocationData;

public class AttractionData extends LocationData {
	public String name;
	public String city;
	public String state;
	public UUID id;

	public AttractionData(double lat, double lon) {
		super(lat, lon);
	}

	public AttractionData(UUID id, String name, String city, String state, double latitude, double longitude) {
		this(latitude, longitude);
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
	}

	public AttractionData() {
	}
}