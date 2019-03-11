package com.hobo.manage.web.exception;

/**
 * className:BizException.java
 * description: 自定义异常
 * date: 2018年6月3日
 * author:jpg
 */
public class ManageCommonException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	 private String errorCode;
	 
	 public ManageCommonException(String message)  {
		 super(message);
		 this.errorCode = message;
	 }
	 public ManageCommonException(String errorCode, String message) {
		 super(message);
		 this.errorCode = errorCode;
	 }
	 public ManageCommonException(String errorCode, String msg, Throwable cause) {
	        super(msg, cause);
	        this.errorCode = errorCode;
	 }
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	 
}
