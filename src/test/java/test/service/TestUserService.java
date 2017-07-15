package test.service;

import org.junit.Before;
import org.junit.Test;

import cc.guoxingnan.mixinan.entity.User;
import cc.guoxingnan.mixinan.service.UserService;
import cc.guoxingnan.mixinan.util.MixiResult;
import test.TestCase;

public class TestUserService extends TestCase{
	UserService service;
	
	@Before
	public void init(){
		service = super.getContext().getBean("userService", UserService.class);
	}
	
	@Test
	public void test(){
		MixiResult<User> result = service.regist("dd", "123456", "1");
		System.out.println(result.getMsg());
		System.out.println(result.getData());
	}
	
	
	@Test
	public void check(){
		MixiResult<User> result = service.check("33", "33");
		System.out.println(result.getData());
	}
}
