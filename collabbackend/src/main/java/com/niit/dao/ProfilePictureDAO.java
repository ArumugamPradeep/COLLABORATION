package com.niit.dao;

import com.niit.model.ProfilePicture;

public interface ProfilePictureDAO {
	
	void uploadProfilePic(ProfilePicture profilePicture);
	ProfilePicture getProfilePic(String username);

	
	
}
