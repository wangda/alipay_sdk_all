package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 公安老赖名单查询结果信息对象
 *
 * @author auto create
 * @since 1.0, 2014-10-29 09:58:47
 */
public class DishonestyQueryResultInfo extends AlipayObject {

	private static final long serialVersionUID = 4333792245297363139L;

	/**
	 * 住址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 失信记录详情
	 */
	@ApiListField("detail")
	@ApiField("dishonesty_detail_info")
	private List<DishonestyDetailInfo> detail;

	/**
	 * 是否有失信数据
	 */
	@ApiField("has_dishonesty_record")
	private Boolean hasDishonestyRecord;

	/**
	 * 身份证号码
	 */
	@ApiField("id_number")
	private String idNumber;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 性别
	 */
	@ApiField("sex")
	private String sex;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public List<DishonestyDetailInfo> getDetail() {
		return this.detail;
	}
	public void setDetail(List<DishonestyDetailInfo> detail) {
		this.detail = detail;
	}

	public Boolean getHasDishonestyRecord() {
		return this.hasDishonestyRecord;
	}
	public void setHasDishonestyRecord(Boolean hasDishonestyRecord) {
		this.hasDishonestyRecord = hasDishonestyRecord;
	}

	public String getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

}
