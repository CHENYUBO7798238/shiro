package com.cyb.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyb.bean.CustomResult;
import com.cyb.sys.component.BaseController;
import com.cyb.sys.service.SysUserService;

@RestController
@RequestMapping("/authenticate")
public class AuthenticateController extends BaseController{
	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("/signIn")
	public CustomResult signIn(Long id){
		customResult.get().setCode(10001);
		customResult.get().setMsg("登陆");
		customResult.get().setData(sysUserService.findById(id));
		return customResult.get();
	}
	@RequestMapping("/signOut")
	public CustomResult signOut(){
		return customResult.get();
	}

}
