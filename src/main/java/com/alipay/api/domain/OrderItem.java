package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单明细
 *
 * @author auto create
 * @since 1.0, 2016-02-24 11:47:21
 */
public class OrderItem extends AlipayObject {

	private static final long serialVersionUID = 8412638665977397831L;

	/**
	 * 店铺所在具体位置
	 */
	@ApiField("address")
	private String address;

	/**
	 * 店铺品类
	 */
	@ApiField("category")
	private String category;

	/**
	 * 店铺所在的市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 门店创建人
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 门店联系人（手机或者座机）
	 */
	@ApiField("phone_no")
	private String phoneNo;

	/**
	 * 店铺所在的省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 店铺ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
