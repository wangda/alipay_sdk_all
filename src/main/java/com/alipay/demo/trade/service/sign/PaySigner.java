/**
 * PaySigner.java
 * 2017年5月25日
 * ©2015-2016 北京特微智能科技有限公司. All rights reserved.
 */
package com.alipay.demo.trade.service.sign;

/**
 * 支付签名器
 * @author wangda
 */
public interface PaySigner {

    /**
     * 签名
     * @param signContent 需要签名的内容
     * @return 签名值
     */
    public String sign(String signContent);
}
