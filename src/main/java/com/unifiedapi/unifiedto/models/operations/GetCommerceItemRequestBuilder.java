/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetCommerceItemRequestBuilder {

    private GetCommerceItemRequest request;
    private final SDKMethodInterfaces.MethodCallGetCommerceItem sdk;

    public GetCommerceItemRequestBuilder(SDKMethodInterfaces.MethodCallGetCommerceItem sdk) {
        this.sdk = sdk;
    }

    public GetCommerceItemRequestBuilder request(GetCommerceItemRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetCommerceItemResponse call() throws Exception {

        return sdk.getCommerceItem(
            request);
    }
}
