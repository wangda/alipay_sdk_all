package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业数据发送接口
 *
 * @author auto create
 * @since 1.0, 2016-07-06 16:32:15
 */
public class AlipayCommerceDataSendModel extends AlipayObject {

	private static final long serialVersionUID = 5887958761571789518L;

	/**
	 * 场景的来源渠道，比如场景
在阿里旅行触发，就用alitrip
接入时和支付宝共同确认
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 操作码,由支付宝分配
	 */
	@ApiField("op_code")
	private String opCode;

	/**
	 * 操作数据，如果只需要支付宝这边利用
数据直接完成某个功能（通知），则使
用此参数传输数据.，根据不同的scene_code,
op_code,channel,version共同确定参数是否
可以为空，接入时由支付宝确定参数格式。
	 */
	@ApiField("op_data")
	private String opData;

	/**
	 * 场景标识,由支付宝分配
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 场景的数据表示. json 数组
格式，根据不同的scene_code,
op_code,channel,version共同确定
参数是否可以为空，接入时由支付宝确定
参数格式。
	 */
	@ApiField("scene_data")
	private String sceneData;

	/**
	 * 场景覆盖的目标人群标识，
单个用户是支付宝的userId,
多个用户userId 使用英文半
角逗号隔开,最多200个
如果是群组,使用支付宝分配
的群组ID.
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 场景数据的类型的版本,由支付宝分配
	 */
	@ApiField("version")
	private String version;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getOpCode() {
		return this.opCode;
	}
	public void setOpCode(String opCode) {
		this.opCode = opCode;
	}

	public String getOpData() {
		return this.opData;
	}
	public void setOpData(String opData) {
		this.opData = opData;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSceneData() {
		return this.sceneData;
	}
	public void setSceneData(String sceneData) {
		this.sceneData = sceneData;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getVersion() {
		return this.version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

}
