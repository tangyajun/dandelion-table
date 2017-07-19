package com.dandelion.web.util;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

/**
 * DozerBean转换工具类
 *  <p>Title: DozerBeanUtil </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月11日下午2:14:09
 *  @version 1.0
 */
public final class DozerBeanUtil {

	private static DozerBeanMapper beanMapper=null;
	
	static {
		List<String> dozerMappingFiles = new ArrayList<String>();
		dozerMappingFiles.add("dozer-mapping.xml");
		//  实例化DozerBeanMapper
		beanMapper=new DozerBeanMapper();
		//  设置DozerBeanMapper转换文件
		beanMapper.setMappingFiles(dozerMappingFiles);
	}
	
	public static DozerBeanMapper getDozerBeanMapper() {
		return beanMapper;
	}
}

