package test.dao;

import java.util.List;

import org.junit.Test;

import cc.guoxingnan.mixinan.dao.BlogDao;
import cc.guoxingnan.mixinan.entity.Blog;
import cc.guoxingnan.mixinan.util.Util;
import test.TestCase;

public class TestBlogDao extends TestCase{
	BlogDao dao = super.getContext().getBean("blogDao", BlogDao.class);
	
	@Test
	public void test(){
		Blog blog = dao.getBlogByBlogId(30);
		
		System.out.println(blog);
	}
	
	
	@Test
	public void update(){
		Blog blog=dao.getBlogByBlogId(37);
		blog.setMi_blog_text("修改后的");
		blog.setMi_blog_last_modify_time(Util.getCurrentTime());
		int rows = dao.updateBlog(blog);
		
		System.out.println(rows);
	}
	
	
	
	@Test
	public void addBlog(){
		System.out.println(dao);
		
		Blog blog = new Blog();
		blog.setMi_user_id(6);
		blog.setMi_blog_create_time(Util.getCurrentTime());
		blog.setMi_blog_text("中国有嘻哈");
		
		System.out.println(blog);
		dao.addBlog(blog);
	}
	
	
	@Test
	public void test3(){
		System.out.println(dao);
		
		List<Blog> allBlogs = dao.getBlogsAll();
		
		for (Blog blog : allBlogs) {
			System.out.println(blog.getMi_blog_text());
		}
	}
	
	
	@Test
	public void search(){
		System.out.println(dao);
		
		List<Blog> allBlogs = dao.searchBlogs("%no%");
		
		
		for (Blog blog : allBlogs) {
			System.out.println(blog.getMi_blog_text());
		}
	}
	
	
	@Test
	public void getAllBlogByPage(){
		System.out.println(dao);
		
		List<Blog> allBlogs = dao.getBlogsAllByPage(1);
		
		
		for (Blog blog : allBlogs) {
			System.out.println(blog.getMi_blog_text());
		}
	}
	
	
	@Test
	public void getPages(){
		System.out.println(dao);
		
		int blogsno = dao.getBlogsAllPager();
		int btSize = blogsno%5==0 ? blogsno/5 : blogsno/5+1;
		
		System.out.println("条目："+blogsno+" 按钮数："+btSize);
	}
}
