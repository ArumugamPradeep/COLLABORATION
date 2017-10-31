package com.niit.service;

import com.niit.model.ProfilePicture;

public interface ProfilePictureService {

	void uploadProfilePicture(ProfilePicture profilePicture);
	ProfilePicture getProfilePicture(String username);

}
