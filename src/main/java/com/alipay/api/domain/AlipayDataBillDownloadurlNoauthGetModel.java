package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 无授权模式的查询对账单下载地址
 *
 * @author auto create
 * @since 1.0, 2016-07-08 10:22:17
 */
public class AlipayDataBillDownloadurlNoauthGetModel extends AlipayObject {

	private static final long serialVersionUID = 7112128554846656397L;

	/**
	 * 账单时间：日账单格式为yyyy-MM-dd，月账单格式为yyyy-MM。
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 账单类型，目前支持的类型由：trade、air、air_b2b；trade指商户通过接口所获取的账单，或商户经开放平台授权后其所属服务商通过接口所获取的账单；air、air_b2b是航旅行业定制的账单，一般商户没有此账单。
	 */
	@ApiField("bill_type")
	private String billType;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

}
