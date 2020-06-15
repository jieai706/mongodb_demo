package com.jieai.test;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jieai.dao.UserDao;
import com.jieai.entity.User;

@SpringBootTest
public class TestController {

	@Autowired
	private UserDao userDao;
	
	@Test
	@Disabled
	public void testMongoInsert(){
		User user = new User();
        //userEntity.setId(1L);
		user.setUsername("hmily");
        userDao.insert(user);
    }
	
	@Test
	public void testMongoSelect(){
//		List<User> users = userDao.findAll();
		List<User> users = userDao.findByUsernameLike("hm");
        for (User u : users){
            System.out.println(u.getId() + u.getUsername());
        }
    }
}
