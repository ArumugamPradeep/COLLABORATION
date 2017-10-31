package com.niit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.ProfilePictureDAO;
import com.niit.model.ProfilePicture;

@Service
public class ProfilePictureServiceImpl implements ProfilePictureService {

	@Autowired
	private ProfilePictureDAO profilePictureDAO;
	
	@Override
	public void uploadProfilePicture(ProfilePicture profilePicture) {
		profilePictureDAO.uploadProfilePic(profilePicture);
	}

	@Override
	public ProfilePicture getProfilePicture(String username) {
		return profilePictureDAO.getProfilePic(username);
		
	}

}
