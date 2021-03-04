package com.tripmaster.common.trip;

import java.util.List;

import com.tripmaster.common.attraction.AttractionNearby;
import com.tripmaster.common.user.User;

public class ProposalForm {
	public User user;
	public List<AttractionNearby> attractions;
	public int cumulativeRewardPoints;

	public ProposalForm(User user, List<AttractionNearby> attractions, int cumulativeRewardPoints) {
		this.user = user;
		this.attractions = attractions;
		this.cumulativeRewardPoints = cumulativeRewardPoints;
	}

	public ProposalForm() {
	}
}