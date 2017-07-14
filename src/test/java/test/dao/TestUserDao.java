package test.dao;

import org.junit.Test;

import cc.guoxingnan.mixinan.dao.UserDao;
import cc.guoxingnan.mixinan.entity.User;
import test.TestCase;

public class TestUserDao extends TestCase{
	UserDao dao = super.getContext().getBean("userDao", UserDao.class);
	
	@Test
	public void init(){
		User user = new User();
		user.setMi_user_name("mixi");
		user.setMi_user_password("123456");
		user.setMi_user_gender("1");
		int n = dao.regist(user);
		System.out.println(n);
	}
}
