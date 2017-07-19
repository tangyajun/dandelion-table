package com.dandelion.web.constants;

/**
 * 课程重复时间
 *  <p>Title: RepeatTime </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月10日下午3:19:40
 *  @version 1.0
 */
public enum RepeatTime {
	//  按天重复
	REPEAT_BY_DAY("1","按天 "),
	
	REPEAT_BY_WEEK("2","按周"),
	
	REPEAT_BY_MONTH("3","按月");
	
	private String code;
	
	private String desc;

	private RepeatTime(String code,String desc) {
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

