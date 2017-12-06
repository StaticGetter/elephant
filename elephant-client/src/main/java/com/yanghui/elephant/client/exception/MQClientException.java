package com.yanghui.elephant.client.exception;

public class MQClientException extends Exception {

	private static final long serialVersionUID = -7859698473922459765L;
	private int responseCode;
	private String errorMessage;

	public MQClientException(String errorMessage, Throwable cause) {
		super(errorMessage, cause);
		this.responseCode = -1;
		this.errorMessage = errorMessage;
	}

	public MQClientException(int responseCode, String errorMessage) {
		super(errorMessage);
		this.responseCode = responseCode;
		this.errorMessage = errorMessage;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public MQClientException setResponseCode(final int responseCode) {
		this.responseCode = responseCode;
		return this;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(final String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
