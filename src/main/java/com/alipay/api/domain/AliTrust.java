package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿里信用返回的黑名单对象
 *
 * @author auto create
 * @since 1.0, 2013-12-30 17:10:00
 */
public class AliTrust extends AlipayObject {

	private static final long serialVersionUID = 1416762974916738883L;

	/**
	 * 是否存在于阿里信用黑名单中
	 */
	@ApiField("black")
	private Boolean black;

	/**
	 * 如果在黑名单中, 记录被列入黑名单的日期
	 */
	@ApiField("date")
	private String date;

	/**
	 * 被查用户的身份证号
	 */
	@ApiField("id_card")
	private String idCard;

	/**
	 * 被查用户的姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否需要再次发起查询
	 */
	@ApiField("re_query")
	private Boolean reQuery;

	/**
	 * 如果在黑名单中, 记录被列入黑名单的原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 黑名单来自于哪家机构
	 */
	@ApiField("source")
	private String source;

	public Boolean getBlack() {
		return this.black;
	}
	public void setBlack(Boolean black) {
		this.black = black;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getReQuery() {
		return this.reQuery;
	}
	public void setReQuery(Boolean reQuery) {
		this.reQuery = reQuery;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
