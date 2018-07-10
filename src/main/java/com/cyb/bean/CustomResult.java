package com.cyb.bean;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3343746996588223687L;
	
	private int code = 10000;
	private String msg;
	private Object data;
	
}
