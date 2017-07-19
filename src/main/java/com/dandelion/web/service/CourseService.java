package com.dandelion.web.service;

import com.dandelion.web.dto.CourseDTO;
import com.dandelion.web.dto.CourseListDTO;
import com.dandelion.web.dto.OperationResult;
import com.dandelion.web.model.Course;

/**
 * 课程表Service接口
 *  <p>Title: CourseService </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月10日下午6:00:40
 *  @version 1.0
 */
public interface CourseService {
	/**
	 * 添加课程
	 * @param course
	 * @return
	 */
	OperationResult<Integer> addCourse(CourseDTO course);
	/**
	 * 根据课程表主键ID删除课程
	 * @param id
	 * @return
	 */
	OperationResult<Integer> deleteCourse(Long id);
	/**
	 * 根据课程表主键ID更新课程信息
	 * @param course
	 * @return
	 */
	OperationResult<Integer> updateCourse(Long id,Course course);
	/**
	 * 根据主键查询课程
	 * @param id
	 * @return
	 */
	OperationResult<Course> getCourseById(Long id);
	/**
	 * 查询课程
	 * @param course
	 * @return
	 */
	OperationResult<Course> queryCourse(Course course);
	/**
	 * 根据老师手机号查询课表
	 * @param mobilePhone
	 * @return
	 */
	OperationResult<CourseListDTO> queryCourseByTeacherMobile(String mobilePhone);
}

