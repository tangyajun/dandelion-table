package com.dandelion.web.dto;

import java.util.List;

/**
 *  <p>Title: OperationError </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月14日下午3:50:41
 *  @version 1.0
 */
public class OperationError {
	//  错误码
	private int code;
	//  错误消息
	private String message;
	//  错误详情
	private List<ErrorDetail> details;
	
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
	public List<ErrorDetail> getDetails() {
		return details;
	}
	public void setDetails(List<ErrorDetail> details) {
		this.details = details;
	}
	
}

