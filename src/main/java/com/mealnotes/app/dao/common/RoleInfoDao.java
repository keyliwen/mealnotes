package com.mealnotes.app.dao.common;

import com.mealnotes.app.beans.common.user.RoleInfo;

/**
 * 功能描述：角色操作DAO接口
 * 创建时间：2015/1/23
 * @author liwen
 *
 */
public interface RoleInfoDao {
	/**
	 * 功能描述：根据权限id获取角色信息
	 * 创建时间：2015/1/23
	 * @author liwen
	 * @param id
	 * @return
	 */
	public RoleInfo findRoleInfoById(int id);
}
