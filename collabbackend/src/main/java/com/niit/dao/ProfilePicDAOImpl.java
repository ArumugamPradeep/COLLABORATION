package com.niit.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.ProfilePicture;

@Repository
@Transactional
public class ProfilePicDAOImpl implements ProfilePictureDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void uploadProfilePic(ProfilePicture profilePicture) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(profilePicture);

	}

	@Override
	public ProfilePicture getProfilePic(String username) {
		Session session = sessionFactory.getCurrentSession();
		ProfilePicture profilePic = (ProfilePicture) session.get(ProfilePicture.class, username); 
		return profilePic;
	}

}
