package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.filesuploading response.
 * 
 * @author auto create
 * @since 1.0, 2016-01-27 16:30:09
 */
public class AlipaySecurityRiskFilesuploadingResponse extends AlipayResponse {

	private static final long serialVersionUID = 4843867664585814255L;

	/** 
	 * outputparamtest
	 */
	@ApiField("outputparamtest")
	private String outputparamtest;

	public void setOutputparamtest(String outputparamtest) {
		this.outputparamtest = outputparamtest;
	}
	public String getOutputparamtest( ) {
		return this.outputparamtest;
	}

}
