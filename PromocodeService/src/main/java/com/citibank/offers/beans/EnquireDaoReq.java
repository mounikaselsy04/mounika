package com.citibank.offers.beans;

public class EnquireDaoReq {
	
	private String clientId;
	private String promoCode;
	private String correlationId;
	private String msgIs;
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getPromoCode() {
		return promoCode;
	}
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}
	public String getCorrelationId() {
		return correlationId;
	}
	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}
	public String getMsgIs() {
		return msgIs;
	}
	public void setMsgIs(String msgIs) {
		this.msgIs = msgIs;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EnquireDaoReq [clientId=");
		builder.append(clientId);
		builder.append(", promoCode=");
		builder.append(promoCode);
		builder.append(", correlationId=");
		builder.append(correlationId);
		builder.append(", msgIs=");
		builder.append(msgIs);
		builder.append("]");
		return builder.toString();
	}
	
	

}
