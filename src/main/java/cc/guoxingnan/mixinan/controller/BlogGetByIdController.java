package cc.guoxingnan.mixinan.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cc.guoxingnan.mixinan.entity.Blog;
import cc.guoxingnan.mixinan.service.BlogService;
import cc.guoxingnan.mixinan.util.MixiResult;

@Controller
@RequestMapping("/blog")
public class BlogGetByIdController {
	
	@Resource
	BlogService service;
	
	@RequestMapping("/getblog.do")
	@ResponseBody
	public MixiResult<Blog> execute(int id){
		MixiResult<Blog> result = service.getBlogByBlogId(id);
		return result;
	}

}
