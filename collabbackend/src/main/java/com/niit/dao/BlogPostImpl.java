package com.niit.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.BlogComment;
import com.niit.model.BlogPost;

@Repository
@Transactional
public class BlogPostImpl implements BlogPostDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addBlogPost(BlogPost blogPost) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(blogPost);
	}

	@Override
	public List<BlogPost> getBlogs(int approved) {
		Session session = sessionFactory.getCurrentSession();

		String queryStr = "";
		if (approved == 1) // list of blogs approved
		{
			queryStr = "from BlogPost where approved=" + approved;
		} else
			queryStr = "from BlogPost where rejectionReason is null and approved=" + approved;

		Query query = session.createQuery(queryStr);

		return query.list();
	}

	@Override
	public BlogPost getBlogById(int id) {
		Session session = sessionFactory.getCurrentSession();
		BlogPost blogPost = (BlogPost) session.get(BlogPost.class, id); 														
		return blogPost;
	}

	@Override
	public void updateBlogPost(BlogPost blogPost) {

		Session session = sessionFactory.getCurrentSession();
		session.update(blogPost); // update approved/rejection
		// if approved -> upadte blogpost set approved=1 where id=?
		// if rejected -> update set approved =0, rejectionreason=? where id=?
	}

	@Override
	public void addBlogComment(BlogComment blogComment) {
		Session session = sessionFactory.getCurrentSession();
		session.save(blogComment);

	}

	@Override
	public List<BlogComment> getBlogComments(int blogPostId) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from BlogComment where blogPost.id=" + blogPostId);
		return query.list();
	}

}
