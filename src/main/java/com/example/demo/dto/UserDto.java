package com.example.demo.dto;

public class UserDto {

	private long id;

	private String userName;

	private String password;

	private String token;

	public UserDto() {
		super();
	}

	public UserDto(long id, String userName, String password, String token) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.token = token;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
