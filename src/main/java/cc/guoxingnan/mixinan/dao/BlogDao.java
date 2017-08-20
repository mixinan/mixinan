package cc.guoxingnan.mixinan.dao;

import java.util.List;

import cc.guoxingnan.mixinan.entity.Blog;

public interface BlogDao {
	public List<Blog> getBlogsAll();
	public List<Blog> getBlogsByUserId(int userId);
	public void addBlog(Blog blog);
	public Blog getBlogByBlogId(int blogId);
	public void deleteBlog(int id);
	public void updateBlog(int id);
}
