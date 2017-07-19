package com.dandelion.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dandelion.web.dto.OperationResult;
import com.dandelion.web.dto.StudentDTO;
import com.dandelion.web.model.Teacher;
import com.dandelion.web.service.TeacherService;

/**
 * 老师Controller
 *  <p>Title: TeacherController </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月11日上午10:03:11
 *  @version 1.0
 */
@RestController
@RequestMapping(value="/teacher")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;

	/**
	 * 添加老师
	 * @param teacher
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST)
	public OperationResult<Integer> createTeacher(@RequestBody Teacher teacher) {
		return teacherService.addTeacher(teacher);
	}
	
	/**
	 * 根据主键删除老师
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public OperationResult<Integer> deleteTeacher(@PathVariable Long id) {
		return teacherService.deleteTeacher(id);
	}
	
	/**
	 * 根据主键ID修改老师信息
	 * @param teacher
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public OperationResult<Integer> updateTeacher(@RequestBody Teacher teacher,
			@PathVariable(value="id") Long id) {
		teacher.setId(id);
		return teacherService.updateTeacher(teacher);
	}
	
	/**
	 * 根据主键ID获取老师信息
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public OperationResult<Teacher> getTeacherById(
			@PathVariable(value="id") Long id) {
		return teacherService.getTeacher(id);
	}
	
	/**
	 * 查询老师
	 * @param mobilePhone
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public OperationResult<Teacher> listTeacher(
			@RequestParam(required=false) String mobilePhone) {
		Teacher teacher=new Teacher();
		if (StringUtils.isEmpty(mobilePhone)) {
			teacher.setMobilePhone(mobilePhone);
		}
		return teacherService.queryTeacher(teacher);
	}
	
	/**
	 * 根据手机号获取该老师的所有学生姓名及课程总数和已消除课程数量
	 * @param mobilePhone
	 * @return
	 */
	@RequestMapping(value="/students/{mobilePhone}",method=RequestMethod.GET)
	public OperationResult<StudentDTO> getTeacherStudents(
			@PathVariable(value="mobilePhone") String mobilePhone) {
		return teacherService.getTeacherStudentCourse(mobilePhone);
	}
}

