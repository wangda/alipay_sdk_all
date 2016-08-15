package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 永不停机预警处理结果
 *
 * @author auto create
 * @since 1.0, 2013-04-27 20:21:09
 */
public class EvercallAlertResult extends AlipayObject {

	private static final long serialVersionUID = 1338122759529185869L;

	/**
	 * 签约手机号
	 */
	@ApiField("mobile_no")
	private String mobileNo;

	/**
	 * 预警接收结果
	 */
	@ApiField("return_code")
	private String returnCode;

	/**
	 * 支付宝账户号
	 */
	@ApiField("user_id")
	private String userId;

	public String getMobileNo() {
		return this.mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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
