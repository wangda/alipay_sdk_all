package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 车辆驶入上送接口
 *
 * @author auto create
 * @since 1.0, 2016-06-14 15:09:09
 */
public class AlipayEcoMycarParkingInAddModel extends AlipayObject {

	private static final long serialVersionUID = 3423647238121144877L;

	/**
	 * 车牌号
	 */
	@ApiField("car_number")
	private String carNumber;

	/**
	 * 上送车辆的时间，格式"yyyy-MM-dd HH
	 */
	@ApiField("in_time")
	private String inTime;

	/**
	 * 停车场id
	 */
	@ApiField("parking_id")
	private String parkingId;

	public String getCarNumber() {
		return this.carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getInTime() {
		return this.inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getParkingId() {
		return this.parkingId;
	}
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}

}
