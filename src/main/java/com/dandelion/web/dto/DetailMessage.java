package com.dandelion.web.dto;

import java.util.List;
import java.util.Map;

/**
 *  <p>Title: DetailMessage </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月12日上午9:56:00
 *  @version 1.0
 */
public class DetailMessage {

	//  请求参数
	private String requestMethod;
	//  请求URL
	private String requestUrl;
	//  请求参数名称
	private List<String> requestParamsName;
	//  请求参数值
	private List<Map<String,Object>> requestParamsValue;
	
	public String getRequestMethod() {
		return requestMethod;
	}
	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}
	public String getRequestUrl() {
		return requestUrl;
	}
	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}
	public List<String> getRequestParamsName() {
		return requestParamsName;
	}
	public void setRequestParamsName(List<String> requestParamsName) {
		this.requestParamsName = requestParamsName;
	}
	public List<Map<String, Object>> getRequestParamsValue() {
		return requestParamsValue;
	}
	public void setRequestParamsValue(List<Map<String, Object>> requestParamsValue) {
		this.requestParamsValue = requestParamsValue;
	}
	
}

