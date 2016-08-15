/**
 * F2FPayAccount.java
 * 2016年8月14日
 * ©2015-2016 北京特微智能科技有限公司. All rights reserved.
 */
package com.alipay.demo.trade.model;

/**
 * 当面付支付账号信息，用于支付的各种ID及密钥信息
 * 
 * @author wangda
 */
public class F2FPayAccount {
    
    /** 合作伙伴编号 */
    private String pid = "";
    
    /** 应用ID */
    private String appid = "";

    /** 子商户用户ID。特微可以为这个子商户的支付宝用户ID代理收款 */
    private String sellerId = "";

    /** 支付私钥 */
    private String privateKey = "";

    /** 支付公钥 */
    private String publicKey = "";

    /** 支付宝公钥 */
    private String alipayPublicKey = "";
    
    /** 生成该支付账号的唯一Key */
    public String getKey() {
        return pid + "_" + appid + "_" + sellerId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getAlipayPublicKey() {
        return alipayPublicKey;
    }

    public void setAlipayPublicKey(String alipayPublicKey) {
        this.alipayPublicKey = alipayPublicKey;
    }
    
}
