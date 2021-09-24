package com.citibank.offers.exception;

public class BusinessException extends Exception{
	
	
	private String errorCode;
	private String errorMsg;
	
	public BusinessException(String errorCode, String errorMsg) {
		this.errorCode=errorCode;
		this.errorMsg=errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	

	
	
}

