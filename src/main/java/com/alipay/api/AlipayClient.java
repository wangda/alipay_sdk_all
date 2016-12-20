/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2012 All Rights Reserved.
 */
package com.alipay.api;

/**
 * 
 * @author runzhi
 */
public interface AlipayClient {

    /**
     * 
     * 
     * @param <T>
     * @param request
     * @return
     * @throws AlipayApiException
     */
    public <T extends AlipayResponse> T execute(AlipayRequest<T> request) throws AlipayApiException;

    /**
     * 
     * 
     * @param <T>
     * @param request
     * @param accessToken
     * @return
     * @throws AlipayApiException
     */
    public <T extends AlipayResponse> T execute(AlipayRequest<T> request,
                                                String authToken) throws AlipayApiException;

    /**
     * 
     * 
     * @param request
     * @param accessToken
     * @param appAuthToken
     * @return
     * @throws AlipayApiException
     */
    public <T extends AlipayResponse> T execute(AlipayRequest<T> request, String accessToken,
                                                String appAuthToken) throws AlipayApiException;

    /**
     * 
     * @param <T>
     * @param request
     * @return
     * @throws AlipayApiException
     */
    public <T extends AlipayResponse> T pageExecute(AlipayRequest<T> request) throws AlipayApiException;

    /**
    * 
    * @param request
    * @return
    * @throws AlipayApiException
    */
    public <T extends AlipayResponse> T pageExecute(AlipayRequest<T> request,
                                                    String method) throws AlipayApiException;
}
