package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipaySecurityRiskFilesuploadingResponse;

/**
 * ALIPAY API: alipay.security.risk.filesuploading request
 * 
 * @author auto create
 * @since 1.0, 2016-01-27 16:30:09
 */
public class AlipaySecurityRiskFilesuploadingRequest implements AlipayUploadRequest<AlipaySecurityRiskFilesuploadingResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 文件上传参数
	 */
	private FileItem filesuoloadingtest;

	/** 
	* testtesttest
	 */
	private String normalparamtest;

	public void setFilesuoloadingtest(FileItem filesuoloadingtest) {
		this.filesuoloadingtest = filesuoloadingtest;
	}
	public FileItem getFilesuoloadingtest() {
		return this.filesuoloadingtest;
	}

	public void setNormalparamtest(String normalparamtest) {
		this.normalparamtest = normalparamtest;
	}
	public String getNormalparamtest() {
		return this.normalparamtest;
	}
	private String terminalType;
	private String terminalInfo;
	private String prodCode;
	private String notifyUrl;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}
	
    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "alipay.security.risk.filesuploading";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("normalparamtest", this.normalparamtest);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
	
	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("filesuoloadingtest", this.filesuoloadingtest);
		return params;
	}

	public Class<AlipaySecurityRiskFilesuploadingResponse> getResponseClass() {
		return AlipaySecurityRiskFilesuploadingResponse.class;
	}
}
