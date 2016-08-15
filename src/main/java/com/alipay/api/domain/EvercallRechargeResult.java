package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 永不停机充值结果
 *
 * @author auto create
 * @since 1.0, 2013-04-27 20:21:17
 */
public class EvercallRechargeResult extends AlipayObject {

	private static final long serialVersionUID = 1669717769552736215L;

	/**
	 * 外部商户订单号
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 签约手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 支付宝单据号
	 */
	@ApiField("recharge_order_no")
	private String rechargeOrderNo;

	/**
	 * 充值处理结果
	 */
	@ApiField("return_code")
	private String returnCode;

	/**
	 * 支付宝账户号
	 */
	@ApiField("user_id")
	private String userId;

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getRechargeOrderNo() {
		return this.rechargeOrderNo;
	}
	public void setRechargeOrderNo(String rechargeOrderNo) {
		this.rechargeOrderNo = rechargeOrderNo;
	}

	public String getReturnCode() {
		return this.returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
