/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateCommerceLocationRequestBuilder {

    private CreateCommerceLocationRequest request;
    private final SDKMethodInterfaces.MethodCallCreateCommerceLocation sdk;

    public CreateCommerceLocationRequestBuilder(SDKMethodInterfaces.MethodCallCreateCommerceLocation sdk) {
        this.sdk = sdk;
    }

    public CreateCommerceLocationRequestBuilder request(CreateCommerceLocationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateCommerceLocationResponse call() throws Exception {

        return sdk.createCommerceLocation(
            request);
    }
}
