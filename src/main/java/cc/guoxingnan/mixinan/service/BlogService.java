package cc.guoxingnan.mixinan.service;

import java.util.List;

import cc.guoxingnan.mixinan.entity.Blog;
import cc.guoxingnan.mixinan.entity.User;
import cc.guoxingnan.mixinan.util.MixiResult;

public interface BlogService {
	public MixiResult<Blog> getBlogByBlogId(int blogId);
	public MixiResult<List<Blog>> getBlogsByUserId(int userId);
}
