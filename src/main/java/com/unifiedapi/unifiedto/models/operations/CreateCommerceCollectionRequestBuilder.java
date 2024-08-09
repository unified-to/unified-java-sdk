/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateCommerceCollectionRequestBuilder {

    private CreateCommerceCollectionRequest request;
    private final SDKMethodInterfaces.MethodCallCreateCommerceCollection sdk;

    public CreateCommerceCollectionRequestBuilder(SDKMethodInterfaces.MethodCallCreateCommerceCollection sdk) {
        this.sdk = sdk;
    }

    public CreateCommerceCollectionRequestBuilder request(com.unifiedapi.unifiedto.models.operations.CreateCommerceCollectionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateCommerceCollectionResponse call() throws Exception {

        return sdk.createCommerceCollection(
            request);
    }
}
