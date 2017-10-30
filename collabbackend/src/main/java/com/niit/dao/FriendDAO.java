package com.niit.dao;

import java.util.List;

import com.niit.model.User;

public interface FriendDAO {
	
	List<User> listOfSuggestedUsers(String username);

}
