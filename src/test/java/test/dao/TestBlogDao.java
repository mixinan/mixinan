package test.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import cc.guoxingnan.mixinan.dao.BlogDao;
import cc.guoxingnan.mixinan.entity.Blog;
import cc.guoxingnan.mixinan.util.Util;
import test.TestCase;

public class TestBlogDao extends TestCase {
	BlogDao dao = super.getContext().getBean("blogDao", BlogDao.class);
	
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
		blog.setMi_blog_text("�й�������");
		
		System.out.println(blog);
		dao.addBlog(blog);
	}
	
}
