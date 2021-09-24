package com.citibank.offers.validator;

import com.citibank.offers.beans.EnquireRequest;
import com.citibank.offers.exception.PromocodeRequestInvalidException;

public class PrmocodeServiceValidator {
	
	public void requestValidate(EnquireRequest request) throws PromocodeRequestInvalidException {
		//validate all mandatory elements and then throw the user defined exception
		
		if(request.getPromoCode()==null || "" .equals(request.getPromoCode())) {
			throw new PromocodeRequestInvalidException("prc001", "Invalid promocode");
		}
	}

}
