package com.dandelion.web.mapper;

import java.util.List;

import com.dandelion.web.dto.StudentDTO;
import com.dandelion.web.model.Teacher;

public interface TeacherMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
    
    /**
     * 根据手机号查询老师
     * @param mobilePhone
     * @return
     */
    int selectCountTeacherByMobilePhone(String mobilePhone);
    /**
     * 根据手机号查询老师
     * @param mobilePhone
     * @return
     */
    Teacher selectTeacherByMobilePhone(String mobilePhone);
    
    /**
     * 根据老师手机号查询该老师所有的学生和学生总课程数
     * @param mobilePhone
     * @return
     */
    List<StudentDTO> selectStudentsByTeacherMobilePhone(String mobilePhone);
    
    /**
     * 根据老师手机号查询该老师所有学生已消除课程数 
     * @param mobilePhone
     * @return
     */
    List<Integer> selectCountStudentRemoveCourseNumByTeacherMobilePhone(String mobilePhone);
}