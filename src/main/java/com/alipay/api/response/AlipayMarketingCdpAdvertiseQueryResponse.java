package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cdp.advertise.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-02-26 15:30:33
 */
public class AlipayMarketingCdpAdvertiseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5259236934624773381L;

	/** 
	 * 用户点击广告后，跳转URL地址，必须为https协议。
	 */
	@ApiField("action_url")
	private String actionUrl;

	/** 
	 * 广告位标识码，目前开放的广告位是钱包APP/口碑TAB/商家详情页中，传值：CDP_OPEN_MERCHANT
	 */
	@ApiField("ad_code")
	private String adCode;

	/** 
	 * 该规则用于商家设置对用户是否展示广告的校验条件，目前支持设置商家店铺规则。按业务要求应用对应规则即可
	 */
	@ApiField("ad_rules")
	private String adRules;

	/** 
	 * 广告内容。如果广告类型是HTML5，则传入H5链接地址，必须为https协议。最大尺寸不得超过1242px＊242px，小屏幕将按分辨率宽度同比例放大缩小；如果类型是图片，则传入图片ID标识，如何获取图片ID参考图片上传接口：alipay.offline.material.image.upload。图片尺寸为1242px＊290px。图片大小不能超过50kb。
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 广告内容类型，目前包括HTML5和图片，分别传入：H5和PIC
	 */
	@ApiField("content_type")
	private String contentType;

	/** 
	 * 当广告类型是H5时，必须传入内容高度。对于广告位CDP_OPEN_MERCHANT的内容高度不能高于钱包要求的展位高度242px。当广告类型是图片时，不需要传入内容高度(height)，系统会检查用户上传的图片尺寸是否符合要求，对于广告位CDP_OPEN_MERCHANT的图片尺寸要求：宽1242px, 高290px,大小50kb，实际上传图片与图片标准宽高必须一致，图片大小不能超过50kb。
	 */
	@ApiField("height")
	private String height;

	/** 
	 * 在线：ONLINE , 下线：OFFLINE
	 */
	@ApiField("status")
	private String status;

	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}
	public String getActionUrl( ) {
		return this.actionUrl;
	}

	public void setAdCode(String adCode) {
		this.adCode = adCode;
	}
	public String getAdCode( ) {
		return this.adCode;
	}

	public void setAdRules(String adRules) {
		this.adRules = adRules;
	}
	public String getAdRules( ) {
		return this.adRules;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getContentType( ) {
		return this.contentType;
	}

	public void setHeight(String height) {
		this.height = height;
	}
	public String getHeight( ) {
		return this.height;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
