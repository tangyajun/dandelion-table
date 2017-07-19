package com.dandelion.web.service;

import com.dandelion.web.dto.OperationResult;
import com.dandelion.web.model.TeacherCourse;

/**
 * 老师课程Service接口
 *  <p>Title: TeacherCourseService </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月11日上午9:52:16
 *  @version 1.0
 */
public interface TeacherCourseService {

	/**
	 * 添加老师课程
	 * @param teacherCourse
	 * @return
	 */
	OperationResult<Integer> addTeacherCourse(TeacherCourse teacherCourse);
	/**
	 * 根据主键ID删除老师课程
	 * @param teacherCourseId
	 * @return
	 */
	OperationResult<Integer> deleteTeacherCourse(Long id);
	/**
	 * 根据主键更新老师课程
	 * @param teacherCourse
	 * @return
	 */
	OperationResult<Integer> updateTeacherCourse(TeacherCourse teacherCourse);
	/**
	 * 根据主键获取老师课程
	 * @param id
	 * @return
	 */
	OperationResult<TeacherCourse> getTeacherCourseById(Long id);
	/**
	 * 查询老师课程
	 * @param teacherCourse
	 * @return
	 */
	OperationResult<TeacherCourse> queryOperationResult(TeacherCourse teacherCourse);
}

