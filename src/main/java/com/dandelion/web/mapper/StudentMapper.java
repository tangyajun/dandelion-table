package com.dandelion.web.mapper;

import com.dandelion.web.model.Student;

/**
 * 学生Mapper接口
 * 
 *  <p>Title: StudentMapper </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月11日下午1:19:17
 *  @version 1.0
 */
public interface StudentMapper {
	/**
	 * 根据主键删除学生信息
	 * @param id
	 * @return
	 */
    int deleteByPrimaryKey(Long id);
    /**
     * 添加学生信息
     * @param record
     * @return
     */
    int insert(Student record);
    /**
     * 添加学生信息
     * @param record
     * @return
     */
    int insertSelective(Student record);
    /**
     * 根据主键查询学生信息
     * @param id
     * @return
     */
    Student selectByPrimaryKey(Long id);
    /**
     * 根据主键更新学生信息，只更属性值不为空的字段
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Student record);
    /**
     * 根据主键更新学生信息，更新学生所有的属性字段
     * @param record
     * @return
     */
    int updateByPrimaryKey(Student record);
    
    /**
     * 根据学生手机号查询学生信息
     * @param mobilePhone
     * @return
     */
    Student selectStudentByMobilePhone(String mobilePhone);
}