/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class PatchPassthroughJsonRequestBuilder {

    private PatchPassthroughJsonRequest request;
    private final SDKMethodInterfaces.MethodCallPatchPassthroughJson sdk;

    public PatchPassthroughJsonRequestBuilder(SDKMethodInterfaces.MethodCallPatchPassthroughJson sdk) {
        this.sdk = sdk;
    }

    public PatchPassthroughJsonRequestBuilder request(PatchPassthroughJsonRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchPassthroughJsonResponse call() throws Exception {

        return sdk.patchPassthroughJson(
            request);
    }
}
