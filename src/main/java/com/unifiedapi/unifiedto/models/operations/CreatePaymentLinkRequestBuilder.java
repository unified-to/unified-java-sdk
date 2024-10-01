/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreatePaymentLinkRequestBuilder {

    private CreatePaymentLinkRequest request;
    private final SDKMethodInterfaces.MethodCallCreatePaymentLink sdk;

    public CreatePaymentLinkRequestBuilder(SDKMethodInterfaces.MethodCallCreatePaymentLink sdk) {
        this.sdk = sdk;
    }

    public CreatePaymentLinkRequestBuilder request(CreatePaymentLinkRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreatePaymentLinkResponse call() throws Exception {

        return sdk.createPaymentLink(
            request);
    }
}
