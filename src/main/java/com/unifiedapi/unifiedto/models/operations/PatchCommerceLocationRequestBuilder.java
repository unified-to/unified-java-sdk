/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class PatchCommerceLocationRequestBuilder {

    private PatchCommerceLocationRequest request;
    private final SDKMethodInterfaces.MethodCallPatchCommerceLocation sdk;

    public PatchCommerceLocationRequestBuilder(SDKMethodInterfaces.MethodCallPatchCommerceLocation sdk) {
        this.sdk = sdk;
    }

    public PatchCommerceLocationRequestBuilder request(com.unifiedapi.unifiedto.models.operations.PatchCommerceLocationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchCommerceLocationResponse call() throws Exception {

        return sdk.patchCommerceLocation(
            request);
    }
}