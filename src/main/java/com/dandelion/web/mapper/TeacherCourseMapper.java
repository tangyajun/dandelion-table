package com.dandelion.web.mapper;

import com.dandelion.web.model.TeacherCourse;

public interface TeacherCourseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TeacherCourse record);

    int insertSelective(TeacherCourse record);

    TeacherCourse selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TeacherCourse record);

    int updateByPrimaryKey(TeacherCourse record);
}