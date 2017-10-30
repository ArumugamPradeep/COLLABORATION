package com.niit.service;

import java.util.List;

import com.niit.model.User;

public interface FriendService {

	List<User> listOfSuggestedUsers(String username);
	
}
