package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行二清商户入驻接口
 *
 * @author auto create
 * @since 1.0, 2016-07-13 17:19:03
 */
public class AlipayBossProdSubmerchantCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8586278751641756742L;

	/**
	 * 二级商户简称
	 */
	@ApiField("alias_name")
	private String aliasName;

	/**
	 * 经营类目，参考开放平台口碑开放行业入驻要求
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 联系人邮箱
	 */
	@ApiField("contact_email")
	private String contactEmail;

	/**
	 * 联系人手机号
	 */
	@ApiField("contact_mobile")
	private String contactMobile;

	/**
	 * 联系人名称
	 */
	@ApiField("contact_name")
	private String contactName;

	/**
	 * 联系人电话
	 */
	@ApiField("contact_phone")
	private String contactPhone;

	/**
	 * 二级商户编号，由受理机构定义，需要保证在受理机构下唯一
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 商户备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 二级商户名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 客服电话
	 */
	@ApiField("service_phone")
	private String servicePhone;

	/**
	 * 商户来源机构标识，填写受理机构在支付宝的pid
	 */
	@ApiField("source")
	private String source;

	public String getAliasName() {
		return this.aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

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

	public String getContactPhone() {
		return this.contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getServicePhone() {
		return this.servicePhone;
	}
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
