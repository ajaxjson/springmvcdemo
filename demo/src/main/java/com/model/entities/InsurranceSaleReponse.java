package com.model.entities;


public class InsurranceSaleReponse extends InsuranceResponse {

	private static final long serialVersionUID = 3181462952015877465L;

	private String policyNumber;

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public static class Builder {

		private String policyNumber;

		private String transactionId;

		private String responseCode;

		private String responseMsg;

		private String errorSystemMsg;

		public static Builder newInstance() {
			return new Builder();
		}

		public Builder policyNumber(String policyNumber) {
			this.policyNumber = policyNumber;
			return this;
		}

		public Builder transactionId(String transactionId) {
			this.transactionId = transactionId;
			return this;
		}

		public Builder responseCode(String responseCode) {
			this.responseCode = responseCode;
			return this;
		}

		public Builder responseMsg(String responseMsg) {
			this.responseMsg = responseMsg;
			return this;
		}

		public Builder errorSystemMsg(String errorSystemMsg) {
			this.errorSystemMsg = errorSystemMsg;
			return this;
		}

		public InsurranceSaleReponse build() {
			InsurranceSaleReponse response = new InsurranceSaleReponse();
			response.setTransactionId(transactionId);
			response.setResponseCode(responseCode);
			response.setResponseMsg(responseMsg);
			response.setErrorSystemMsg(errorSystemMsg);
			response.setPolicyNumber(policyNumber);
			return response;
		}
	}
}