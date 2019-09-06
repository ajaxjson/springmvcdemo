package com.service;


import com.model.entities.InsuranceResponse;
import com.model.entities.InsurranceSaleReponse;

public interface InsuranceService {

	InsuranceResponse validate(Object object);
	
	InsurranceSaleReponse sell(Object object);

	InsurranceSaleReponse cancel(Object object);

	InsurranceSaleReponse print(Object object);

	InsuranceResponse mockValidateRespone(InsuranceResponse response);

	InsuranceResponse mockSellRespone(InsuranceResponse response);

	InsuranceResponse mockCancelRespone(InsuranceResponse response);

	InsuranceResponse mockPrintRespone(InsuranceResponse response);

}