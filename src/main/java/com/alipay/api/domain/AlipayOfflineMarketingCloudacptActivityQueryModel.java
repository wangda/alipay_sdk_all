package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云验收活动列表查询
 *
 * @author auto create
 * @since 1.0, 2016-06-15 15:07:41
 */
public class AlipayOfflineMarketingCloudacptActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7299994524166115382L;

	/**
	 * partener id
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * user id
	 */
	@ApiField("uid")
	private String uid;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
