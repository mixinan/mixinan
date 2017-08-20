package cc.guoxingnan.mixinan.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cc.guoxingnan.mixinan.dao.BlogDao;
import cc.guoxingnan.mixinan.entity.Blog;
import cc.guoxingnan.mixinan.util.MixiResult;

@Service("blogService")
public class BlogServiceImpl implements BlogService{
	
	@Resource
	BlogDao blogDao;

	public MixiResult<Blog> getBlogByBlogId(int blogId) {
		Blog blog = blogDao.getBlogByBlogId(blogId);
		
		MixiResult<Blog> result = new MixiResult<Blog>();
		if (blog==null) {
			result.setStatus(1);
			result.setMsg("查询失败！");
		}else{
			result.setStatus(0);
			result.setMsg("查询成功！");
			result.setData(blog);
		}
		
		return result;
	}

	public MixiResult<List<Blog>> getBlogsByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
