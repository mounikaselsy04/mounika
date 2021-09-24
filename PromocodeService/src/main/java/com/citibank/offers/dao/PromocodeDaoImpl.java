package com.citibank.offers.dao;

import com.citibank.offers.beans.EnquireDaoReq;
import com.citibank.offers.beans.EnquireDaoResp;
import com.citibank.offers.beans.EnquireResp;
import com.citibank.offers.exception.BusinessException;
import com.citibank.offers.exception.SystemException;

public class PromocodeDaoImpl implements PromocodeDao{

public EnquireDaoResp enquire(EnquireDaoReq request) throws BusinessException, SystemException {
	System.out.println("enter into dao :" + request);
		//1.get the request from service
		//2.prepare the request for db
		//3.call the database and get the response
		//4.prepare the dao response with the help of db response
	
	//TODO : need replace dao hardcoaded response with Resultset response
	String dbRespCode = "0";
	String dbRespMsg = "success";
	
	EnquireDaoResp daoResp = new EnquireDaoResp();
	try {
		if("0".equals(dbRespCode)) 
		{
		daoResp.setRespCode("0");
		daoResp.setRespMsg("success");
		daoResp.setCardNum("4985899625688");
		daoResp.setCvvNum("123");
		daoResp.setCustomerName("mouni");
		daoResp.setExpDate("12/2021");
		System.out.println("Exit from dao :" + daoResp);
		
		}else if("100".equals(dbRespCode) || "101".equals(dbRespCode) || "102".equals(dbRespCode)) {
			throw new BusinessException(dbRespCode, dbRespMsg);
		}
		else {
			throw new SystemException(dbRespCode, dbRespMsg);
		}
	} catch (BusinessException be) {
		// log error 
		throw be;
	}
	catch (SystemException se) {
		// error log 
		throw se;
	}
	return daoResp;


}

	

}
