package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻分分段
 *
 * @author auto create
 * @since 1.0, 2016-06-02 14:27:12
 */
public class AlipayZmScoreZrankResult extends AlipayObject {

	private static final long serialVersionUID = 2664792238356669954L;

	/**
	 * 芝麻分分段 Z0-Z7
	 */
	@ApiField("zrank")
	private String zrank;

	public String getZrank() {
		return this.zrank;
	}
	public void setZrank(String zrank) {
		this.zrank = zrank;
	}

}
