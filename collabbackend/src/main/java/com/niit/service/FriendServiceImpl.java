package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.FriendDAO;
import com.niit.model.Friend;
import com.niit.model.User;

@Service
public class FriendServiceImpl implements FriendService {

	@Autowired
	private FriendDAO friendDAO;
	@Override
	public List<User> listOfSuggestedUsers(String username) {
		return friendDAO.listOfSuggestedUsers(username);
	}
	@Override
	public void friendRequest(Friend friend) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Friend> pendingRequests(String toId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateFriendRequest(Friend friend) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<String> listOfFriends(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
