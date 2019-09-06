package com.model.entities;

import java.io.Serializable;

public class InsuranceResponse implements Serializable {

	private static final long serialVersionUID = 4430896965207488962L;

	private String transactionId;

	private String responseCode;

	private String responseMsg;

	private String errorSystemMsg;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public String getErrorSystemMsg() {
		return errorSystemMsg;
	}

	public void setErrorSystemMsg(String errorSystemMsg) {
		this.errorSystemMsg = errorSystemMsg;
	}

	public static class Builder {

		private String transactionId;

		private String responseCode;

		private String responseMsg;

		private String errorSystemMsg;

		public static Builder newInstance() {
			return new Builder();
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

		public InsuranceResponse build() {
			InsuranceResponse response = new InsuranceResponse();
			response.setTransactionId(transactionId);
			response.setResponseCode(responseCode);
			response.setResponseMsg(responseMsg);
			response.setErrorSystemMsg(errorSystemMsg);
			return response;
		}
	}
}
