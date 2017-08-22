package cc.guoxingnan.mixinan.dao;

import java.util.List;

import cc.guoxingnan.mixinan.entity.Blog;

public interface BlogDao {
	public List<Blog> getBlogsAll();
	public List<Blog> getBlogsAllByPage(int pageno);
	//��ѯ����ҳ��
	public int getBlogsAllPager();
	//����userId����blogs
	public List<Blog> getBlogsByUserId(int userId);
	//��ѯҳ��
	public int getPages();
	public void addBlog(Blog blog);
	public Blog getBlogByBlogId(int blogId);
	public int deleteBlog(int id);
	//�޸�blog���޸����ݣ��޸�ʱ��
	public int updateBlog(Blog blog);
	public List<Blog> searchBlogs(String keyword);
}
