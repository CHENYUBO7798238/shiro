package com.cyb.sys.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cyb.sys.entity.SysUser;

@Mapper
public interface SysUserMapper {

	@Select("select id,name from sys_user where id = #{id}")
	public SysUser findById(Long id);
}
