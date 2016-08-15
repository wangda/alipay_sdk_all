package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据枢纽验证码服务返回结果
 *
 * @author auto create
 * @since 1.0, 2016-01-27 19:27:04
 */
public class AlipayCodeRecoResult extends AlipayObject {

	private static final long serialVersionUID = 8866429572114455867L;

	/**
	 * 识别的验证码内容
	 */
	@ApiField("content")
	private String content;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
