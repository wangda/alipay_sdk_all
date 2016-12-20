package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文本消息内容
 *
 * @author auto create
 * @since 1.0, 2016-07-27 19:37:58
 */
public class Text extends AlipayObject {

	private static final long serialVersionUID = 3178898264288482834L;

	/**
	 * 你好!
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
