package com.citibank.offers.dao;

import com.citibank.offers.beans.EnquireDaoReq;
import com.citibank.offers.beans.EnquireDaoResp;
import com.citibank.offers.beans.EnquireResp;
import com.citibank.offers.exception.BusinessException;
import com.citibank.offers.exception.SystemException;

public interface PromocodeDao {
	
	EnquireDaoResp enquire(EnquireDaoReq request) throws BusinessException, SystemException;

}
