package com.citibank.offers.svcclient;

import com.citibank.offers.beans.CardSvcClinetReq;
import com.citibank.offers.beans.CardSvcClinetRes;

public interface CardVerifyServiceClient {

	
	CardSvcClinetRes enquire(CardSvcClinetReq request);
}
