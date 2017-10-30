package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.FriendDAO;
import com.niit.model.User;

@Service
public class FriendServiceImpl implements FriendService {

	@Autowired
	private FriendDAO friendDAO;
	@Override
	public List<User> listOfSuggestedUsers(String username) {
		return friendDAO.listOfSuggestedUsers(username);
	}

}
