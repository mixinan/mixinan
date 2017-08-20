package cc.guoxingnan.mixinan.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cc.guoxingnan.mixinan.entity.User;
import cc.guoxingnan.mixinan.service.UserService;
import cc.guoxingnan.mixinan.util.MixiResult;

@Controller
@RequestMapping("/user")
public class GetUserByIdController {
	@Resource
	UserService service;
	
	@RequestMapping("/getUserById.do")
	@ResponseBody
	public MixiResult<User> execute(int id){
		MixiResult<User> result = service.getUserById(id);
		
		return result;
	}
	
	
}
