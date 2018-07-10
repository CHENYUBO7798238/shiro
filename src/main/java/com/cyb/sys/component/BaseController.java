package com.cyb.sys.component;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.cyb.bean.CustomResult;

public abstract class BaseController {
	protected static final ThreadLocal<CustomResult> customResult = new ThreadLocal<>();
	
	@ModelAttribute
	public void init() {
		CustomResult value = new CustomResult();
		customResult.set(value );
	}
}
