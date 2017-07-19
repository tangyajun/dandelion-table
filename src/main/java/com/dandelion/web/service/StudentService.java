package com.dandelion.web.service;

import com.dandelion.web.dto.OperationResult;
import com.dandelion.web.model.Student;

/**
 * 学生Service接口
 * 
 *  <p>Title: StudentService </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月10日下午5:54:43
 *  @version 1.0
 */
public interface StudentService {

	/**
	 * 添加学生
	 * @param student
	 * @return
	 */
	OperationResult<Integer> addStudent(Student student);
	/**
	 * 更新学生信息
	 * @param student
	 * @return
	 */
	OperationResult<Integer> updateStudent(Student student);
	/**
	 * 删除学生信息
	 * @param studentId
	 * @return
	 */
	OperationResult<Integer> deleteStudent(Long studentId);
	/**
	 * 查询学生信息
	 * @param student
	 * @return
	 */
	OperationResult<Student> queryStudents(Student student);
	/**
	 * 根据主键ID获取学生信息
	 * @param studentId
	 * @return
	 */
	OperationResult<Student> getStudent(Long studentId);
	/**
	 * 根据手机号获取学生信息
	 * @param mobilePhone
	 * @return
	 */
	OperationResult<Student> getStudentByMobilePhone(String mobilePhone);
}

