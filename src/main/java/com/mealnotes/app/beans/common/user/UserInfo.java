package com.mealnotes.app.beans.common.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 功能描述：用户信息
 * 创建时间：2015/1/22
 * @author liwen
 *
 */
@Entity
@Table(name="user_info")
public class UserInfo {
	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private int id;
	
	@Column(name="USER_USERNAME")
	private String username;
	
	@Column(name="USER_PASSWORD")
	private String password;
	
	@Column(name="USER_VALID")
	private boolean valid;
	
	@Column(name="OTHER_INFO_ID")
	private int otherInfoId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public int getOtherInfoId() {
		return otherInfoId;
	}
	public void setOtherInfoId(int otherInfoId) {
		this.otherInfoId = otherInfoId;
	}
	
	
}
