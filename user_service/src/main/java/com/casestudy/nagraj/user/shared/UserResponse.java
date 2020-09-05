package com.casestudy.nagraj.user.shared;

public class UserResponse {
	
	private String uname;
	// note that we do not want to return the password
	private String userType;
	private String email;
	private long mobile;
	private boolean confirmed;
	
	public UserResponse(String uname, String userType, String email, long mobile, boolean confirmed) {
		super();
		this.uname = uname;
		this.userType = userType;
		this.email = email;
		this.mobile = mobile;
		this.confirmed = confirmed;
	}

	public UserResponse() {
		super();
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	

}
