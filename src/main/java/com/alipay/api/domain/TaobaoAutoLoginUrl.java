package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘宝免登url 返回对象
 *
 * @author auto create
 * @since 1.0, 2014-03-20 17:08:25
 */
public class TaobaoAutoLoginUrl extends AlipayObject {

	private static final long serialVersionUID = 1186166779253718195L;

	/**
	 * 业务返回状态码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 业务返回描述
	 */
	@ApiField("message")
	private String message;

	/**
	 * 获取免登url是否成功
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * 淘宝航旅免登url
	 */
	@ApiField("taobao_auto_loginurl")
	private String taobaoAutoLoginurl;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTaobaoAutoLoginurl() {
		return this.taobaoAutoLoginurl;
	}
	public void setTaobaoAutoLoginurl(String taobaoAutoLoginurl) {
		this.taobaoAutoLoginurl = taobaoAutoLoginurl;
	}

}
