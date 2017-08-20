package test.dao;

import org.junit.Test;

import cc.guoxingnan.mixinan.dao.BlogDao;
import cc.guoxingnan.mixinan.entity.Blog;
import test.TestCase;

public class TestBlogDao extends TestCase {
	BlogDao dao = super.getContext().getBean("blogDao", BlogDao.class);
	
	@Test
	public void init() {
		System.out.println(dao);
		Blog blog = dao.getBlogByBlogId(2);
		System.out.println(blog);
	}
	
}
