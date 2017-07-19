package com.dandelion.web.dto;

import java.util.List;

/**
 *  <p>Title: Error </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月10日下午5:30:16
 *  @version 1.0
 */
public class Error {

	//  错误代码(401)
	private int code;
	//  错误消息
	private String message;
	//  状态  UNAUTHENTICATED
	private String status;
	//  请求详情信息
	private List<DetailMessage> details;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<DetailMessage> getDetails() {
		return details;
	}

	public void setDetails(List<DetailMessage> details) {
		this.details = details;
	}
	
}

