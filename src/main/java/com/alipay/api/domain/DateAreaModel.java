package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠立减活动子时间段模型足戒用
 *
 * @author auto create
 * @since 1.0, 2016-06-27 12:58:34
 */
public class DateAreaModel extends AlipayObject {

	private static final long serialVersionUID = 7848864981467498436L;

	/**
	 * 开始时间
	 */
	@ApiField("begin_date")
	private String beginDate;

	/**
	 * 结束时间
	 */
	@ApiField("end_date")
	private String endDate;

	public String getBeginDate() {
		return this.beginDate;
	}
	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
