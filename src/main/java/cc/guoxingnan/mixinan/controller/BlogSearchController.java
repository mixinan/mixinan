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
public class BlogSearchController {
	
	@Resource
	BlogService service;
	
	@RequestMapping("/searchblogs.do")
	@ResponseBody
	public MixiResult<List<Blog>> execute(String kw){
		MixiResult<List<Blog>> result = service.searchBlogs(kw);
		return result;
	}

}
