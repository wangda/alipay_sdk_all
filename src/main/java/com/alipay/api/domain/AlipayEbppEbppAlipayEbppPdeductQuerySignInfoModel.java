package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直连代扣协议查询接口
 *
 * @author auto create
 * @since 1.0, 2016-07-21 19:16:44
 */
public class AlipayEbppEbppAlipayEbppPdeductQuerySignInfoModel extends AlipayObject {

	private static final long serialVersionUID = 7553635954738871997L;

	/**
	 * 支付宝代扣协议Id
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
