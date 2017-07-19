package com.dandelion.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dandelion.web.dto.CourseDTO;
import com.dandelion.web.dto.CourseListDTO;
import com.dandelion.web.dto.OperationResult;
import com.dandelion.web.model.Course;
import com.dandelion.web.service.CourseService;

/**
 * 课程Controller
 * 主要包括对课程的添加、修改、查询 等
 *  <p>Title: CourseController </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月11日下午1:40:01
 *  @version 1.0
 */
@RestController
@RequestMapping(value="/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	/**
	 * 添加课程
	 * @param course
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST)
	public OperationResult<Integer> createCourse(@RequestBody CourseDTO course) {
			return courseService.addCourse(course);
	}
	
	/**
	 * 根据主键ID删除课程
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public OperationResult<Integer> deleteCourse(@PathVariable(value="id") Long id) {
		return courseService.deleteCourse(id);
	}
	
	/**
	 * 根据主键修改课程表
	 * @param id
	 * @param course
	 * @return
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.PUT)
	public OperationResult<Integer> updateCourse(
			@PathVariable(value="id") Long id,
			@RequestBody Course course) {
		return courseService.updateCourse(id, course);
	}
	
	/**
	 * 根据主键ID查询课程
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public OperationResult<Course> getCourseById(@PathVariable(value="id") Long id) {
		return courseService.getCourseById(id);
	}
	
	/**
	 * 根据老师手机号查询课程列表,
	 * 主要包括学生姓名、课程名称、课程开始时间、课程结束时间、课程日期
	 * @param mobilePhone
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET)
	public OperationResult<CourseListDTO> queryCoursesByTeacherMobilePhone(@RequestParam String mobilePhone) {
		return courseService.queryCourseByTeacherMobile(mobilePhone);
	}
}

