package cc.guoxingnan.mixinan.dao;

import java.util.List;

import cc.guoxingnan.mixinan.entity.Blog;

public interface BlogDao {
	public List<Blog> getBlogsAll();
	public List<Blog> getBlogsAllByPage(int pageno);
	//查询所有页数
	public int getBlogsAllPager();
	//根据userId查找blogs
	public List<Blog> getBlogsByUserId(int userId);
	//查询页数
	public int getPages();
	public void addBlog(Blog blog);
	public Blog getBlogByBlogId(int blogId);
	public int deleteBlog(int id);
	//修改blog：修改内容，修改时间
	public int updateBlog(Blog blog);
	public List<Blog> searchBlogs(String keyword);
}
