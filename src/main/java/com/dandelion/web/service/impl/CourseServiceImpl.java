package com.dandelion.web.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dandelion.web.constants.CourseStatus;
import com.dandelion.web.constants.RepeatTime;
import com.dandelion.web.dto.CRUDOperationResult;
import com.dandelion.web.dto.CourseDTO;
import com.dandelion.web.dto.CourseListDTO;
import com.dandelion.web.dto.ListOperationResult;
import com.dandelion.web.dto.OperationResult;
import com.dandelion.web.dto.SingleEntityOperationResult;
import com.dandelion.web.mapper.CourseMapper;
import com.dandelion.web.mapper.StudentMapper;
import com.dandelion.web.mapper.TeacherCourseMapper;
import com.dandelion.web.mapper.TeacherMapper;
import com.dandelion.web.model.Course;
import com.dandelion.web.model.Student;
import com.dandelion.web.model.Teacher;
import com.dandelion.web.model.TeacherCourse;
import com.dandelion.web.service.CourseService;
import com.dandelion.web.util.DozerBeanUtil;

/**
 * 课程表Service实现类
 *  <p>Title: CourseServiceImpl </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月11日下午1:20:22
 *  @version 1.0
 */
@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseMapper courseMapper;
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private TeacherMapper teacherMapper;
	@Autowired
	private TeacherCourseMapper teacherCourseMapper;
	/**
	 * 
	 */
	@Override
	public OperationResult<Integer> addCourse(CourseDTO courseDTO) {
		//  设置创建时间
		courseDTO.setCreateTime(new Date());
		//  获取课程开始时间
		Date startTime=courseDTO.getStartTime();
		Calendar cal=Calendar.getInstance();
		cal.setTime(startTime);
		//  计算课程结束时间(开始时间+时长)
		cal.add(Calendar.MINUTE, courseDTO.getDuration());
		Date endTime=cal.getTime();
		//  设置课程结束时间
		courseDTO.setEndTime(endTime);
		//  将CourseDTO转换为Course
		Course course=DozerBeanUtil.getDozerBeanMapper().map(courseDTO, Course.class);
		//  将CourseDTO转换为Student
		Student student=DozerBeanUtil.getDozerBeanMapper().map(courseDTO, Student.class);
		//  将CourseDTO转换为Teacher
		Teacher teacher=DozerBeanUtil.getDozerBeanMapper().map(courseDTO, Teacher.class);
		//  如果老师不存在
		if (teacherMapper.selectCountTeacherByMobilePhone(teacher.getMobilePhone())<=0) {
			//  保存老师信息
			teacherMapper.insertSelective(teacher);
		} else {
			//  如果老师已存在，则查询老师信息
			teacher=teacherMapper.selectTeacherByMobilePhone(teacher.getMobilePhone());
		}
		//  设置课程状态为未消课
		course.setCourseStatus(CourseStatus.WAIT_COURCE.getCode());
		//  保存课程信息
		courseMapper.insertSelective(course);
		//  如果学生不存在
		if (studentMapper.selectStudentByMobilePhone(student.getMobilePhone()) == null) {
			//  保存学生信息
			studentMapper.insertSelective(student);
		} else {
			//  如果学生已存在，则查询学生信息
			student=studentMapper.selectStudentByMobilePhone(student.getMobilePhone());
		}
		
		//  实例化老师课程关联实体
		TeacherCourse teacherCourse=new TeacherCourse();
		teacherCourse.setCourseId(course.getId());
		teacherCourse.setStudentId(student.getId());
		teacherCourse.setTeacherId(teacher.getId());
		//  保存老师添加的课程
		int state=teacherCourseMapper.insertSelective(teacherCourse);
		return new CRUDOperationResult<>(state);
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<Integer> deleteCourse(Long id) {
		int state=courseMapper.deleteByPrimaryKey(id);
		return new CRUDOperationResult<>(state);
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<Integer> updateCourse(Long id,Course course) {
		course.setId(id);
		Course oldCourse=courseMapper.selectByPrimaryKey(id);
		Date startDate=oldCourse.getStartTime();
		Date endDate=oldCourse.getEndTime();
		Calendar cal=Calendar.getInstance();
		
		//  如果是请假不消课
		if (CourseStatus.LEAVE_AND_NOT_REMOVE_COURCE.getCode().equals(course.getCourseStatus())) {
			//  如果是按天重复
			if (RepeatTime.REPEAT_BY_DAY.getCode().equals(course.getRepeatTime())) {
				cal.setTime(startDate);
				cal.add(Calendar.DAY_OF_YEAR,1);
				course.setStartTime(cal.getTime());
				cal.setTime(endDate);
				cal.add(Calendar.DAY_OF_YEAR, 1);
				course.setEndTime(cal.getTime());
			}
			//  如果是按周重复
			if (RepeatTime.REPEAT_BY_WEEK.getCode().equals(course.getRepeatTime())) {
				cal.setTime(startDate);
				cal.add(Calendar.WEEK_OF_YEAR, 1);
				course.setStartTime(cal.getTime());
				cal.setTime(endDate);
				cal.add(Calendar.WEEK_OF_YEAR, 1);
				course.setEndTime(cal.getTime());
			}
			//  如果是按月重复
			if (RepeatTime.REPEAT_BY_MONTH.getCode().equals(course.getRepeatTime())) {
				cal.setTime(startDate);
				cal.add(Calendar.MONTH, 1);
				course.setStartTime(cal.getTime());
				cal.setTime(endDate);
				cal.add(Calendar.MONTH, 1);
				course.setEndTime(cal.getTime());
			}
		}
		int state=courseMapper.updateByPrimaryKeySelective(course);
		
		return new CRUDOperationResult<>(state);
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<Course> getCourseById(Long id) {
		Course course=courseMapper.selectByPrimaryKey(id);
		return new SingleEntityOperationResult<>(1, course);
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<Course> queryCourse(Course course) {
		
		return null;
	}

	/**
	 * 
	 */
	@Override
	public OperationResult<CourseListDTO> queryCourseByTeacherMobile(String mobilePhone) {
		List<CourseListDTO> courses=courseMapper.selectCourseByTeacherMobilePhone(mobilePhone);
		return new ListOperationResult<CourseListDTO>(1, null, courses);
	}
	
}

