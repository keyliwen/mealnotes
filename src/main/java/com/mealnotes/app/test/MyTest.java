package com.mealnotes.app.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.mealnotes.app.beans.common.user.RoleInfo;
import com.mealnotes.app.dao.common.RoleInfoDao;
import com.mealnotes.app.dao.common.UserInfoDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/applicationContext.xml")
@Transactional
public class MyTest {
	@Autowired
	private UserInfoDao userInfoDao;
	@Autowired 
	private RoleInfoDao roleInfoDao;
	@Test
	public void testDao(){
		RoleInfo roleInfo = roleInfoDao.findRoleInfoById(1);
		System.out.println(roleInfo.getName());
	}
}
