package com.dandelion.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dandelion.web.dto.CRUDOperationResult;
import com.dandelion.web.dto.OperationResult;
import com.dandelion.web.dto.SingleEntityOperationResult;
import com.dandelion.web.mapper.TeacherCourseMapper;
import com.dandelion.web.model.TeacherCourse;
import com.dandelion.web.service.TeacherCourseService;

/**
 * 老师课程关联表Service实现类
 *  <p>Title: TeacherCourseServiceImpl </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月11日下午1:33:06
 *  @version 1.0
 */
@Service
public class TeacherCourseServiceImpl implements TeacherCourseService {

	@Autowired
	private TeacherCourseMapper teacherCourseMapper;
	/**
	 * 
	 */
	@Override
	public OperationResult<Integer> addTeacherCourse(TeacherCourse teacherCourse) {
		int state=teacherCourseMapper.insertSelective(teacherCourse);
		return new CRUDOperationResult<>(state);
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<Integer> deleteTeacherCourse(Long id) {
		int state=teacherCourseMapper.deleteByPrimaryKey(id);
		return new CRUDOperationResult<>(state);
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<Integer> updateTeacherCourse(TeacherCourse teacherCourse) {
		int state=teacherCourseMapper.updateByPrimaryKeySelective(teacherCourse);
		return new CRUDOperationResult<>(state);
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<TeacherCourse> getTeacherCourseById(Long id) {
		TeacherCourse teacherCourse=teacherCourseMapper.selectByPrimaryKey(id);
		return new SingleEntityOperationResult<TeacherCourse>(1, teacherCourse);
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<TeacherCourse> queryOperationResult(TeacherCourse teacherCourse) {
		return null;
	}

}

