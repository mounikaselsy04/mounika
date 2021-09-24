package com.citibank.offers.beans;

public class EnquireDaoResp {
	
	private String respCode;
	private String respMsg;
	private String cardNum;
	private String customerName;
	private String cvvNum;
	private String expDate;
	
	
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespMsg() {
		return respMsg;
	}
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCvvNum() {
		return cvvNum;
	}
	public void setCvvNum(String cvvNum) {
		this.cvvNum = cvvNum;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EnquireDaoResp [respCode=");
		builder.append(respCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append(", cardNum=");
		builder.append(cardNum);
		builder.append(", customerName=");
		builder.append(customerName);
		builder.append(", cvvNum=");
		builder.append(cvvNum);
		builder.append(", expDate=");
		builder.append(expDate);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
