package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.alipay.security.prod.test response.
 * 
 * @author auto create
 * @since 1.0, 2016-03-02 10:47:05
 */
public class AlipaySecurityProdAlipaySecurityProdTestResponse extends AlipayResponse {

	private static final long serialVersionUID = 2791854689994638561L;

	/** 
	 * ddd
	 */
	@ApiField("admin")
	private String admin;

	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getAdmin( ) {
		return this.admin;
	}

}
