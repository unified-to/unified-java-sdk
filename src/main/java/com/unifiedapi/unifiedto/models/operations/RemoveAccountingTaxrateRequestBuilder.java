/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class RemoveAccountingTaxrateRequestBuilder {

    private RemoveAccountingTaxrateRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveAccountingTaxrate sdk;

    public RemoveAccountingTaxrateRequestBuilder(SDKMethodInterfaces.MethodCallRemoveAccountingTaxrate sdk) {
        this.sdk = sdk;
    }

    public RemoveAccountingTaxrateRequestBuilder request(RemoveAccountingTaxrateRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveAccountingTaxrateResponse call() throws Exception {

        return sdk.removeAccountingTaxrate(
            request);
    }
}
