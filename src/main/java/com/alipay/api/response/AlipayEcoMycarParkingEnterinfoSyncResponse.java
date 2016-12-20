package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.enterinfo.sync response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-14 15:09:09
 */
public class AlipayEcoMycarParkingEnterinfoSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 4422765138945317684L;

	/** 
	 * 返回状态：1为成功，0为失败
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
