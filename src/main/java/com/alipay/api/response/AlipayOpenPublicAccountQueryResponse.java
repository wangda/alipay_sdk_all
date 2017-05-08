package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StdPublicBindAccount;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-27 19:38:03
 */
public class AlipayOpenPublicAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1678986689135197976L;

	/** 
	 * 绑定账户列表
	 */
	@ApiListField("public_bind_accounts")
	@ApiField("std_public_bind_account")
	private List<StdPublicBindAccount> publicBindAccounts;

	public void setPublicBindAccounts(List<StdPublicBindAccount> publicBindAccounts) {
		this.publicBindAccounts = publicBindAccounts;
	}
	public List<StdPublicBindAccount> getPublicBindAccounts( ) {
		return this.publicBindAccounts;
	}

}
