/**
 * AlipayDefaultSinger.java
 * 2017年5月25日
 * ©2015-2016 北京特微智能科技有限公司. All rights reserved.
 */
package com.alipay.demo.trade.service.sign;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;

/**
 * 使用支付宝默认的签名器
 * @author wangda
 */
public class AlipayDefaultSinger implements PaySigner {
    
    private String privateKey = "";
    
    private String charset = "UTF-8";
    
    private String signType = "RSA";
    
    @Override
    public String sign(String signContent) {
        try {
            return AlipaySignature.rsaSign(signContent, privateKey, charset, signType);
        } catch (AlipayApiException e) {
            throw new RuntimeException("支付宝签名出错：" + e.getMessage(), e);
        }
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

}
