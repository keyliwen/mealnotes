package com.mealnotes.app.beans.common.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 功能描述：访问资源信息
 * 创建时间：2015/1/22
 * @author liwen
 *
 */
@Entity
@Table(name="resource_info")
public class ResourceInfo {
	
	@Id
	@Column(name="RESOURCE_ID")
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	private int id;
	
	@Column(name="RESOURCE_NAME")
	private String name;
	
	@Column(name="RESOURCE_URL")
	private String url;
	
	@Column(name="RESOURCE_TYPE")
	private int type;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
