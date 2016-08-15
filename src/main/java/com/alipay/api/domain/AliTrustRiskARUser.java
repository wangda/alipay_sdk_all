package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安融征信风险名单返回对象
 *
 * @author auto create
 * @since 1.0, 2014-02-26 09:43:32
 */
public class AliTrustRiskARUser extends AlipayObject {

	private static final long serialVersionUID = 1688454366192463482L;

	/**
	 * 担保方式
	 */
	@ApiField("assure_type")
	private String assureType;

	/**
	 * 加入黑名单原因
	 */
	@ApiField("black_reason")
	private String blackReason;

	/**
	 * 加入黑名单时间
	 */
	@ApiField("create_time_string")
	private String createTimeString;

	/**
	 * 现住址
	 */
	@ApiField("current_place")
	private String currentPlace;

	/**
	 * 借款人姓名
	 */
	@ApiField("customer_name")
	private String customerName;

	/**
	 * 电子邮件
	 */
	@ApiField("email")
	private String email;

	/**
	 * 是否在安融风险名单
	 */
	@ApiField("is_black")
	private Boolean isBlack;

	/**
	 * 最后一次逾期日期
	 */
	@ApiField("lastoverdate")
	private String lastoverdate;

	/**
	 * 借款地点
	 */
	@ApiField("loan_address")
	private String loanAddress;

	/**
	 * 借款开始日期
	 */
	@ApiField("loan_start_date")
	private String loanStartDate;

	/**
	 * 借款类型
	 */
	@ApiField("loan_type")
	private String loanType;

	/**
	 * 最长逾期天数
	 */
	@ApiField("max_days")
	private String maxDays;

	/**
	 * 户籍地址
	 */
	@ApiField("native_place")
	private String nativePlace;

	/**
	 * 逾期期数
	 */
	@ApiField("over_count")
	private String overCount;

	/**
	 * 借款人身份证号
	 */
	@ApiField("paper_number")
	private String paperNumber;

	/**
	 * 黑名单来源
	 */
	@ApiField("source_organ")
	private String sourceOrgan;

	/**
	 * 欠款总额
	 */
	@ApiField("sum_money")
	private String sumMoney;

	/**
	 * 电话
	 */
	@ApiField("telephone")
	private String telephone;

	public String getAssureType() {
		return this.assureType;
	}
	public void setAssureType(String assureType) {
		this.assureType = assureType;
	}

	public String getBlackReason() {
		return this.blackReason;
	}
	public void setBlackReason(String blackReason) {
		this.blackReason = blackReason;
	}

	public String getCreateTimeString() {
		return this.createTimeString;
	}
	public void setCreateTimeString(String createTimeString) {
		this.createTimeString = createTimeString;
	}

	public String getCurrentPlace() {
		return this.currentPlace;
	}
	public void setCurrentPlace(String currentPlace) {
		this.currentPlace = currentPlace;
	}

	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIsBlack() {
		return this.isBlack;
	}
	public void setIsBlack(Boolean isBlack) {
		this.isBlack = isBlack;
	}

	public String getLastoverdate() {
		return this.lastoverdate;
	}
	public void setLastoverdate(String lastoverdate) {
		this.lastoverdate = lastoverdate;
	}

	public String getLoanAddress() {
		return this.loanAddress;
	}
	public void setLoanAddress(String loanAddress) {
		this.loanAddress = loanAddress;
	}

	public String getLoanStartDate() {
		return this.loanStartDate;
	}
	public void setLoanStartDate(String loanStartDate) {
		this.loanStartDate = loanStartDate;
	}

	public String getLoanType() {
		return this.loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getMaxDays() {
		return this.maxDays;
	}
	public void setMaxDays(String maxDays) {
		this.maxDays = maxDays;
	}

	public String getNativePlace() {
		return this.nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public String getOverCount() {
		return this.overCount;
	}
	public void setOverCount(String overCount) {
		this.overCount = overCount;
	}

	public String getPaperNumber() {
		return this.paperNumber;
	}
	public void setPaperNumber(String paperNumber) {
		this.paperNumber = paperNumber;
	}

	public String getSourceOrgan() {
		return this.sourceOrgan;
	}
	public void setSourceOrgan(String sourceOrgan) {
		this.sourceOrgan = sourceOrgan;
	}

	public String getSumMoney() {
		return this.sumMoney;
	}
	public void setSumMoney(String sumMoney) {
		this.sumMoney = sumMoney;
	}

	public String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
