package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品发放规则
 *
 * @author auto create
 * @since 1.0, 2016-07-28 13:35:08
 */
public class SendRule extends AlipayObject {

	private static final long serialVersionUID = 4373434271489727337L;

	/**
	 * 发券最低消费金额，单位元
活动类型为消费送且不是消费送礼包时设置
多营销工具之间不允许设置重复值
	 */
	@ApiField("min_cost")
	private String minCost;

	/**
	 * 发券数目
最少发1张券，最多发5张券
	 */
	@ApiField("send_num")
	private String sendNum;

	public String getMinCost() {
		return this.minCost;
	}
	public void setMinCost(String minCost) {
		this.minCost = minCost;
	}

	public String getSendNum() {
		return this.sendNum;
	}
	public void setSendNum(String sendNum) {
		this.sendNum = sendNum;
	}

}
