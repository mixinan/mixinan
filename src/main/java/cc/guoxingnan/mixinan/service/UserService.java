package cc.guoxingnan.mixinan.service;

import cc.guoxingnan.mixinan.entity.User;
import cc.guoxingnan.mixinan.util.MixiResult;

public interface UserService {
	public MixiResult<User> regist(String name,String password,String gender);
	public MixiResult<User> check(String name,String password);
}
