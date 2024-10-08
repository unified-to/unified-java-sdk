/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class PatchPassthroughRawRequestBuilder {

    private PatchPassthroughRawRequest request;
    private final SDKMethodInterfaces.MethodCallPatchPassthroughRaw sdk;

    public PatchPassthroughRawRequestBuilder(SDKMethodInterfaces.MethodCallPatchPassthroughRaw sdk) {
        this.sdk = sdk;
    }

    public PatchPassthroughRawRequestBuilder request(PatchPassthroughRawRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchPassthroughRawResponse call() throws Exception {

        return sdk.patchPassthroughRaw(
            request);
    }
}
