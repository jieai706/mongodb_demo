package com.jieai.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jieai.entity.User;

public interface UserDao extends MongoRepository<User, String> {

//	User findByUsername(String username);
	
	/**
     * Like（模糊查询）
     * {"username" : name} ( name as regex)
     * */
    List<User> findByUsernameLike(String username);

    /**
     * Like（模糊查询）
     * {"username" : name}
     * */
    List<User> findByUsername(String username);
}
