package cc.guoxingnan.mixinan.dao;

import cc.guoxingnan.mixinan.entity.User;

public interface UserDao {
	public int regist(User user);
	public int login(User user);
}
