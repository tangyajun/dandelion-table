package com.dandelion.web.mapper;

import java.util.List;

import com.dandelion.web.dto.CourseListDTO;
import com.dandelion.web.model.Course;
/**
 * 课程Mapper接口
 * 主要包括对课程表的增加、删除、修改、查询操作 
 *  <p>Title: CourseMapper </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月11日下午5:23:09
 *  @version 1.0
 */
public interface CourseMapper {
	
    int deleteByPrimaryKey(Long id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
    /**
     * 根据老师手机号查询该老师的课程列表
     * @param mobilePhone
     * @return
     */
    List<CourseListDTO> selectCourseByTeacherMobilePhone(String mobilePhone);
    
}