package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询商品编码对应的商品是否存在
 *
 * @author auto create
 * @since 1.0, 2016-07-06 10:48:15
 */
public class KoubeiMarketingCampaignItemIsexistedModel extends AlipayObject {

	private static final long serialVersionUID = 5432692979533854723L;

	/**
	 * 商品编码列表, 商品编码数量不超过100条。
	 */
	@ApiListField("code_list")
	@ApiField("string")
	private List<String> codeList;

	public List<String> getCodeList() {
		return this.codeList;
	}
	public void setCodeList(List<String> codeList) {
		this.codeList = codeList;
	}

}
