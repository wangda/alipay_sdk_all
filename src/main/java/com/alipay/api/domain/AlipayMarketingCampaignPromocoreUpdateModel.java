package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销抽奖活动修改
 *
 * @author auto create
 * @since 1.0, 2016-06-29 19:21:28
 */
public class AlipayMarketingCampaignPromocoreUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 4431567256473286528L;

	/**
	 * 账户参与次数，数值
	 */
	@ApiField("account_count")
	private String accountCount;

	/**
	 * 设备appid参与次数，数值
	 */
	@ApiField("appid_count")
	private String appidCount;

	/**
	 * 活动奖品总中奖几率，99对应99%
	 */
	@ApiField("award_rate")
	private String awardRate;

	/**
	 * 活动结束时间，yyyy-mm-dd 00:00:00格式，大于起始时间
	 */
	@ApiField("camp_end_time")
	private String campEndTime;

	/**
	 * 活动id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 活动名称
	 */
	@ApiField("camp_name")
	private String campName;

	/**
	 * 活动开始时间，yyyy-mm-dd 00:00:00格式
	 */
	@ApiField("camp_start_time")
	private String campStartTime;

	/**
	 * 凭证验证规则id
	 */
	@ApiField("cert_rule_id")
	private String certRuleId;

	/**
	 * 账户证件号参与次数，数值
	 */
	@ApiField("certification_count")
	private String certificationCount;

	/**
	 * 手机号参与次数，数值
	 */
	@ApiField("mobile_count")
	private String mobileCount;

	/**
	 * 奖品模型，至少有一个奖品模型
	 */
	@ApiListField("prize_list")
	@ApiField("mp_prize_info_model")
	private List<MpPrizeInfoModel> prizeList;

	/**
	 * 营销验证规则id
	 */
	@ApiField("promo_rule_id")
	private String promoRuleId;

	/**
	 * 人群验证规则
	 */
	@ApiField("user_rule_id")
	private String userRuleId;

	public String getAccountCount() {
		return this.accountCount;
	}
	public void setAccountCount(String accountCount) {
		this.accountCount = accountCount;
	}

	public String getAppidCount() {
		return this.appidCount;
	}
	public void setAppidCount(String appidCount) {
		this.appidCount = appidCount;
	}

	public String getAwardRate() {
		return this.awardRate;
	}
	public void setAwardRate(String awardRate) {
		this.awardRate = awardRate;
	}

	public String getCampEndTime() {
		return this.campEndTime;
	}
	public void setCampEndTime(String campEndTime) {
		this.campEndTime = campEndTime;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getCampName() {
		return this.campName;
	}
	public void setCampName(String campName) {
		this.campName = campName;
	}

	public String getCampStartTime() {
		return this.campStartTime;
	}
	public void setCampStartTime(String campStartTime) {
		this.campStartTime = campStartTime;
	}

	public String getCertRuleId() {
		return this.certRuleId;
	}
	public void setCertRuleId(String certRuleId) {
		this.certRuleId = certRuleId;
	}

	public String getCertificationCount() {
		return this.certificationCount;
	}
	public void setCertificationCount(String certificationCount) {
		this.certificationCount = certificationCount;
	}

	public String getMobileCount() {
		return this.mobileCount;
	}
	public void setMobileCount(String mobileCount) {
		this.mobileCount = mobileCount;
	}

	public List<MpPrizeInfoModel> getPrizeList() {
		return this.prizeList;
	}
	public void setPrizeList(List<MpPrizeInfoModel> prizeList) {
		this.prizeList = prizeList;
	}

	public String getPromoRuleId() {
		return this.promoRuleId;
	}
	public void setPromoRuleId(String promoRuleId) {
		this.promoRuleId = promoRuleId;
	}

	public String getUserRuleId() {
		return this.userRuleId;
	}
	public void setUserRuleId(String userRuleId) {
		this.userRuleId = userRuleId;
	}

}
