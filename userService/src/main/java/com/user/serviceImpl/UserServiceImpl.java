package com.user.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	List<User> userList =List.of(
			new User(1l,"nikhil","0388383"),
			new User(2l,"amit","39937393"),
			new User(3l,"jadhav","83387328")
			);
	
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return 	this.userList.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
