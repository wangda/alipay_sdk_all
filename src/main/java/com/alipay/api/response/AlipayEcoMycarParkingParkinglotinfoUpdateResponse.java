package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.parkinglotinfo.update response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-14 15:08:44
 */
public class AlipayEcoMycarParkingParkinglotinfoUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7417381738219725365L;

	/** 
	 * 返回状态：1为成功，0为失败
	 */
	@ApiField("stauts")
	private String stauts;

	public void setStauts(String stauts) {
		this.stauts = stauts;
	}
	public String getStauts( ) {
		return this.stauts;
	}

}
