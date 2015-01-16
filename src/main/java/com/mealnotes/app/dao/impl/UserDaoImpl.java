package com.mealnotes.app.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mealnotes.app.beans.User;
import com.mealnotes.app.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void add(User user) {
		sessionFactory.getCurrentSession().save(user);
	}
	
}
