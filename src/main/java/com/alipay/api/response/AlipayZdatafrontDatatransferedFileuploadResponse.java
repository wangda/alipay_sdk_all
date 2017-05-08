package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.zdatafront.datatransfered.fileupload response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-02 10:22:35
 */
public class AlipayZdatafrontDatatransferedFileuploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 7159828528869593295L;

	/** 
	 * 数据上传结果，true/false
	 */
	@ApiField("success")
	private String success;

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
