/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetCommerceLocationRequestBuilder {

    private GetCommerceLocationRequest request;
    private final SDKMethodInterfaces.MethodCallGetCommerceLocation sdk;

    public GetCommerceLocationRequestBuilder(SDKMethodInterfaces.MethodCallGetCommerceLocation sdk) {
        this.sdk = sdk;
    }

    public GetCommerceLocationRequestBuilder request(com.unifiedapi.unifiedto.models.operations.GetCommerceLocationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetCommerceLocationResponse call() throws Exception {

        return sdk.getCommerceLocation(
            request);
    }
}
