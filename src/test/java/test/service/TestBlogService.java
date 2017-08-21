package test.service;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cc.guoxingnan.mixinan.entity.Blog;
import cc.guoxingnan.mixinan.entity.User;
import cc.guoxingnan.mixinan.service.BlogService;
import cc.guoxingnan.mixinan.service.UserService;
import cc.guoxingnan.mixinan.util.MixiResult;
import test.TestCase;

public class TestBlogService extends TestCase{
	BlogService service;
	
	@Before
	public void init(){
		service = super.getContext().getBean("blogService", BlogService.class);
	}
	
	@Test
	public void test(){
		MixiResult<Blog> result = service.getBlogByBlogId(3);
		System.out.println(result.getStatus());
		System.out.println(result.getMsg());
		System.out.println(result.getData());
	}
	
	@Test
	public void test2(){
		MixiResult<Blog> result = service.addBlog(3, "test");
		System.out.println(result.getMsg());
		System.out.println(result.getData());
	}
	
	@Test
	public void test3(){
		MixiResult<List<Blog>> res = service.getBlogsAll();
		System.out.println(res.getMsg());
		System.out.println(res.getData().size());
	}
	
	
	@Test
	public void testsearch(){
		MixiResult<List<Blog>> res = service.searchBlogs("no");
		System.out.println(res.getMsg());
		System.out.println(res.getData());
	}
	
	
	@Test
	public void getBlogByPage(){
		MixiResult<List<Blog>> res = service.getBlogsAllByPage(1);
		System.out.println(res.getMsg());
		System.out.println(res.getData());
	}
	
	
	@Test
	public void getPages(){
		MixiResult<Integer> res = service.getBlogsAllPage();
		System.out.println(res.getMsg());
		System.out.println(res.getData());
	}
	
	
}
