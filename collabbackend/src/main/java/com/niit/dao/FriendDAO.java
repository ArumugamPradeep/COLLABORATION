package com.niit.dao;

import java.util.List;

import com.niit.model.Friend;
import com.niit.model.User;

public interface FriendDAO {
	
	List<User> listOfSuggestedUsers(String username);
	void friendRequest(Friend friend);

	List<Friend> pendingRequests(String toId);

	void updatePendingRequest(Friend friend);
	
	List<String> listOfFriends(String username);


}
