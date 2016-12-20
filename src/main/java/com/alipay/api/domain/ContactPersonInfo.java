package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业联系人信息
 *
 * @author auto create
 * @since 1.0, 2016-07-28 23:35:16
 */
public class ContactPersonInfo extends AlipayObject {

	private static final long serialVersionUID = 1335961493668427819L;

	/**
	 * 联系人邮箱地址，入驻申请审核结果会发送至该邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 联系人手机号，入驻申请结果会通过短信的形式发送至该手机号码
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 企业联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	public String getContactEmail() {
		return this.contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactMobile() {
		return this.contactMobile;
	}
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}

	public String getContactName() {
		return this.contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

}
