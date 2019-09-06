package com.service;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.model.entities.InsuranceResponse;
import com.model.entities.InsurranceSaleReponse;

@Service
public class InsuranceServiceImpl implements InsuranceService {

	private static final String POLICY_PREFIX_NAME = "TEPF";

	private static final String TXN_PREFIX_NAME = "ISBL";

	private static final String FORMAT_DATETIME = "yyyyMMddHHmmss";

	private static final String FORMAT_DATE = "ddMMyyyy";

	private static final String DEFAULT_RESPONSE_CODE = "0000";

	private static final String DEFAULT_RESPONSE_MSG = "Transaction Success";

	private InsuranceResponse mockValidate;

	private InsuranceResponse mockSell;

	private InsuranceResponse mockCancel;

	private InsuranceResponse mockPrint;

	@Override
	public InsuranceResponse validate(Object object) {
		this.mockValidate = Optional.ofNullable(mockValidate).orElse(InsuranceResponse.Builder.newInstance()
				.transactionId(
						TXN_PREFIX_NAME + LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT_DATETIME)))
				.responseCode(DEFAULT_RESPONSE_CODE).responseMsg(DEFAULT_RESPONSE_MSG)
				.errorSystemMsg(DEFAULT_RESPONSE_MSG).build());
		return mockValidate;
	}

	@Override
	public InsurranceSaleReponse sell(Object object) {

		InsurranceSaleReponse insurranceSaleReponse = null;
		if (Optional.ofNullable(mockSell).isPresent()) {
			insurranceSaleReponse = InsurranceSaleReponse.Builder.newInstance()
					.transactionId(
							TXN_PREFIX_NAME + LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT_DATETIME)))
					.responseCode(mockSell.getResponseCode()).responseMsg(mockSell.getResponseMsg())
					.errorSystemMsg(mockSell.getErrorSystemMsg()).build();
		} else {
			insurranceSaleReponse = InsurranceSaleReponse.Builder.newInstance()
					.transactionId(
							TXN_PREFIX_NAME + LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT_DATETIME)))
					.responseCode(DEFAULT_RESPONSE_CODE).responseMsg(DEFAULT_RESPONSE_MSG)
					.errorSystemMsg(DEFAULT_RESPONSE_MSG).build();
		}

		if (DEFAULT_RESPONSE_CODE.equals(insurranceSaleReponse.getResponseCode())) {
			insurranceSaleReponse.setPolicyNumber(
					POLICY_PREFIX_NAME + LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT_DATE)));
		}

		return insurranceSaleReponse;
	}

	@Override
	public InsurranceSaleReponse cancel(Object object) {
		InsurranceSaleReponse insurranceSaleReponse = null;
		if (Optional.ofNullable(mockCancel).isPresent()) {
			insurranceSaleReponse = InsurranceSaleReponse.Builder.newInstance()
					.transactionId(
							TXN_PREFIX_NAME + LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT_DATETIME)))
					.responseCode(mockCancel.getResponseCode()).responseMsg(mockCancel.getResponseMsg())
					.errorSystemMsg(mockCancel.getErrorSystemMsg()).build();
		} else {
			insurranceSaleReponse = InsurranceSaleReponse.Builder.newInstance()
					.transactionId(
							TXN_PREFIX_NAME + LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT_DATETIME)))
					.responseCode(DEFAULT_RESPONSE_CODE).responseMsg(DEFAULT_RESPONSE_MSG)
					.errorSystemMsg(DEFAULT_RESPONSE_MSG).build();
		}

		if (DEFAULT_RESPONSE_CODE.equals(insurranceSaleReponse.getResponseCode())) {
			insurranceSaleReponse.setPolicyNumber(
					POLICY_PREFIX_NAME + LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT_DATE)));
		}

		return insurranceSaleReponse;
	}

	@Override
	public InsurranceSaleReponse print(Object object) {
		InsurranceSaleReponse insurranceSaleReponse = null;
		if (Optional.ofNullable(mockPrint).isPresent()) {
			insurranceSaleReponse = InsurranceSaleReponse.Builder.newInstance()
					.transactionId(
							TXN_PREFIX_NAME + LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT_DATETIME)))
					.responseCode(mockPrint.getResponseCode()).responseMsg(mockPrint.getResponseMsg())
					.errorSystemMsg(mockPrint.getErrorSystemMsg()).build();
		} else {
			insurranceSaleReponse = InsurranceSaleReponse.Builder.newInstance()
					.transactionId(
							TXN_PREFIX_NAME + LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT_DATETIME)))
					.responseCode(DEFAULT_RESPONSE_CODE).responseMsg(DEFAULT_RESPONSE_MSG)
					.errorSystemMsg(DEFAULT_RESPONSE_MSG).build();
		}

		if (DEFAULT_RESPONSE_CODE.equals(insurranceSaleReponse.getResponseCode())) {
			insurranceSaleReponse.setPolicyNumber(
					POLICY_PREFIX_NAME + LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT_DATE)));
		}

		return insurranceSaleReponse;
	}

	@Override
	public InsuranceResponse mockValidateRespone(InsuranceResponse response) {
		this.mockValidate = InsuranceResponse.Builder.newInstance()
				.transactionId(Optional.ofNullable(response.getTransactionId()).orElse(
						TXN_PREFIX_NAME + LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT_DATETIME))))
				.responseCode(Optional.ofNullable(response.getResponseCode()).orElse(DEFAULT_RESPONSE_CODE))
				.responseMsg(Optional.ofNullable(response.getResponseMsg()).orElse(DEFAULT_RESPONSE_MSG))
				.errorSystemMsg(Optional.ofNullable(response.getErrorSystemMsg()).orElse(DEFAULT_RESPONSE_MSG)).build();
		return this.mockValidate;
	}

	@Override
	public InsuranceResponse mockSellRespone(InsuranceResponse response) {
		this.mockSell = InsuranceResponse.Builder.newInstance()
				.transactionId(Optional.ofNullable(response.getTransactionId()).orElse(
						TXN_PREFIX_NAME + LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT_DATETIME))))
				.responseCode(Optional.ofNullable(response.getResponseCode()).orElse(DEFAULT_RESPONSE_CODE))
				.responseMsg(Optional.ofNullable(response.getResponseMsg()).orElse(DEFAULT_RESPONSE_MSG))
				.errorSystemMsg(Optional.ofNullable(response.getErrorSystemMsg()).orElse(DEFAULT_RESPONSE_MSG)).build();
		return this.mockSell;
	}

	@Override
	public InsuranceResponse mockCancelRespone(InsuranceResponse response) {
		this.mockCancel = InsuranceResponse.Builder.newInstance()
				.transactionId(Optional.ofNullable(response.getTransactionId()).orElse(
						TXN_PREFIX_NAME + LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT_DATETIME))))
				.responseCode(Optional.ofNullable(response.getResponseCode()).orElse(DEFAULT_RESPONSE_CODE))
				.responseMsg(Optional.ofNullable(response.getResponseMsg()).orElse(DEFAULT_RESPONSE_MSG))
				.errorSystemMsg(Optional.ofNullable(response.getErrorSystemMsg()).orElse(DEFAULT_RESPONSE_MSG)).build();
		return this.mockCancel;
	}

	@Override
	public InsuranceResponse mockPrintRespone(InsuranceResponse response) {
		this.mockPrint = InsuranceResponse.Builder.newInstance()
				.transactionId(Optional.ofNullable(response.getTransactionId()).orElse(
						TXN_PREFIX_NAME + LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT_DATETIME))))
				.responseCode(Optional.ofNullable(response.getResponseCode()).orElse(DEFAULT_RESPONSE_CODE))
				.responseMsg(Optional.ofNullable(response.getResponseMsg()).orElse(DEFAULT_RESPONSE_MSG))
				.errorSystemMsg(Optional.ofNullable(response.getErrorSystemMsg()).orElse(DEFAULT_RESPONSE_MSG)).build();
		return this.mockPrint;
	}
}
