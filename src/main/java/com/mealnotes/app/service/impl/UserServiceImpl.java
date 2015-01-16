package com.mealnotes.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mealnotes.app.beans.User;
import com.mealnotes.app.dao.UserDao;
import com.mealnotes.app.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Transactional
	@Override
	public void addUser(User user) {
		userDao.add(user);
	}
	
	
}
