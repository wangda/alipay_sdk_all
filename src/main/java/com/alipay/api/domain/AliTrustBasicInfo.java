package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻信用用户基本信息，包括姓名、性别、生日
 *
 * @author auto create
 * @since 1.0, 2014-04-11 13:44:11
 */
public class AliTrustBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 3667883164365491311L;

	/**
	 * 用户出生日期
	 */
	@ApiField("birthday")
	private Date birthday;

	/**
	 * 用户性别(M/F)
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 是否通过芝麻认证：T是  F否
	 */
	@ApiField("is_certified")
	private String isCertified;

	/**
	 * 当用户未通过芝麻认证时给出的原因提示
	 */
	@ApiField("message")
	private String message;

	/**
	 * 用户姓名
	 */
	@ApiField("name")
	private String name;

	public Date getBirthday() {
		return this.birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIsCertified() {
		return this.isCertified;
	}
	public void setIsCertified(String isCertified) {
		this.isCertified = isCertified;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
