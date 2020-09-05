package com.casestudy.nagraj.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casestudy.nagraj.user.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	User findByUnameAndPassword(String uname, String password);
}
