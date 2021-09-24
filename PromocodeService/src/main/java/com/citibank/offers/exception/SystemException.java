package com.citibank.offers.exception;

public class SystemException extends Exception{
	
	
	private String errorCode;
	private String errorMsg;
	
	public SystemException(String errorCode, String errorMsg) {
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
