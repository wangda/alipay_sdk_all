/**
 * SignerRegistry.java
 * 2017年5月25日
 * ©2015-2016 北京特微智能科技有限公司. All rights reserved.
 */
package com.alipay.demo.trade.service.sign;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 签名器注册器，所有的签名器都注册在这里面
 * @author wangda
 */
public class SignerRegistry {
    
    private static ConcurrentHashMap<String, PaySigner> registry = new ConcurrentHashMap<>();
    
    /**
     * 注册签名器
     * @param ownerCode 业主代码，每个业主唯一拥有一个签名器
     * @param signer 签名器
     */
    public static void register(String ownerCode, PaySigner signer) {
        registry.put(ownerCode, signer);
    }
    
    /**
     * 获取业主对应的签名器
     * @param ownerCode 业主代码
     * @return 签名器，如果没有找到，返回null
     */
    public static PaySigner getSigner(String ownerCode) {
        return registry.get(ownerCode);
    }
}
