package com.nagraj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagraj.model.User;

public interface UserDao extends JpaRepository<User,Integer> {

}
