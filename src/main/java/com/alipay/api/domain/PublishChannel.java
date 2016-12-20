package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放渠道
 *
 * @author auto create
 * @since 1.0, 2016-07-28 13:35:08
 */
public class PublishChannel extends AlipayObject {

	private static final long serialVersionUID = 3258115131395394469L;

	/**
	 * 渠道配置，无需配置
	 */
	@ApiField("config")
	private String config;

	/**
	 * 扩展信息，无需配置
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 渠道名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 渠道类型，目前支持以下类型
QR_CODE：二维码投放
SHORT_LINK：短连接投放
SHOP_DETAIL：店铺页投放
PAYMENT_RESULT：支付成功页
MERCHANT_CROWD：口令送
	 */
	@ApiField("type")
	private String type;

	public String getConfig() {
		return this.config;
	}
	public void setConfig(String config) {
		this.config = config;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
