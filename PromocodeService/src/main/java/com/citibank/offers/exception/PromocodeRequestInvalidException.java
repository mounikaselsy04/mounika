package com.citibank.offers.exception;

public class PromocodeRequestInvalidException extends Exception{
	
	
	private String errorCode;
	private String errorMsg;
	
	public PromocodeRequestInvalidException(String errorCode, String errorMsg) {
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
