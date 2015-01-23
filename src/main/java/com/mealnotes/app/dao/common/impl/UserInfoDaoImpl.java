package com.mealnotes.app.dao.common.impl;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mealnotes.app.beans.common.user.UserInfo;
import com.mealnotes.app.dao.common.UserInfoDao;

@Repository
public class UserInfoDaoImpl implements UserInfoDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public UserInfo findUserInfoByUsername(String username) {
		UserInfo userInfo = null;
		String hql = "from UserInfo where username = ?";
		try {
			userInfo = (UserInfo)sessionFactory.getCurrentSession()
					.createQuery(hql)
					.setString(0, username)
					.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return userInfo;
	}

	@Override
	public UserInfo findUserInfoByUsernameAndPwd(String username,
			String password) {
		String hql = "from UserInfo u where u.username = ? and u.password = ?";
		UserInfo userInfo = null;
		try {
			userInfo = (UserInfo)sessionFactory.getCurrentSession()
					.createQuery(hql)
					.setString(0, username)
					.setString(1, password)
					.uniqueResult();
		} catch (Exception e) {
			return null;
		}
		return userInfo;
	}
	
	
	
}
