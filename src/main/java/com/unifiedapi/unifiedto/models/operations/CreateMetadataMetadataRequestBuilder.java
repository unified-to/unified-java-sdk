/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateMetadataMetadataRequestBuilder {

    private CreateMetadataMetadataRequest request;
    private final SDKMethodInterfaces.MethodCallCreateMetadataMetadata sdk;

    public CreateMetadataMetadataRequestBuilder(SDKMethodInterfaces.MethodCallCreateMetadataMetadata sdk) {
        this.sdk = sdk;
    }

    public CreateMetadataMetadataRequestBuilder request(CreateMetadataMetadataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateMetadataMetadataResponse call() throws Exception {

        return sdk.createMetadataMetadata(
            request);
    }
}