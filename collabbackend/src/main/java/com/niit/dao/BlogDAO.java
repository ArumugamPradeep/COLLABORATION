package com.niit.dao;

import java.util.List;

import com.niit.model.*;

public interface BlogDAO {

	public boolean createBlog(Blog blog);
	public boolean approveBlog(Blog blog);
	public boolean deleteBlog(int blogId);
	public boolean editBlog(int blogId);
	
	public Blog getBlog(int blogId);
	
	public List<Blog> getBlogs();
	
}
