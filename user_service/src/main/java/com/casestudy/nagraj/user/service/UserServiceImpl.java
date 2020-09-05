package com.casestudy.nagraj.user.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;

import com.casestudy.nagraj.user.model.User;
import com.casestudy.nagraj.user.model.UserDto;
import com.casestudy.nagraj.user.repo.UserRepository;
import com.casestudy.nagraj.user.shared.UserRequest;
import com.casestudy.nagraj.user.shared.UserResponse;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserResponse getUser(String uname, String password) {
		User user = userRepository.findByUnameAndPassword(uname, password);
		ModelMapper mapper=new ModelMapper();
	    mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	    return mapper.map(user, UserResponse.class);
	}

	@Override
	public UserResponse addUser(UserRequest userDetails) {
		ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        System.out.println(userDetails);
        UserDto userDto=mapper.map(userDetails,UserDto.class);
        User userEntity=mapper.map(userDto, User.class);
        userRepository.save(userEntity);
        return mapper.map(userDto,UserResponse.class);
	}

}
