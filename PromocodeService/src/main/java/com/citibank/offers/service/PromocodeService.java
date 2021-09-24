package com.citibank.offers.service;

import com.citibank.offers.beans.EnquireRequest;
import com.citibank.offers.beans.EnquireResp;
import com.citibank.offers.exception.BusinessException;
import com.citibank.offers.exception.SystemException;

public interface PromocodeService {
	
	EnquireResp enquire(EnquireRequest request) throws BusinessException, SystemException;

}
