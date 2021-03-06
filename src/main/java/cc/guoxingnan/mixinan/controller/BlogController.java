package cc.guoxingnan.mixinan.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cc.guoxingnan.mixinan.entity.Blog;
import cc.guoxingnan.mixinan.service.BlogService;
import cc.guoxingnan.mixinan.util.MixiResult;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@Resource
	BlogService service;
	
	@RequestMapping("/getblogsbypage.do")
	@ResponseBody
	public MixiResult<List<Blog>> execute(int pageno){
		int page = (pageno-1)*5;
		MixiResult<List<Blog>> result = service.getBlogsAllByPage(page);
		return result;
	}
	
	
	
	@RequestMapping("/getblogpages.do")
	@ResponseBody
	public MixiResult<Integer> getPages(){
		MixiResult<Integer> res = service.getBlogsAllPage();
		return res;
	}
	
	
	
	@RequestMapping("/addblog.do")
	@ResponseBody
	public MixiResult<Blog> addBlog(int userId,String blogText){
		MixiResult<Blog> result = service.addBlog(userId, blogText);
		return result;
	}
	
	
	
	@RequestMapping("/getblog.do")
	@ResponseBody
	public MixiResult<Blog> getBlogById(int id){
		MixiResult<Blog> result = service.getBlogByBlogId(id);
		return result;
	}
	
	
	
	@RequestMapping("/getallblogs.do")
	@ResponseBody
	public MixiResult<List<Blog>> getAllBlogs(){
		MixiResult<List<Blog>> result = service.getBlogsAll();
		return result;
	}
	
	
	
	@RequestMapping("/searchblogs.do")
	@ResponseBody
	public MixiResult<List<Blog>> searchBlogs(String kw){
		MixiResult<List<Blog>> result = service.searchBlogs(kw);
		return result;
	}

	
	@RequestMapping("/delete.do")
	@ResponseBody
	public MixiResult<String> deleteBlog(int blogId){
		MixiResult<String> result = service.deleteBlog(blogId);
		return result;
	}
	
	
	@RequestMapping("/getByUserId.do")
	@ResponseBody
	public MixiResult<List<Blog>> getBlogsByUserId(int userId){
		MixiResult<List<Blog>> result = service.getBlogsByUserId(userId);
		return result;
	}
	
	
	
	@RequestMapping("/update.do")
	@ResponseBody
	public MixiResult<String> updateBlog(int blogId,String blogText){
		Blog blog = getBlogById(blogId).getData();
		blog.setMi_blog_text(blogText);
		MixiResult<String> result = service.updateBlog(blog);
		return result;
	}
}
