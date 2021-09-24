package com.citibank.offers.svcclient;

import com.citibank.offers.beans.CardSvcClinetReq;
import com.citibank.offers.beans.CardSvcClinetRes;

public class CardVerifyServiceClientImpl implements CardVerifyServiceClient {

	public CardSvcClinetRes enquire(CardSvcClinetReq request) {
		System.out.println("enter into svcclient :" + request);
		
		//1.get the request from service
				//2.prepare the request for backend service
				//3.call the backend service and get the response
				//4.prepare the backend service response with the help of backend response
		
		
		CardSvcClinetRes svcResp = new CardSvcClinetRes();
		svcResp.setRespCode("1");
		svcResp.setRespMsg("success");
		svcResp.setStatus("valid");
		svcResp.setDesc("good stadard card");
		
		System.out.println("Exit from :" + svcResp);
		return svcResp;
	}

}
