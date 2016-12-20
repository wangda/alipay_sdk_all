package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个商品查询接口
 *
 * @author auto create
 * @since 1.0, 2016-07-06 10:47:56
 */
public class KoubeiMemberDataExtitemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3345327917711416181L;

	/**
	 * 商品编码
	 */
	@ApiField("item_code")
	private String itemCode;

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

}
