package com.dandelion.web.dto;

/**
 *  <p>Title: StudentDTO </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月15日上午9:33:12
 *  @version 1.0
 */
public class StudentDTO {
	//  学生姓名
	private String studentName;
	//  已消课程数
	private int removeCourseNum;
	//  总课程数
	private int totalCourseNum;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRemoveCourseNum() {
		return removeCourseNum;
	}
	public void setRemoveCourseNum(int removeCourseNum) {
		this.removeCourseNum = removeCourseNum;
	}
	public int getTotalCourseNum() {
		return totalCourseNum;
	}
	public void setTotalCourseNum(int totalCourseNum) {
		this.totalCourseNum = totalCourseNum;
	}
	
}

