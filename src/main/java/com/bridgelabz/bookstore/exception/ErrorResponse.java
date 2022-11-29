package com.bridgelabz.bookstore.exception;

public class ErrorResponse {

	private int statusCode;
	private String message;


	public ErrorResponse(int code, String msg) {
		this.setStatusCode(code);
		this.setMessage(msg);
	}


	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	


}
