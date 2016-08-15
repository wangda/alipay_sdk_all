/**
 * AlipayTradeServiceCache.java
 * 2016年8月14日
 * ©2015-2016 北京特微智能科技有限公司. All rights reserved.
 */
package com.alipay.demo.trade.service.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.alipay.demo.trade.model.F2FPayAccount;

/**
 * 支付宝交易服务对象缓存
 * @author wangda
 */
public class AlipayTradeServiceCache {
    static Map<String, AlipayTradeWithHBServiceImpl> svrMap = new ConcurrentHashMap<>(32);
    
    /**
     * 从缓存中获取交易服务对象。<p>
     * 缓存中没有时，自动创建一个新的交易服务对象。
     * @param account
     * @return
     */
    public static AlipayTradeWithHBServiceImpl getTradeService(F2FPayAccount account) {
        AlipayTradeWithHBServiceImpl svr = svrMap.get(account.getKey());
        
        if (svr != null) {
            return svr;
        }
        
        synchronized (AlipayTradeServiceCache.class) {
            svr = new AlipayTradeWithHBServiceImpl.ClientBuilder().setPayAccount(account).build();
            svrMap.put(account.getKey(), svr);
            return svr;
        }
    }
}
