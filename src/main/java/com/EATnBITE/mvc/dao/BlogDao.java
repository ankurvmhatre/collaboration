package com.EATnBITE.mvc.dao;

import java.util.List;

import com.EATnBITE.mvc.model.BlogComment;
import com.EATnBITE.mvc.model.BlogPost;
import com.EATnBITE.mvc.model.User;

public interface BlogDao {
	List<BlogPost> getBlogPosts();
	BlogPost getBlogPost(int id);
	BlogPost addBlogPost(User user,BlogPost blogPost);
	List<BlogComment> getBlogComments(int blogId);
	BlogPost addBlogPostComment(User user,BlogComment blogComment);
}
