package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业对公账户信息
 *
 * @author auto create
 * @since 1.0, 2016-07-28 23:35:23
 */
public class BusinessBankAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 8278751211134848487L;

	/**
	 * 企业对公账户名称
	 */
	@ApiField("business_bank_account_name")
	private String businessBankAccountName;

	/**
	 * 企业对公银行账户号
	 */
	@ApiField("business_bank_card_no")
	private String businessBankCardNo;

	/**
	 * 企业对公账户开户行所在城市，使用国家行政区划代码，可参考http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/
	 */
	@ApiField("business_bank_city")
	private String businessBankCity;

	/**
	 * 企业对公账户开户行名称
	 */
	@ApiField("business_bank_name")
	private String businessBankName;

	/**
	 * 企业对公账户开户行所在省份，使用国家行政区划代码，可参考http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/
	 */
	@ApiField("business_bank_province")
	private String businessBankProvince;

	/**
	 * 企业对公账户开户行支行全称
	 */
	@ApiField("business_bank_sub")
	private String businessBankSub;

	public String getBusinessBankAccountName() {
		return this.businessBankAccountName;
	}
	public void setBusinessBankAccountName(String businessBankAccountName) {
		this.businessBankAccountName = businessBankAccountName;
	}

	public String getBusinessBankCardNo() {
		return this.businessBankCardNo;
	}
	public void setBusinessBankCardNo(String businessBankCardNo) {
		this.businessBankCardNo = businessBankCardNo;
	}

	public String getBusinessBankCity() {
		return this.businessBankCity;
	}
	public void setBusinessBankCity(String businessBankCity) {
		this.businessBankCity = businessBankCity;
	}

	public String getBusinessBankName() {
		return this.businessBankName;
	}
	public void setBusinessBankName(String businessBankName) {
		this.businessBankName = businessBankName;
	}

	public String getBusinessBankProvince() {
		return this.businessBankProvince;
	}
	public void setBusinessBankProvince(String businessBankProvince) {
		this.businessBankProvince = businessBankProvince;
	}

	public String getBusinessBankSub() {
		return this.businessBankSub;
	}
	public void setBusinessBankSub(String businessBankSub) {
		this.businessBankSub = businessBankSub;
	}

}
