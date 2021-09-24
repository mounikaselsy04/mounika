package com.citibank.offers.service;

import com.citibank.offers.beans.CardSvcClinetReq;
import com.citibank.offers.beans.CardSvcClinetRes;
import com.citibank.offers.beans.EnquireDaoReq;
import com.citibank.offers.beans.EnquireDaoResp;
import com.citibank.offers.beans.EnquireRequest;
import com.citibank.offers.beans.EnquireResp;
import com.citibank.offers.dao.PromocodeDao;
import com.citibank.offers.dao.PromocodeDaoImpl;
import com.citibank.offers.exception.BusinessException;
import com.citibank.offers.exception.SystemException;
import com.citibank.offers.svcclient.CardVerifyServiceClient;
import com.citibank.offers.svcclient.CardVerifyServiceClientImpl;

public class PromocodeServiceImpl implements PromocodeService{

	public EnquireResp enquire(EnquireRequest request) throws BusinessException, SystemException {
		
		System.out.println("enter into service :" + request);
		//1.get the request from controller
		
		//2.prepare the request for dao 
		EnquireDaoReq daoReq = new EnquireDaoReq();
		daoReq.setClientId(request.getClientId());
		daoReq.setPromoCode(request.getPromoCode());
		daoReq.setCorrelationId(request.getCorrelationId());
		daoReq.setMsgIs(request.getMsgIs());
		//3.call the dao and get the response
		PromocodeDao dao = new PromocodeDaoImpl();
		EnquireDaoResp daoRes = dao.enquire(daoReq);
		
		System.out.println("dao response in service layer:" +daoRes);
		
		//4.prepare the request for service client with ths help of dao response
		CardSvcClinetReq clientReq = new CardSvcClinetReq();
		clientReq.setCardNum(daoRes.getCardNum());
		clientReq.setCvv(daoRes.getCvvNum());
		clientReq.setExpDate(daoRes.getExpDate());
		//5.call the service client and get the response
		CardVerifyServiceClient svcClinet = new CardVerifyServiceClientImpl();
		CardSvcClinetRes svcClientRes = svcClinet.enquire(clientReq);
		
		//6.prepare the enquire resp with the help of dao and service client response
		EnquireResp response = new EnquireResp();
		response.setCardnum(svcClientRes.getRespCode());
		response.setRespMsg(svcClientRes.getRespMsg());
		response.setCardnum(daoRes.getCardNum());
		response.setRespCvvNum(daoRes.getCvvNum());
		response.setExpDate(daoRes.getExpDate());
		response.setCustomerName(daoRes.getCustomerName());
		System.out.println("Exit from service :" + response);
		return response;
	}

}
