package com.dandelion.web.dto;

import java.util.List;

/**
 *  <p>Title: ListOperationResult </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月14日下午3:58:39
 *  @version 1.0
 */
public class ListOperationResult<T> extends CRUDOperationResult<T> implements OperationResult<T> {

	private List<T> list;
	
	public ListOperationResult(int result) {
		this(result,null,null);
	}
	
	public ListOperationResult(int result,OperationError error) {
		this(result,error,null);
	}
	
	public ListOperationResult(int result,List<T> list) {
		this(result,null,list);
	}
	
	public ListOperationResult(int result,OperationError error,List<T> list) {
		super(result,error);
		this.list=list;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
}

