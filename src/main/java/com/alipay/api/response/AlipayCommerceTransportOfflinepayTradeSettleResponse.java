package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayOfflineTradeResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.offlinepay.trade.settle response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-01 22:05:39
 */
public class AlipayCommerceTransportOfflinepayTradeSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 5196213285438616145L;

	/** 
	 * 支付宝脱机交易处理结果列表
	 */
	@ApiField("result_list")
	private AlipayOfflineTradeResult resultList;

	public void setResultList(AlipayOfflineTradeResult resultList) {
		this.resultList = resultList;
	}
	public AlipayOfflineTradeResult getResultList( ) {
		return this.resultList;
	}

}
