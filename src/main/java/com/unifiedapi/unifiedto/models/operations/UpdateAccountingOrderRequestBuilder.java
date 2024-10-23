/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdateAccountingOrderRequestBuilder {

    private UpdateAccountingOrderRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateAccountingOrder sdk;

    public UpdateAccountingOrderRequestBuilder(SDKMethodInterfaces.MethodCallUpdateAccountingOrder sdk) {
        this.sdk = sdk;
    }

    public UpdateAccountingOrderRequestBuilder request(UpdateAccountingOrderRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateAccountingOrderResponse call() throws Exception {

        return sdk.updateAccountingOrder(
            request);
    }
}
