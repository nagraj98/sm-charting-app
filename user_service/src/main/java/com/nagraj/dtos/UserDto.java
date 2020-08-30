package com.nagraj.dtos;

import com.nagraj.model.UserType;

public class UserDto {
	
	private int userId;
	private String username;
	private String password;
	private UserType userType;
	private String email;
	private String mobile;
	
	public UserDto(int userId, String username, String password, UserType userType, String email, String mobile) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.email = email;
		this.mobile = mobile;
	}

	public UserDto() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	

}
