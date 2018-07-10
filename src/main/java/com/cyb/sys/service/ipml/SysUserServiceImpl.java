package com.cyb.sys.service.ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyb.sys.entity.SysUser;
import com.cyb.sys.mapper.SysUserMapper;
import com.cyb.sys.service.SysUserService;
@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public SysUser findById(Long id) {
		return sysUserMapper.findById(id);
	}

}
