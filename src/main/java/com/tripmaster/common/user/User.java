package com.tripmaster.common.user;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.tripmaster.common.location.VisitedLocationData;

public class User {
	public final UUID userId;
	public final String userName;
	public String phoneNumber;
	public String emailAddress;
	public UserPreferences userPreferences;
	private List<VisitedLocationData> visitedLocations;
	private List<UserReward> userRewards;

	public User(UUID userId, String userName, String phoneNumber, String emailAddress) {
		this.userId = userId;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		visitedLocations = new ArrayList<>();
		userRewards = new ArrayList<>();
		userPreferences = new UserPreferences();
	}

	public User() {
		this(new UUID(0, 0), new String(), new String(), new String());
	}

	public void addToVisitedLocations(VisitedLocationData visitedLocation) {
		visitedLocations.add(visitedLocation);
	}

	public List<VisitedLocationData> getVisitedLocations() {
		return visitedLocations;
	}

	public VisitedLocationData getLastVisitedLocation() {
		int listLength = visitedLocations.size();
		if (listLength == 0) {
			return null;
		}
		return visitedLocations.get(listLength - 1);
	}

	public void addUserReward(UserReward userReward) {
		if (userRewards.stream().filter(r -> r.attraction.name.equals(userReward.attraction.name)).count() == 0) {
			userRewards.add(userReward);
		}
	}

	public List<UserReward> getUserRewards() {
		return userRewards;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public UserPreferences getUserPreferences() {
		return userPreferences;
	}

	public void setUserPreferences(UserPreferences userPreferences) {
		this.userPreferences = userPreferences;
	}

	public UUID getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setVisitedLocations(List<VisitedLocationData> visitedLocations) {
		this.visitedLocations = visitedLocations;
	}

	public void setUserRewards(List<UserReward> userRewards) {
		this.userRewards = userRewards;
	}
}