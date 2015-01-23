package com.mealnotes.app.beans.common.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 功能描述：角色资源访问信息
 * 创建时间：2015/1/22
 * @author liwen
 *
 */
@Entity
@Table(name="role_resource")
public class RoleResource {
	
	@Id
	@Column(name="ROLE_RESOURCE_ID")
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private int id;
	
	@Column(name="ROLE_ID")
	private int roleId;
	
	@Column(name="RESOURCE_ID")
	private int resourceId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	
	
}
