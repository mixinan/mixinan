package cc.guoxingnan.mixinan.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cc.guoxingnan.mixinan.service.BlogService;
import cc.guoxingnan.mixinan.util.MixiResult;

@Controller
@RequestMapping("/blog")
public class BlogsAllGetPagesController {
	
	@Resource
	BlogService service;
	
	@RequestMapping("/getblogpages.do")
	@ResponseBody
	public MixiResult<Integer> execute(){
		
		MixiResult<Integer> res = service.getBlogsAllPage();
		return res;
	}

}
