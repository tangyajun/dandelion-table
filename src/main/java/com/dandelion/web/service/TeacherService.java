package com.dandelion.web.service;

import com.dandelion.web.dto.OperationResult;
import com.dandelion.web.dto.StudentDTO;
import com.dandelion.web.model.Teacher;

/**
 * 老师service接口
 *  <p>Title: TeacherService </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月10日下午5:25:43
 *  @version 1.0
 */
public interface TeacherService {

	/**
	 * 添加老师
	 * @param teacher
	 * @return
	 */
	OperationResult<Integer> addTeacher(Teacher teacher);
	
	/**
	 * 根据主键ID删除老师
	 * @param id
	 * @return
	 */
	OperationResult<Integer> deleteTeacher(Long id);
	/**
	 * 修改老师信息
	 * @param teacher
	 * @return
	 */
	OperationResult<Integer> updateTeacher(Teacher teacher);
	/**
	 * 查询老师
	 * @param teacher
	 * @return
	 */
	OperationResult<Teacher> queryTeacher(Teacher teacher);
	/**
	 * 根据主键获取老师
	 * @param teacher
	 * @return
	 */
	OperationResult<Teacher> getTeacher(Long teacherId);
	
	/**
	 * 根据手机号获取该老师所有的学生及课程名称和数量
	 * @param mobilePhone 手机号
	 * @return
	 */
	OperationResult<StudentDTO> getTeacherStudentCourse(String mobilePhone);
}

