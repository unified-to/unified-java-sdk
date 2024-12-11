/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetMetadataMetadataRequestBuilder {

    private GetMetadataMetadataRequest request;
    private final SDKMethodInterfaces.MethodCallGetMetadataMetadata sdk;

    public GetMetadataMetadataRequestBuilder(SDKMethodInterfaces.MethodCallGetMetadataMetadata sdk) {
        this.sdk = sdk;
    }

    public GetMetadataMetadataRequestBuilder request(GetMetadataMetadataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetMetadataMetadataResponse call() throws Exception {

        return sdk.getMetadataMetadata(
            request);
    }
}
