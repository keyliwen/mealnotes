package com.mealnotes.app.dao.common.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mealnotes.app.beans.common.user.RoleInfo;
import com.mealnotes.app.dao.common.RoleInfoDao;

@Repository
public class RoleInfoDaoImpl implements RoleInfoDao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public RoleInfo findRoleInfoById(int id) {
		RoleInfo roleInfo = null;
		try {
			roleInfo = (RoleInfo)sessionFactory.getCurrentSession().get(RoleInfo.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return roleInfo;
	}
	
	
}
