package com.dandelion.web.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 *  <p>Title: CourseListDTO </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月11日下午5:10:36
 *  @version 1.0
 */
public class CourseListDTO {

	//  学生姓名
	private String studentName;
	//  课程名称
	private String courseName;
	//  课程日期 (2017-07-11)
	private Date cdate;
	//  课程起始时间(17:00-19:00)
	private Date startTime;
	//  课程结束时间
	private Date endTime;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	public Date getCdate() {
		return cdate;
	}
	
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	
	@DateTimeFormat(pattern="HH:mm")
	@JsonFormat(pattern="HH:mm",timezone="GMT+8")
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	@DateTimeFormat(pattern="HH:mm")
	@JsonFormat(pattern="HH:mm",timezone="GMT+8")
	public Date getEndTime() {
		return endTime;
	}
	
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
}

