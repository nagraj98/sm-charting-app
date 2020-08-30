package com.nagraj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	// we dont want to send this auto generate id to the client, hence not included in the dto
	
	@Column(name="User_id")
	private int userId;
	
	@Column(name="Username")
	private String username;

	@Column(name="Password")
	private String password;
	
	@Column(name="UserType")
	private UserType userType = UserType.USER; 
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Mobile_Number")
	private String mobile;

	public User() {
		super();
	}

	public User(int userId, String username, String password, UserType userType, String email, String mobile) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.email = email;
		this.mobile = mobile;
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
