package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.entities.InsuranceResponse;
import com.model.entities.InsurranceSaleReponse;
import com.service.InsuranceService;

@RestController
@RequestMapping(path = "/api/tesco2/v1/policy/")
public class InsurancedummyController {

	@Autowired
	private InsuranceService insuranceService;

	@PostMapping(path = "/validate")
	public InsuranceResponse validate(Object object) {
		return insuranceService.validate(object);
	}

	@PostMapping(path = "/sell")
	public InsurranceSaleReponse sell(Object object) {
		return insuranceService.sell(object);
	}

	@PostMapping(path = "/cancel")
	public InsurranceSaleReponse cancel(Object object) {
		return insuranceService.cancel(object);
	}

	@PostMapping(path = "/print")
	public InsurranceSaleReponse print(Object object) {
		return insuranceService.print(object);
	}

	@PostMapping(path = "/mock-validate")
	public InsuranceResponse validateMock(@RequestBody InsuranceResponse response) {
		return insuranceService.mockValidateRespone(response);
	}
	
	@PostMapping(path = "/mock-sell")
	public InsuranceResponse sellMock(@RequestBody InsuranceResponse response) {
		return insuranceService.mockSellRespone(response);
	}
	
	@PostMapping(path = "/mock-cancel")
	public InsuranceResponse cancelMock(@RequestBody InsuranceResponse response) {
		return insuranceService.mockCancelRespone(response);
	}
	
	@PostMapping(path = "/mock-print")
	public InsuranceResponse mockPrint(@RequestBody InsuranceResponse response) {
		return insuranceService.mockPrintRespone(response);
	}
	
}
