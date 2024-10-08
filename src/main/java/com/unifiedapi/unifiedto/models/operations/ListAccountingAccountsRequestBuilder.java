/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListAccountingAccountsRequestBuilder {

    private ListAccountingAccountsRequest request;
    private final SDKMethodInterfaces.MethodCallListAccountingAccounts sdk;

    public ListAccountingAccountsRequestBuilder(SDKMethodInterfaces.MethodCallListAccountingAccounts sdk) {
        this.sdk = sdk;
    }

    public ListAccountingAccountsRequestBuilder request(ListAccountingAccountsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListAccountingAccountsResponse call() throws Exception {

        return sdk.listAccountingAccounts(
            request);
    }
}
