package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 标签组发过滤单个条件
 *
 * @author auto create
 * @since 1.0, 2016-07-27 19:38:37
 */
public class LabelFilter extends AlipayObject {

	private static final long serialVersionUID = 4868935312673362459L;

	/**
	 * 标签组名，商户自定义的标签固定为label_id_list，支付宝开放的标签详见<a href="https://i.alipayobjects.com/i/ecmng/zip/201501/FirstPartOfTagsFromAlipay.zip?spm=a219a.7629140.0.0.FHtmkZ&file=FirstPartOfTagsFromAlipay.zip">支付宝开放标签</a>
	 */
	@ApiField("column_name")
	private String columnName;

	/**
	 * 操作符，支持=、!=、in三个操作符；其中in表示是某几个标签中的一个
	 */
	@ApiField("op")
	private String op;

	/**
	 * 标签数组，用于组装最后的表达式
	 */
	@ApiListField("values")
	@ApiField("string")
	private List<String> values;

	public String getColumnName() {
		return this.columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getOp() {
		return this.op;
	}
	public void setOp(String op) {
		this.op = op;
	}

	public List<String> getValues() {
		return this.values;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}

}
