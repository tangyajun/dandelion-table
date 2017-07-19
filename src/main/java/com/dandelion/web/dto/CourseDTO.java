package com.dandelion.web.dto;

import java.util.Date;

/**
 * 课程表DTO
 *  <p>Title: CourseDTO </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月11日下午2:06:17
 *  @version 1.0
 */
public class CourseDTO {

	//  自增ID
	private Long id;
	//  课程名称
    private String cname;
    //  课程单价
    private Float price;
    //  课时数
    private Integer courseNumber;
    //  时长
    private Integer duration;
    //  开始时间
    private Date startTime;
    //  结束 时间
    private Date endTime;	
    //  缴费状态
    private String payStatus;
    //  重复时间(1、2、3)1表示按天、2表示按周、3表示按月
    private String repeatTime;
    //  提醒时间
    private String remindTime;
    //  课程状态(0、1、2、3)，0表示消课、1表示请假消课、2表示请假不消课,3表示未上课
    private String courseStatus;
    //  创建时间
    private Date createTime;
    //  最后修改时间
    private Date lastModifyTime;
    //  学生姓名
    private String studentName;
    //  学生手机号
    private String studentMobilePhone;
    //  学生地址
    private String studentAddress;
    //  老师姓名
    private String teacherName;
    //  老师手机号
    private String teacherMobilePhone;
    
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCname() {
		return cname;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public Float getPrice() {
		return price;
	}
	
	public void setPrice(Float price) {
		this.price = price;
	}
	
	public Integer getCourseNumber() {
		return courseNumber;
	}
	
	public void setCourseNumber(Integer courseNumber) {
		this.courseNumber = courseNumber;
	}
	
	public Integer getDuration() {
		return duration;
	}
	
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	
	public Date getStartTime() {
		return startTime;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public Date getEndTime() {
		return endTime;
	}
	
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	public String getPayStatus() {
		return payStatus;
	}
	
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}
	
	public String getRepeatTime() {
		return repeatTime;
	}
	
	public void setRepeatTime(String repeatTime) {
		this.repeatTime = repeatTime;
	}
	
	public String getRemindTime() {
		return remindTime;
	}
	
	public void setRemindTime(String remindTime) {
		this.remindTime = remindTime;
	}
	
	public String getCourseStatus() {
		return courseStatus;
	}
	
	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getLastModifyTime() {
		return lastModifyTime;
	}
	
	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentMobilePhone() {
		return studentMobilePhone;
	}
	
	public void setStudentMobilePhone(String studentMobilePhone) {
		this.studentMobilePhone = studentMobilePhone;
	}
	
	public String getStudentAddress() {
		return studentAddress;
	}
	
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	public String getTeacherName() {
		return teacherName;
	}
	
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	public String getTeacherMobilePhone() {
		return teacherMobilePhone;
	}
	
	public void setTeacherMobilePhone(String teacherMobilePhone) {
		this.teacherMobilePhone = teacherMobilePhone;
	}
    
}

