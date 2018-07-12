package com.cyb.sys.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class SysUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8513585891699379151L;
	
	private Long id;
	private String name;

}
