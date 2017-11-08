package com.niit.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.BlogPostDAO;
import com.niit.model.BlogComment;
import com.niit.model.BlogPost;

@Service
@Transactional
public class BlogPostServiceImpl implements BlogPostService {

	@Autowired
	private BlogPostDAO blogPostDAO;
	
	@Override
	public void addBlogPost(BlogPost blogPost) {
		blogPostDAO.addBlogPost(blogPost);
	}

	@Override
	public List<BlogPost> getBlogs(int approved) {
		
		return blogPostDAO.getBlogs(approved);
	}

	@Override
	public BlogPost getBlogById(int id) {
		
		return blogPostDAO.getBlogById(id);
	}

	@Override
	public void updateBlogPost(BlogPost blogPost) {
		blogPostDAO.addBlogPost(blogPost);
		
	}

	@Override
	public void addBlogComment(BlogComment blogComment) {
		blogPostDAO.addBlogComment(blogComment);
	}

	@Override
	public List<BlogComment> getBlogComments(int blogPostId) {
		return  blogPostDAO.getBlogComments(blogPostId);
	}

}
