package com.mealnotes.app.dao.common;

import java.util.List;

import com.mealnotes.app.beans.common.user.UserRole;

/**
 * 功能描述：用户角色操作DAO接口
 * 创建日期：2015/1/23
 * @author liwen
 *
 */
public interface UserRoleDao {
	/**
	 * 功能描述：根据id获取用户角色
	 * 创建日期：2015/1/23
	 * @author liwen
	 * @param id
	 * @return
	 */
	public UserRole findUserRoleById(int id);
	/**
	 * 功能描述：根据用户id获取用户角色信息
	 * 创建日期：2015/1/23
	 * @author liwen
	 * @param userId
	 * @return
	 */
	public List<UserRole> findUserRolesByUserId(int userId);
}
