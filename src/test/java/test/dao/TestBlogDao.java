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
		blog.setMi_blog_text("中国有嘻哈");
		
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
	
	
	@Test
	public void search(){
		System.out.println(dao);
		
		allBlogs = dao.searchBlogs("%no%");
		
		
		for (Blog blog : allBlogs) {
			System.out.println(blog.getMi_blog_text());
		}
	}
	
	
	@Test
	public void getAllBlogByPage(){
		System.out.println(dao);
		
		allBlogs = dao.getBlogsAllByPage(1);
		
		
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
