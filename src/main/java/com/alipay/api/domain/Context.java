package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息模板上下文，即模板中定义的参数及参数值
 *
 * @author auto create
 * @since 1.0, 2016-07-27 19:39:35
 */
public class Context extends AlipayObject {

	private static final long serialVersionUID = 1395868867857716418L;

	/**
	 * 底部链接描述文字，如“查看详情”
	 */
	@ApiField("action_name")
	private String actionName;

	/**
	 * 顶部色条的色值
	 */
	@ApiField("head_color")
	private String headColor;

	/**
	 * 模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	 */
	@ApiField("keyword1")
	private Keyword keyword1;

	/**
	 * 模板中占位符的值及文字颜色，value和color都为必填项，color为当前文字颜色
	 */
	@ApiField("keyword2")
	private Keyword keyword2;

	/**
	 * 点击消息后承接页的地址
	 */
	@ApiField("url")
	private String url;

	public String getActionName() {
		return this.actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getHeadColor() {
		return this.headColor;
	}
	public void setHeadColor(String headColor) {
		this.headColor = headColor;
	}

	public Keyword getKeyword1() {
		return this.keyword1;
	}
	public void setKeyword1(Keyword keyword1) {
		this.keyword1 = keyword1;
	}

	public Keyword getKeyword2() {
		return this.keyword2;
	}
	public void setKeyword2(Keyword keyword2) {
		this.keyword2 = keyword2;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
