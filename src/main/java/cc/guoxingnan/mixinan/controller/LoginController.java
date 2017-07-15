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
public class LoginController {
	@Resource
	UserService service;
	
	@RequestMapping("/check.do")
	@ResponseBody
	public MixiResult<User> execute(String name,String password){
		MixiResult<User> result = service.check(name, password);
		
		return result;
	}
	
	
}
