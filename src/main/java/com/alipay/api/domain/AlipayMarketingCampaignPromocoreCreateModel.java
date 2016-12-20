package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销抽奖活动创建
 *
 * @author auto create
 * @since 1.0, 2016-06-08 11:28:24
 */
public class AlipayMarketingCampaignPromocoreCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5326247243334146587L;

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
	 * 活动中奖次数，最大999999
	 */
	@ApiField("award_count")
	private String awardCount;

	/**
	 * 活动奖品总中奖几率，99对应99%
	 */
	@ApiField("award_rate")
	private String awardRate;

	/**
	 * 活动唯一标示,创建时外围必传，幂等性id，活动别名，创建后不能修改。系统会加上前缀，查询返回时会大于32位。
	 */
	@ApiField("camp_code")
	private String campCode;

	/**
	 * 活动开始时间，yyyy-MM-dd HH:00:00格式(到日)，需要大于活动起始时间
	 */
	@ApiField("camp_end_time")
	private String campEndTime;

	/**
	 * 活动名称
	 */
	@ApiField("camp_name")
	private String campName;

	/**
	 * 活动开始时间，yyyy-MM-dd HH:00:00格式（到日）
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
	 * 奖品模型，至少需要配置一个奖品
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
	 * 活动触发类型，目前支持CAMP_USER_TRIGGER，用户触发；CAMP_SYS_TRIGGER，系统触发。
	 */
	@ApiField("trigger_type")
	private String triggerType;

	/**
	 * 实时人群验证规则id
	 */
	@ApiField("trigger_user_rule_id")
	private String triggerUserRuleId;

	/**
	 * 人群验证规则ID
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

	public String getAwardCount() {
		return this.awardCount;
	}
	public void setAwardCount(String awardCount) {
		this.awardCount = awardCount;
	}

	public String getAwardRate() {
		return this.awardRate;
	}
	public void setAwardRate(String awardRate) {
		this.awardRate = awardRate;
	}

	public String getCampCode() {
		return this.campCode;
	}
	public void setCampCode(String campCode) {
		this.campCode = campCode;
	}

	public String getCampEndTime() {
		return this.campEndTime;
	}
	public void setCampEndTime(String campEndTime) {
		this.campEndTime = campEndTime;
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

	public String getTriggerType() {
		return this.triggerType;
	}
	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}

	public String getTriggerUserRuleId() {
		return this.triggerUserRuleId;
	}
	public void setTriggerUserRuleId(String triggerUserRuleId) {
		this.triggerUserRuleId = triggerUserRuleId;
	}

	public String getUserRuleId() {
		return this.userRuleId;
	}
	public void setUserRuleId(String userRuleId) {
		this.userRuleId = userRuleId;
	}

}
