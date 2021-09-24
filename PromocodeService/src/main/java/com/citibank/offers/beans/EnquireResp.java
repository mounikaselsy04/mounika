package com.citibank.offers.beans;

public class EnquireResp {
	
	private String respCode;
	private String respMsg;
	private String cardnum;
	private String respCvvNum;
	private String expDate;
	private String customerName;
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
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	public String getRespCvvNum() {
		return respCvvNum;
	}
	public void setRespCvvNum(String respCvvNum) {
		this.respCvvNum = respCvvNum;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EnquireResp [respCode=");
		builder.append(respCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append(", cardnum=");
		builder.append(cardnum);
		builder.append(", respCvvNum=");
		builder.append(respCvvNum);
		builder.append(", expDate=");
		builder.append(expDate);
		builder.append(", customerName=");
		builder.append(customerName);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
