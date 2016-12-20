package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销工具
 *
 * @author auto create
 * @since 1.0, 2016-07-28 13:35:08
 */
public class PromoTool extends AlipayObject {

	private static final long serialVersionUID = 3311886571179998718L;

	/**
	 * 奖品发放的规则
	 */
	@ApiField("send_rule")
	private SendRule sendRule;

	/**
	 * 券对象(仅当is_create为0时有效)
	 */
	@ApiField("voucher")
	private Voucher voucher;

	/**
	 * 营销工具uid
	 */
	@ApiField("voucher_no")
	private String voucherNo;

	public SendRule getSendRule() {
		return this.sendRule;
	}
	public void setSendRule(SendRule sendRule) {
		this.sendRule = sendRule;
	}

	public Voucher getVoucher() {
		return this.voucher;
	}
	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

	public String getVoucherNo() {
		return this.voucherNo;
	}
	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

}
