/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListPaymentRefundsRequestBuilder {

    private ListPaymentRefundsRequest request;
    private final SDKMethodInterfaces.MethodCallListPaymentRefunds sdk;

    public ListPaymentRefundsRequestBuilder(SDKMethodInterfaces.MethodCallListPaymentRefunds sdk) {
        this.sdk = sdk;
    }

    public ListPaymentRefundsRequestBuilder request(com.unifiedapi.unifiedto.models.operations.ListPaymentRefundsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListPaymentRefundsResponse call() throws Exception {

        return sdk.listPaymentRefunds(
            request);
    }
}