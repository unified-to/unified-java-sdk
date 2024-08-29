/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdateAccountingTaxrateRequestBuilder {

    private UpdateAccountingTaxrateRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateAccountingTaxrate sdk;

    public UpdateAccountingTaxrateRequestBuilder(SDKMethodInterfaces.MethodCallUpdateAccountingTaxrate sdk) {
        this.sdk = sdk;
    }

    public UpdateAccountingTaxrateRequestBuilder request(com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateAccountingTaxrateResponse call() throws Exception {

        return sdk.updateAccountingTaxrate(
            request);
    }
}