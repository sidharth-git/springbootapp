package com.example.demo.dto;

public class AuthRes {

	private String status;
	private String message;

	public AuthRes(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public AuthRes() {
		super();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
