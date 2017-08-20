package test.service;

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
	
	
}
