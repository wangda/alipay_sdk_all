package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用用于描述实名制注册的用户信息的数据结构
 *
 * @author auto create
 * @since 1.0, 2014-04-11 13:44:04
 */
public class AliTrustRealNameRegistration extends AlipayObject {

	private static final long serialVersionUID = 7573158248723491747L;

	/**
	 * 用户出生日期
	 */
	@ApiField("birthday")
	private Date birthday;

	/**
	 * 点击实名制logo跳转链接
	 */
	@ApiField("forward_url")
	private String forwardUrl;

	/**
	 * 用户性别(M：男性/F：女性)
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 实名制logo
	 */
	@ApiField("icon_url")
	private String iconUrl;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 当账户为实名制注册时,取值为"T";否则为"F".
	 */
	@ApiField("real_name_registered")
	private String realNameRegistered;

	public Date getBirthday() {
		return this.birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getForwardUrl() {
		return this.forwardUrl;
	}
	public void setForwardUrl(String forwardUrl) {
		this.forwardUrl = forwardUrl;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIconUrl() {
		return this.iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRealNameRegistered() {
		return this.realNameRegistered;
	}
	public void setRealNameRegistered(String realNameRegistered) {
		this.realNameRegistered = realNameRegistered;
	}

}
