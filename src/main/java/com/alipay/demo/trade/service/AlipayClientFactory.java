/**
 * AlipayClientFactory.java
 * 2016年8月14日
 * ©2015-2016 北京特微智能科技有限公司. All rights reserved.
 */
package com.alipay.demo.trade.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayConstants;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.demo.trade.config.Configs;
import com.alipay.demo.trade.model.F2FPayAccount;

/**
 * 支付宝支付连接客户端工厂类
 * @author wangda
 */
public class AlipayClientFactory {
    private static Map<String, AlipayClient> clientMap = new ConcurrentHashMap<>(32);
    
    /**
     * 根据当面付的支付账号，获取一个支付宝支付客户端对象<p>
     * 如果之前已经实例化过客户端，返回这个客户端。<p>
     * 如果之前没有实例化过，新实例化一个。
     * @param account
     * @return
     */
    public static AlipayClient getAlipayClient(F2FPayAccount account) {
        if (account == null) {
            return null;
        }
        
        // 从缓存中找数据，如果没找到，新创建一个新的
        AlipayClient client = clientMap.get(account.getKey());
        
        if (client != null) {
            return client;
        }
        
        synchronized(AlipayClientFactory.class) {
            client = clientMap.get(account.getKey());
            if (client != null) {
                return client;
            }
            
            client = newAlipayClient(account);
            clientMap.put(account.getKey(), client);
            return client;
        }
    }
    
    private static AlipayClient newAlipayClient(F2FPayAccount account) {
        return new DefaultAlipayClient(Configs.getOpenApiDomain(), account.getAppid(), account.getPrivateKey(),
                AlipayConstants.FORMAT_JSON, AlipayConstants.CHARSET_UTF8, account.getAlipayPublicKey());
    }
}
