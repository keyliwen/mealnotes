package com.mealnotes.app.service.common;

import com.mealnotes.app.beans.common.user.UserInfo;

/**
 * 功能描述:用户操作service接口
 * 创建时间：2015/1/22
 * @author liwen
 *
 */
public interface UserService {
	/**
	 * 功能描述：根据用户名查询用户
	 * 创建时间：2015/1/22
	 * @author liwen
	 * @param username
	 * @return
	 */
	public UserInfo findUserInfoByUsername(String username);
	/**
	 * 功能描述：根据用户名和密码查询用户
	 * 创建时间：2015/1/22
	 * @author liwen
	 * @param username
	 * @return
	 */
	public UserInfo findUserInfoByUsernameAndPwd(String username, String password);
}
