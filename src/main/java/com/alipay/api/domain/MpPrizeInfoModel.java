package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销奖品模型
 *
 * @author auto create
 * @since 1.0, 2016-06-29 19:23:42
 */
public class MpPrizeInfoModel extends AlipayObject {

	private static final long serialVersionUID = 3825963113213939955L;

	/**
	 * 凭证id
	 */
	@ApiField("certlot_number")
	private String certlotNumber;

	/**
	 * 奖品频率对应的次数，数值，最大999999
	 */
	@ApiField("frequency_count")
	private String frequencyCount;

	/**
	 * 奖品中奖频率类型: D，每自然日；W，每自然周（从周一至周日）；M，每自然月
	 */
	@ApiField("frequency_type")
	private String frequencyType;

	/**
	 * 奖品结束时间，yyyy-mm-dd 00:00:00格式，大于起始时间
	 */
	@ApiField("prize_end_time")
	private String prizeEndTime;

	/**
	 * 1. 创建时不用填； 2. 查询时会返回； 3. 修改活动时，如果不填prize_id,则会新增一个奖品，并且以覆盖的形式执行，如果填原有的prize_id则修改奖品信息。
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品中奖次数，数值，最大999999，该属性不支持修改，修改时透传处理
	 */
	@ApiField("prize_max_award_limit")
	private String prizeMaxAwardLimit;

	/**
	 * 奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 奖品开始时间，yyyy-mm-dd 00:00:00格式
	 */
	@ApiField("prize_start_time")
	private String prizeStartTime;

	/**
	 * 奖品数量，数值，最大999999
	 */
	@ApiField("prize_total")
	private String prizeTotal;

	/**
	 * 奖品类型，CAMP_COUPON_PRIZE，定额红包奖品；CAMP_DYNAMIC_COUPON_PRIZE，不定额红包奖品；CAMP_POINT_PRIZE，定额积分奖品；CAMP_SECRET_CARD_PRIZE，卡密奖品；CAMP_DYNAMIC_POINT_PRIZE，不定额积分奖品；CAMP_DYNAMIC_CASH_PRIZE，不定额现金奖品；CAMP_DYNAMIC_POINT_PRIZE，不定额支付宝积分奖品；CAMP_GROWTH_POINT_PRIZE，成长点奖品；CAMP_ENTITY_PRIZE，实物奖品；CAMP_COMPOSE_PRIZE，组合奖品；CAMP_PREPAYCARD_PRIZE，预付卡奖品；CAMP_DYNAMIC_PREPAYCARD_PRIZE，不定额预付卡奖品；CAMP_UNIFIED_PRIZE，自定义奖品；CAMP_CERT_PRIZE，凭证奖品；CAMP_SOLITAIRE_SEED_PRIZE，接龙种子奖品，目前支持凭证奖品
	 */
	@ApiField("prize_type")
	private String prizeType;

	public String getCertlotNumber() {
		return this.certlotNumber;
	}
	public void setCertlotNumber(String certlotNumber) {
		this.certlotNumber = certlotNumber;
	}

	public String getFrequencyCount() {
		return this.frequencyCount;
	}
	public void setFrequencyCount(String frequencyCount) {
		this.frequencyCount = frequencyCount;
	}

	public String getFrequencyType() {
		return this.frequencyType;
	}
	public void setFrequencyType(String frequencyType) {
		this.frequencyType = frequencyType;
	}

	public String getPrizeEndTime() {
		return this.prizeEndTime;
	}
	public void setPrizeEndTime(String prizeEndTime) {
		this.prizeEndTime = prizeEndTime;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeMaxAwardLimit() {
		return this.prizeMaxAwardLimit;
	}
	public void setPrizeMaxAwardLimit(String prizeMaxAwardLimit) {
		this.prizeMaxAwardLimit = prizeMaxAwardLimit;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizeStartTime() {
		return this.prizeStartTime;
	}
	public void setPrizeStartTime(String prizeStartTime) {
		this.prizeStartTime = prizeStartTime;
	}

	public String getPrizeTotal() {
		return this.prizeTotal;
	}
	public void setPrizeTotal(String prizeTotal) {
		this.prizeTotal = prizeTotal;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

}
