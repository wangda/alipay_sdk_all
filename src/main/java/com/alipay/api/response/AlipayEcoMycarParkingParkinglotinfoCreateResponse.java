package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.parkinglotinfo.create response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-14 15:09:19
 */
public class AlipayEcoMycarParkingParkinglotinfoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3796392616843951372L;

	/** 
	 * 支付宝返回停车场id。成功传，失败不传
	 */
	@ApiField("alipay_parking_id")
	private String alipayParkingId;

	/** 
	 * 1
	 */
	@ApiField("stauts")
	private String stauts;

	public void setAlipayParkingId(String alipayParkingId) {
		this.alipayParkingId = alipayParkingId;
	}
	public String getAlipayParkingId( ) {
		return this.alipayParkingId;
	}

	public void setStauts(String stauts) {
		this.stauts = stauts;
	}
	public String getStauts( ) {
		return this.stauts;
	}

}
