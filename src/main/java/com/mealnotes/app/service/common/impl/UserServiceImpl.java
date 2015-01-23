package com.mealnotes.app.service.common.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mealnotes.app.beans.common.user.UserInfo;
import com.mealnotes.app.dao.common.UserInfoDao;
import com.mealnotes.app.service.common.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserInfoDao userDao;

	@Override
	public UserInfo findUserInfoByUsername(String username) {
		return userDao.findUserInfoByUsername(username);
	}

	@Override
	public UserInfo findUserInfoByUsernameAndPwd(String username,
			String password) {
		return userDao.findUserInfoByUsernameAndPwd(username, password);
	}
	
	
}
