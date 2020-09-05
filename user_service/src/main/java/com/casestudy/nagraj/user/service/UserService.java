package com.casestudy.nagraj.user.service;

import com.casestudy.nagraj.user.shared.UserRequest;
import com.casestudy.nagraj.user.shared.UserResponse;

public interface UserService {

	UserResponse getUser(String uname,String password);

	UserResponse addUser(UserRequest userDetails);
}
