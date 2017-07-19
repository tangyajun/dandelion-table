package com.dandelion.web.dto;

/**
 * 返回单个对象实体的操作结果
 *  <p>Title: SingleEntityOperationResult </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月14日下午4:07:06
 *  @version 1.0
 */
public class SingleEntityOperationResult<T> extends CRUDOperationResult<T> implements OperationResult<T> {

	private T entity;
	
	public SingleEntityOperationResult(int result) {
		super(result);
	}
	
	public SingleEntityOperationResult(int result,OperationError error) {
		super(result,error);
	}
	
	public SingleEntityOperationResult(int result,T entity) {
		super(result,null);
		this.entity=entity;
	}
	
	public SingleEntityOperationResult(int result,OperationError error,T entity) {
		super(result,error);
		this.entity=entity;
	}

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}
	
}

