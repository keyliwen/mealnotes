package com.mealnotes.app.service.common.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mealnotes.app.beans.common.user.RoleInfo;
import com.mealnotes.app.beans.common.user.UserInfo;
import com.mealnotes.app.beans.common.user.UserRole;
import com.mealnotes.app.dao.common.RoleInfoDao;
import com.mealnotes.app.dao.common.UserInfoDao;
import com.mealnotes.app.dao.common.UserRoleDao;

import org.springframework.security.core.authority.GrantedAuthorityImpl;
/**
 * 功能描述：该类从数据库获取用户信息和用户权限信息，提供给spring-security使用
 * 创建日期：2015/1/23
 * @author liwen
 *
 */
@Service
public class AppUserDetailServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserInfoDao userInfoDao;
	
	@Autowired
	private RoleInfoDao roleInfoDao;
	
	@Autowired
	private UserRoleDao userRoleDao;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		UserDetails userDetails = null;
		UserInfo userInfo = userInfoDao.findUserInfoByUsername(username);
		if (userInfo != null) {
			userDetails = new User(username, userInfo.getPassword(), 
					true, 
					true, 
					true, 
					true, 
					findUserAuthorities(userInfo));
		}
		return userDetails;
	}
	
	/**
	 * 功能描述：获取用户权限
	 * 创建日期：2015/1/23
	 * @author liwen
	 * @param userInfo
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public Collection<GrantedAuthority> findUserAuthorities(UserInfo userInfo){
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		List<UserRole> userRoles = null;
		userRoles = userRoleDao.findUserRolesByUserId(userInfo.getId());
		if (userRoles != null) {
			List<RoleInfo> roles = new ArrayList<RoleInfo>();
			for (UserRole userRole : userRoles) {
				RoleInfo role = roleInfoDao.findRoleInfoById(userRole.getRoleId());
				roles.add(role);
			}
			if (roles != null) {
				for (RoleInfo role : roles) {
					authorities.add(new GrantedAuthorityImpl(role.getName()));
				}
			}
		}
		return authorities;
	}
}
