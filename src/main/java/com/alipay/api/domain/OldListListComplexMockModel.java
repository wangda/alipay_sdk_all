package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 老版本复杂Listlist对象
 *
 * @author auto create
 * @since 1.0, 2015-05-06 15:44:44
 */
public class OldListListComplexMockModel extends AlipayObject {

	private static final long serialVersionUID = 1739583445829131319L;

	/**
	 * 复杂模型list
	 */
	@ApiListField("cm_list")
	@ApiField("old_complext_mock_model")
	private List<OldComplextMockModel> cmList;

	public List<OldComplextMockModel> getCmList() {
		return this.cmList;
	}
	public void setCmList(List<OldComplextMockModel> cmList) {
		this.cmList = cmList;
	}

}
