/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class PatchTaskProjectRequestBuilder {

    private PatchTaskProjectRequest request;
    private final SDKMethodInterfaces.MethodCallPatchTaskProject sdk;

    public PatchTaskProjectRequestBuilder(SDKMethodInterfaces.MethodCallPatchTaskProject sdk) {
        this.sdk = sdk;
    }

    public PatchTaskProjectRequestBuilder request(com.unifiedapi.unifiedto.models.operations.PatchTaskProjectRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchTaskProjectResponse call() throws Exception {

        return sdk.patchTaskProject(
            request);
    }
}
