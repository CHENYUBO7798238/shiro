package com.cyb.sys.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyb.bean.CustomResult;
import com.cyb.sys.component.BaseController;
import com.cyb.sys.service.SysUserService;

@RestController
@RequestMapping("/authenticate")
public class AuthenticateController extends BaseController{
	static final Logger LOG = LoggerFactory.getLogger(AuthenticateController.class);
	@Autowired
	private SysUserService sysUserService;
	
	@RequestMapping("/signIn")
	public CustomResult signIn(Long id){
		customResult.get().setCode(10001);
		customResult.get().setMsg("登陆");
		customResult.get().setData(sysUserService.findById(id));
		LOG.error("我错了");
		return customResult.get();
	}
	@RequestMapping("/signOut")
	public CustomResult signOut(){
		return customResult.get();
	}

}
