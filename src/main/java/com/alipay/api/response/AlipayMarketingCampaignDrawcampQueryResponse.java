package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MpPrizeInfoModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.drawcamp.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-08 11:28:45
 */
public class AlipayMarketingCampaignDrawcampQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8871315218117523232L;

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
	 * 活动中奖次数，最大999999999
	 */
	@ApiField("award_count")
	private String awardCount;

	/** 
	 * 活动奖品总中奖几率，99对应99%
	 */
	@ApiField("award_rate")
	private String awardRate;

	/** 
	 * 活动唯一标识，外围传入，活动别名
	 */
	@ApiField("camp_code")
	private String campCode;

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
	 * 活动状态，CAMP_CREATED(已创建状态)，CAMP_PAUSED(暂停状态)，CAMP_ENDED(结束状态)，CAMP_GOING(启动状态)
	 */
	@ApiField("camp_status")
	private String campStatus;

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
	 * 创建者，系统默认获取创建者id进行填充
	 */
	@ApiField("creator")
	private String creator;

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

	public void setAccountCount(String accountCount) {
		this.accountCount = accountCount;
	}
	public String getAccountCount( ) {
		return this.accountCount;
	}

	public void setAppidCount(String appidCount) {
		this.appidCount = appidCount;
	}
	public String getAppidCount( ) {
		return this.appidCount;
	}

	public void setAwardCount(String awardCount) {
		this.awardCount = awardCount;
	}
	public String getAwardCount( ) {
		return this.awardCount;
	}

	public void setAwardRate(String awardRate) {
		this.awardRate = awardRate;
	}
	public String getAwardRate( ) {
		return this.awardRate;
	}

	public void setCampCode(String campCode) {
		this.campCode = campCode;
	}
	public String getCampCode( ) {
		return this.campCode;
	}

	public void setCampEndTime(String campEndTime) {
		this.campEndTime = campEndTime;
	}
	public String getCampEndTime( ) {
		return this.campEndTime;
	}

	public void setCampId(String campId) {
		this.campId = campId;
	}
	public String getCampId( ) {
		return this.campId;
	}

	public void setCampName(String campName) {
		this.campName = campName;
	}
	public String getCampName( ) {
		return this.campName;
	}

	public void setCampStartTime(String campStartTime) {
		this.campStartTime = campStartTime;
	}
	public String getCampStartTime( ) {
		return this.campStartTime;
	}

	public void setCampStatus(String campStatus) {
		this.campStatus = campStatus;
	}
	public String getCampStatus( ) {
		return this.campStatus;
	}

	public void setCertRuleId(String certRuleId) {
		this.certRuleId = certRuleId;
	}
	public String getCertRuleId( ) {
		return this.certRuleId;
	}

	public void setCertificationCount(String certificationCount) {
		this.certificationCount = certificationCount;
	}
	public String getCertificationCount( ) {
		return this.certificationCount;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreator( ) {
		return this.creator;
	}

	public void setMobileCount(String mobileCount) {
		this.mobileCount = mobileCount;
	}
	public String getMobileCount( ) {
		return this.mobileCount;
	}

	public void setPrizeList(List<MpPrizeInfoModel> prizeList) {
		this.prizeList = prizeList;
	}
	public List<MpPrizeInfoModel> getPrizeList( ) {
		return this.prizeList;
	}

	public void setPromoRuleId(String promoRuleId) {
		this.promoRuleId = promoRuleId;
	}
	public String getPromoRuleId( ) {
		return this.promoRuleId;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}
	public String getTriggerType( ) {
		return this.triggerType;
	}

	public void setTriggerUserRuleId(String triggerUserRuleId) {
		this.triggerUserRuleId = triggerUserRuleId;
	}
	public String getTriggerUserRuleId( ) {
		return this.triggerUserRuleId;
	}

	public void setUserRuleId(String userRuleId) {
		this.userRuleId = userRuleId;
	}
	public String getUserRuleId( ) {
		return this.userRuleId;
	}

}
