package com.tripmaster.common;

import java.util.List;

public class UserAttractionLists {
	public List<AttractionData> attractionList;
	public List<User> userList;

	public UserAttractionLists(List<AttractionData> attractions, List<User> userList) {
		this.attractionList = attractions;
		this.userList = userList;
	}

	public UserAttractionLists() {
	}
}