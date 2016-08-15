package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝的todo消息
 *
 * @author auto create
 * @since 1.0, 2013-07-08 11:20:18
 */
public class TodoRemind extends AlipayObject {

	private static final long serialVersionUID = 7468137667631617553L;

	/**
	 * 所属产品、即消息标签。如付款、代付
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 消息id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 消息标题
	 */
	@ApiField("title")
	private String title;

	/**
	 * 支付宝账号
	 */
	@ApiField("user_id")
	private String userId;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
