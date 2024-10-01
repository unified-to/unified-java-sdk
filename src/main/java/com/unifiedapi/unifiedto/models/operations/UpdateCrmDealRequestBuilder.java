/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdateCrmDealRequestBuilder {

    private UpdateCrmDealRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateCrmDeal sdk;

    public UpdateCrmDealRequestBuilder(SDKMethodInterfaces.MethodCallUpdateCrmDeal sdk) {
        this.sdk = sdk;
    }

    public UpdateCrmDealRequestBuilder request(UpdateCrmDealRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateCrmDealResponse call() throws Exception {

        return sdk.updateCrmDeal(
            request);
    }
}
