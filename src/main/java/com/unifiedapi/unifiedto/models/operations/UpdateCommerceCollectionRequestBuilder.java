/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdateCommerceCollectionRequestBuilder {

    private UpdateCommerceCollectionRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateCommerceCollection sdk;

    public UpdateCommerceCollectionRequestBuilder(SDKMethodInterfaces.MethodCallUpdateCommerceCollection sdk) {
        this.sdk = sdk;
    }

    public UpdateCommerceCollectionRequestBuilder request(com.unifiedapi.unifiedto.models.operations.UpdateCommerceCollectionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateCommerceCollectionResponse call() throws Exception {

        return sdk.updateCommerceCollection(
            request);
    }
}
