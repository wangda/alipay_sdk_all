package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.data.oauth.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-05 14:19:48
 */
public class KoubeiMemberDataOauthQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5159128628494681675L;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 操作人id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/** 
	 * 代运营的商户id
	 */
	@ApiField("operator_partner_id")
	private String operatorPartnerId;

	/** 
	 * 操作人身份
	 */
	@ApiField("operator_type")
	private String operatorType;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getOperatorId( ) {
		return this.operatorId;
	}

	public void setOperatorPartnerId(String operatorPartnerId) {
		this.operatorPartnerId = operatorPartnerId;
	}
	public String getOperatorPartnerId( ) {
		return this.operatorPartnerId;
	}

	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}
	public String getOperatorType( ) {
		return this.operatorType;
	}

}
