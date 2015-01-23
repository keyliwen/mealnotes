package com.mealnotes.app.beans.common.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 功能描述：角色信息
 * 创建时间：2015/1/22
 * @author liwen
 *
 */
@Entity
@Table(name="role_info")
public class RoleInfo {
	@Id
	@Column(name="ROLE_ID")
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private int id;
	
	@Column(name="ROLE_NAME")
	private String name;
	
	@Column(name="ROLE_DESCRIPTION")
	private String description;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
