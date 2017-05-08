package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.packagetest response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-13 19:54:45
 */
public class AlipayOpenAppPackagetestResponse extends AlipayResponse {

	private static final long serialVersionUID = 4872826215335326245L;

	/** 
	 * testtest
	 */
	@ApiField("testtesttesttest")
	private String testtesttesttest;

	public void setTesttesttesttest(String testtesttesttest) {
		this.testtesttesttest = testtesttesttest;
	}
	public String getTesttesttesttest( ) {
		return this.testtesttesttest;
	}

}
