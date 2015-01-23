package com.mealnotes.app.dao.common.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mealnotes.app.beans.common.user.UserRole;
import com.mealnotes.app.dao.common.UserRoleDao;

@Repository
public class UserRoleDaoImpl implements UserRoleDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public UserRole findUserRoleById(int id) {
		UserRole userRole = null;
		try {
			userRole = (UserRole)sessionFactory.getCurrentSession().get(UserRole.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return userRole;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserRole> findUserRolesByUserId(int userId) {
		String hql = "from UserRole where userId = ?";
		List<UserRole> userRoles = null;
		try {
			userRoles = sessionFactory.getCurrentSession().createQuery(hql).setInteger(0, userId).list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return userRoles;
	}
	
	
}
