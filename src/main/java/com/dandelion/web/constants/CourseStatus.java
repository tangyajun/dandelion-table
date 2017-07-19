package com.dandelion.web.constants;

/**
 * 课程状态
 *  <p>Title: CourseStatus </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月10日下午3:12:38
 *  @version 1.0
 */
public enum CourseStatus {

	REMOVE_COURSE("0","消课"),
	
	LEAVE_AND_REMOVE_COURSE("1","请假消课"),
	
	LEAVE_AND_NOT_REMOVE_COURCE("2","请假不消课"),
	
	WAIT_COURCE("3","待上课");
	
	private String code;
	
	private String desc;
	
	private CourseStatus(String code,String desc) {
		this.code=code;
		this.desc=desc;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}

