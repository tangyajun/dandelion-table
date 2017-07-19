package com.dandelion.web.dto;

/**
 *  <p>Title: CRUDOperationResult </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2017年7月14日下午3:49:02
 *  @version 1.0
 */
public class CRUDOperationResult<T> implements OperationResult<T> {
	//  操作结果，true表示成功、false表示失败
	protected boolean success;
	//  操作错误
	protected OperationError error;
	
	public CRUDOperationResult(int result) {
		this(result,null);
	}
	
	public CRUDOperationResult(int result,OperationError error) {
		if (result>0) {
			success=true;
		}
		this.error=error;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public OperationError getError() {
		return error;
	}
	public void setError(OperationError error) {
		this.error = error;
	}
	
}

