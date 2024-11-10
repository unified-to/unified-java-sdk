/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class PatchLmsClassRequestBuilder {

    private PatchLmsClassRequest request;
    private final SDKMethodInterfaces.MethodCallPatchLmsClass sdk;

    public PatchLmsClassRequestBuilder(SDKMethodInterfaces.MethodCallPatchLmsClass sdk) {
        this.sdk = sdk;
    }

    public PatchLmsClassRequestBuilder request(PatchLmsClassRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchLmsClassResponse call() throws Exception {

        return sdk.patchLmsClass(
            request);
    }
}
