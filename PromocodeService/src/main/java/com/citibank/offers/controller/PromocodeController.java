package com.citibank.offers.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citibank.offers.beans.EnquireRequest;
import com.citibank.offers.beans.EnquireResp;
import com.citibank.offers.exception.BusinessException;
import com.citibank.offers.exception.PromocodeRequestInvalidException;
import com.citibank.offers.exception.SystemException;
import com.citibank.offers.service.PromocodeService;
import com.citibank.offers.service.PromocodeServiceImpl;
import com.citibank.offers.validator.PrmocodeServiceValidator;


@RestController
public class PromocodeController {
	
	
	@RequestMapping(value="/enquire/{promocode}")
	public EnquireResp enquire(@PathVariable("promocode") String promocode,
			@RequestHeader("client-id") String clientId,
			@RequestHeader("msgIs") String msgIs,
			@RequestHeader("correlation-id") String correlationId) {
		System.out.println("enter into controller :" + promocode);
		EnquireResp response;
		try {
		       //1.Get the request form client
				
		//2.prepare the request for service
		EnquireRequest request = new EnquireRequest();
		request.setClientId(clientId);
		request.setPromoCode(promocode);
		request.setCorrelationId(correlationId);
		request.setMsgIs(msgIs);
		//3.validate the request
		PrmocodeServiceValidator validator = new PrmocodeServiceValidator();//line 47
		
			validator.requestValidate(request);//line 48
	
		//4.call the service and get the response
		PromocodeService service = new PromocodeServiceImpl();
		response = service.enquire(request);// 53 or 54
		}
		catch (PromocodeRequestInvalidException e) {
			response = new EnquireResp();
			response.setRespCode(e.getErrorCode());
			response.setRespMsg(e.getErrorMsg());
			e.printStackTrace();
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			response = new EnquireResp();
			response.setRespCode(e.getErrorCode());
			response.setRespMsg(e.getErrorMsg());
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			response = new EnquireResp();
			response.setRespCode(e.getErrorCode());
			response.setRespMsg(e.getErrorMsg());
		}	
		//5.prepare the controller response
		System.out.println("Exit from controller controller :" + response);
		   return response;
		
	}
	
	public static void main(String args[]){

		PromocodeController controller = new PromocodeController();
		EnquireResp response = controller.enquire("85965285635", "mobile", "21-09-2021-12121", "abc.123.xyz.111");
		
		System.out.println("Client  response is : " + response);
		
}
}
