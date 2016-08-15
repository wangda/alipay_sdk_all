package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.saleleads.modify response.
 * 
 * @author auto create
 * @since 1.0, 2016-01-27 19:32:01
 */
public class AlipayOfflineSaleleadsModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2747521719283266322L;

	/** 
	 * 被修改leadsId
	 */
	@ApiField("leads_id")
	private String leadsId;

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

}
