package com.mealnotes.app.beans.common.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 功能描述：用户角色信息
 * 创建时间：2015/1/22
 * @author liwen
 *
 */
@Entity
@Table(name="user_role")
public class UserRole {
	
	@Id
	@Column(name="USER_ROLE_ID")
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private int id;
	
	@Column(name="USER_ID")
	private int userId;
	
	@Column(name="ROLE_ID")
	private int roleId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	
}
