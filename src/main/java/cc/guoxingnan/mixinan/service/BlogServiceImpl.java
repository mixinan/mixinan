package cc.guoxingnan.mixinan.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cc.guoxingnan.mixinan.dao.BlogDao;
import cc.guoxingnan.mixinan.entity.Blog;
import cc.guoxingnan.mixinan.util.MixiResult;
import cc.guoxingnan.mixinan.util.Util;

@Service("blogService")
public class BlogServiceImpl implements BlogService{
	
	@Resource
	BlogDao blogDao;

	public MixiResult<Blog> getBlogByBlogId(int blogId) {
		Blog blog = blogDao.getBlogByBlogId(blogId);
		
		MixiResult<Blog> result = new MixiResult<Blog>();
		if (blog==null) {
			result.setStatus(1);
			result.setMsg("��ѯʧ�ܣ�");
		}else{
			result.setStatus(0);
			result.setMsg("��ѯ�ɹ���");
			result.setData(blog);
		}
		
		return result;
	}

	

	public MixiResult<Blog> addBlog(int userId, String blogText) {
		Blog blog = new Blog();
		blog.setMi_user_id(userId);
		blog.setMi_blog_text(blogText);
		blog.setMi_blog_create_time(Util.getCurrentTime());
		blogDao.addBlog(blog);
		
		MixiResult<Blog> res = new MixiResult<Blog>();
		res.setStatus(0);
		res.setMsg("blog��ӳɹ���");
		
		return res;
	}
	
	
	public MixiResult<List<Blog>> getBlogsByUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}



	public MixiResult<List<Blog>> getBlogsAll() {
		List<Blog> allBlogs = blogDao.getBlogsAll();
		
		MixiResult<List<Blog>> res = new MixiResult<List<Blog>>();
		if (allBlogs.size()>0) {
			res.setStatus(0);
			res.setMsg("��ѯ�ɹ�!");
			res.setData(allBlogs);
		}else{
			res.setStatus(1);
			res.setMsg("û�в�ѯ������!");
		}
		
		
		return res;
	}



	public MixiResult<List<Blog>> searchBlogs(String kw) {
		String search = "%"+kw+"%";
		List<Blog> blogs = blogDao.searchBlogs(search);
		
		MixiResult<List<Blog>> res = new MixiResult<List<Blog>>();
		
		if (blogs==null) {
			res.setStatus(1);
			res.setMsg("û�����blog�����ѯʧ��");
		}else{
			res.setStatus(0);
			res.setMsg("ok");
			res.setData(blogs);
		}
		
		
		return res;
	}

}
