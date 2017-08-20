package test.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import cc.guoxingnan.mixinan.dao.BlogDao;
import cc.guoxingnan.mixinan.entity.Blog;
import cc.guoxingnan.mixinan.util.Util;
import test.TestCase;

public class TestBlogDao extends TestCase {
	BlogDao dao = super.getContext().getBean("blogDao", BlogDao.class);
	List<Blog> allBlogs = new ArrayList<Blog>();
	
	@Test
	public void init() {
		System.out.println(dao);
		Blog blog = dao.getBlogByBlogId(2);
		System.out.println(blog);
	}
	
	@Test
	public void test2(){
		System.out.println(dao);
		
		Blog blog = new Blog();
		blog.setMi_user_id(6);
		blog.setMi_blog_create_time(Util.getCurrentTime());
		blog.setMi_blog_text("ÖÐ¹úÓÐÎû¹þ");
		
		System.out.println(blog);
		dao.addBlog(blog);
	}
	
	@Test
	public void test3(){
		System.out.println(dao);
		
		allBlogs = dao.getBlogsAll();
		
		for (Blog blog : allBlogs) {
			System.out.println(blog.getMi_blog_text());
		}
	}
	
}
