package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户会员券对象
 *
 * @author auto create
 * @since 1.0, 2015-03-24 15:45:38
 */
public class MerchantTicketModel extends AlipayObject {

	private static final long serialVersionUID = 4118824135194444826L;

	/**
	 * 券当前可用面额
	 */
	@ApiField("available_amt")
	private String availableAmt;

	/**
	 * 查询优惠劵类型，取值：
0：商户优惠券
1：商户红包
2：商户兑换券
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 抵扣金额，券初始面额
券优惠金额，可能为空             
格式：浮点类型数字 
精度：精确到小数点后2位
	 */
	@ApiField("discount_amt")
	private String discountAmt;

	/**
	 * 是否可转赠表示
0：不可转赠
1：可转赠
	 */
	@ApiField("donate_flag")
	private String donateFlag;

	/**
	 * 扩展信息，json格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 券有效开始时间
	 */
	@ApiField("gmt_active")
	private Date gmtActive;

	/**
	 * 券创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 券有效结束时间
	 */
	@ApiField("gmt_expired")
	private Date gmtExpired;

	/**
	 * 券使用说明
	 */
	@ApiField("instructions")
	private String instructions;

	/**
	 * 券详情说明
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 券名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否可退款标识，取值：
REFUND_VALID：支持退款
REFUND_INVALID：不支持退款
	 */
	@ApiField("refund_flag")
	private String refundFlag;

	/**
	 * 券状态，取值：
VALID:可使用
WRITED_OFF:已核销
EXPIRED:已过期
CLOSED:已关闭
WAIT_APPLY：待领取
	 */
	@ApiField("status")
	private String status;

	/**
	 * 券模板编号
	 */
	@ApiField("template_no")
	private String templateNo;

	/**
	 * 券id
	 */
	@ApiField("ticket_id")
	private String ticketId;

	/**
	 * 券编号
	 */
	@ApiField("ticket_no")
	private String ticketNo;

	/**
	 * 券类型，现在支持两种类型，代金券MONEY和礼品券GIFT
	 */
	@ApiField("type")
	private String type;

	/**
	 * 个人用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getAvailableAmt() {
		return this.availableAmt;
	}
	public void setAvailableAmt(String availableAmt) {
		this.availableAmt = availableAmt;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getDiscountAmt() {
		return this.discountAmt;
	}
	public void setDiscountAmt(String discountAmt) {
		this.discountAmt = discountAmt;
	}

	public String getDonateFlag() {
		return this.donateFlag;
	}
	public void setDonateFlag(String donateFlag) {
		this.donateFlag = donateFlag;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(Date gmtActive) {
		this.gmtActive = gmtActive;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getInstructions() {
		return this.instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRefundFlag() {
		return this.refundFlag;
	}
	public void setRefundFlag(String refundFlag) {
		this.refundFlag = refundFlag;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateNo() {
		return this.templateNo;
	}
	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}

	public String getTicketId() {
		return this.ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getTicketNo() {
		return this.ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
