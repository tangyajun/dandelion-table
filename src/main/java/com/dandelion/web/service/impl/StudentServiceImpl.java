package com.dandelion.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dandelion.web.dto.CRUDOperationResult;
import com.dandelion.web.dto.OperationResult;
import com.dandelion.web.dto.SingleEntityOperationResult;
import com.dandelion.web.mapper.StudentMapper;
import com.dandelion.web.model.Student;
import com.dandelion.web.service.StudentService;

/**
 * 学生Service实现类
 *  <p>Title: StudentServiceImpl </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月11日下午1:11:54
 *  @version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	/**
	 * 
	 */
	@Override
	public OperationResult<Integer> addStudent(Student student) {
		int state=studentMapper.insertSelective(student);
		return new CRUDOperationResult<>(state);
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<Integer> updateStudent(Student student) {
		int state=studentMapper.updateByPrimaryKeySelective(student);
		return new CRUDOperationResult<>(state);
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<Integer> deleteStudent(Long id) {
		int state=studentMapper.deleteByPrimaryKey(id);
		return new CRUDOperationResult<>(state);
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<Student> queryStudents(Student student) {
		return null;
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<Student> getStudent(Long id) {
		Student student=studentMapper.selectByPrimaryKey(id);
		return new SingleEntityOperationResult<Student>(1, student);
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<Student> getStudentByMobilePhone(String mobilePhone) {
		return null;
	}

}

