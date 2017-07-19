package com.dandelion.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dandelion.web.dto.CRUDOperationResult;
import com.dandelion.web.dto.ListOperationResult;
import com.dandelion.web.dto.OperationResult;
import com.dandelion.web.dto.SingleEntityOperationResult;
import com.dandelion.web.dto.StudentDTO;
import com.dandelion.web.mapper.TeacherMapper;
import com.dandelion.web.model.Teacher;
import com.dandelion.web.service.TeacherService;

/**
 * 老师Service实现类
 *  <p>Title: TeacherServiceImpl </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月11日上午10:06:10
 *  @version 1.0
 */
@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherMapper teacherMapper;
	/**
	 * 
	 */
	@Override
	public OperationResult<Integer> addTeacher(Teacher teacher) {
		int state=teacherMapper.insertSelective(teacher);
		return new CRUDOperationResult<>(state);
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<Integer> updateTeacher(Teacher teacher) {
		int state=teacherMapper.updateByPrimaryKeySelective(teacher);
		return new CRUDOperationResult<>(state);
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<Teacher> queryTeacher(Teacher teacher) {
		//List<Teacher> teachers=teacherMapper
		return null;
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<Teacher> getTeacher(Long id) {
		Teacher teacher=teacherMapper.selectByPrimaryKey(id);
		return new SingleEntityOperationResult<Teacher>(1, teacher);
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<Integer> deleteTeacher(Long id) {
		int state=teacherMapper.deleteByPrimaryKey(id);
		return new CRUDOperationResult<>(state);
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<StudentDTO> getTeacherStudentCourse(String mobilePhone) {
		//  根据手机号查询该老师的所有学生和课程信息
		List<StudentDTO> students=teacherMapper.selectStudentsByTeacherMobilePhone(mobilePhone);
		//  根据手机号查询该学生已消除课程数量
		List<Integer> courseNums=teacherMapper.selectCountStudentRemoveCourseNumByTeacherMobilePhone(mobilePhone);
		
		if (students!= null && students.size()>0) {
			for (int i=0;i<students.size();i++) {
				StudentDTO student=students.get(i);
				if (courseNums != null && courseNums.size()>0) {
					if (student!=null) {
						if (courseNums.get(i) != null) {
							//  设置已消除课程数量
							student.setRemoveCourseNum(courseNums.get(i));
						}
					}
				}
				
			}
		}
		return new ListOperationResult<>(1, students);
	}
}

