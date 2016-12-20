package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险干系人
 *
 * @author auto create
 * @since 1.0, 2016-07-22 13:36:41
 */
public class InsPerson extends AlipayObject {

	private static final long serialVersionUID = 6342449247853242351L;

	/**
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 支付宝资金账户;投保人用于支付保费,被保人用作理赔金收入账户
	 */
	@ApiField("alipay_account_no")
	private String alipayAccountNo;

	/**
	 * 生日
	 */
	@ApiField("birthday")
	private Date birthday;

	/**
	 * 投保参数;标准json格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 渠道账号对应的uid;如果证件类型字段没填则必填
	 */
	@ApiField("channel_account_id")
	private String channelAccountId;

	/**
	 * 渠道账号类型;1:支付宝账号 2:淘宝账号;如果证件类型字段没填则必填
	 */
	@ApiField("channel_account_type")
	private String channelAccountType;

	/**
	 * 邮箱
	 */
	@ApiField("email")
	private String email;

	/**
	 * 性别;M:男 F:女
	 */
	@ApiField("gender")
	private String gender;

	/**
	 * 证件上名称;如果渠道账号字段没填则必填
	 */
	@ApiField("id_card_name")
	private String idCardName;

	/**
	 * 证件号码;如果渠道账号字段没填则必填
	 */
	@ApiField("id_card_no")
	private String idCardNo;

	/**
	 * 证件类型;如果渠道账号字段没填则必填 
100:居民身份证;102:护照;103:军官证;104:士兵证;105:港澳居民往来内地通行证;106:台湾同胞往来大陆通行证;109:警官证
	 */
	@ApiField("id_card_type")
	private String idCardType;

	/**
	 * 电话号码
	 */
	@ApiField("phone")
	private String phone;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getAlipayAccountNo() {
		return this.alipayAccountNo;
	}
	public void setAlipayAccountNo(String alipayAccountNo) {
		this.alipayAccountNo = alipayAccountNo;
	}

	public Date getBirthday() {
		return this.birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getChannelAccountId() {
		return this.channelAccountId;
	}
	public void setChannelAccountId(String channelAccountId) {
		this.channelAccountId = channelAccountId;
	}

	public String getChannelAccountType() {
		return this.channelAccountType;
	}
	public void setChannelAccountType(String channelAccountType) {
		this.channelAccountType = channelAccountType;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return this.gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdCardName() {
		return this.idCardName;
	}
	public void setIdCardName(String idCardName) {
		this.idCardName = idCardName;
	}

	public String getIdCardNo() {
		return this.idCardNo;
	}
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public String getIdCardType() {
		return this.idCardType;
	}
	public void setIdCardType(String idCardType) {
		this.idCardType = idCardType;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
