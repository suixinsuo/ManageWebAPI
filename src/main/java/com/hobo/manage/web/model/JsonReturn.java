package com.hobo.manage.web.model;

import java.io.Serializable;

public class JsonReturn implements Serializable {
	private static final long serialVersionUID = -6197907357688795950L;
	
	private boolean result;
	private Object data;
	private String errorCode;
	private String errorMsg;
	// 通讯状态,默认正常通信为200，50014 token过期，50015，无权限
	private String code = "200";
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public boolean isResult() {
		return result;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public static JsonReturn ok() {
		JsonReturn jsonReturn = new JsonReturn();
		jsonReturn.setResult(true);
		jsonReturn.setCode("200");
		return jsonReturn;
	}
	public static JsonReturn fali() {
		JsonReturn jsonReturn = new JsonReturn();
		jsonReturn.setResult(false);
		jsonReturn.setCode("200");
		return jsonReturn;
	}
	
	public static JsonReturn ok(Object object) {
		JsonReturn jsonReturn = new JsonReturn();
		jsonReturn.setResult(true);
		jsonReturn.setData(object);
		jsonReturn.setCode("200");
		return jsonReturn;
	}
	
	public static JsonReturn fail(String errorCode,String errorMsg) {
		JsonReturn jsonReturn = new JsonReturn();
		jsonReturn.setResult(false);
		jsonReturn.setErrorCode(errorCode);
		jsonReturn.setErrorMsg(errorMsg);
		jsonReturn.setCode("200");
		return jsonReturn;
	}
	
	public static JsonReturn code(String code) {
		JsonReturn jsonReturn = new JsonReturn();
		jsonReturn.setCode(code);
		return jsonReturn;
	}
	
	
}
