package com.citibank.offers.beans;

public class CardSvcClinetReq {
	
	private String cardNum;
	private String cvv;
	private String expDate;
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CardSvcClinetReq [cardNum=");
		builder.append(cardNum);
		builder.append(", cvv=");
		builder.append(cvv);
		builder.append(", expDate=");
		builder.append(expDate);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
