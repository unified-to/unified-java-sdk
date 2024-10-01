/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class PatchHrisGroupRequestBuilder {

    private PatchHrisGroupRequest request;
    private final SDKMethodInterfaces.MethodCallPatchHrisGroup sdk;

    public PatchHrisGroupRequestBuilder(SDKMethodInterfaces.MethodCallPatchHrisGroup sdk) {
        this.sdk = sdk;
    }

    public PatchHrisGroupRequestBuilder request(PatchHrisGroupRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchHrisGroupResponse call() throws Exception {

        return sdk.patchHrisGroup(
            request);
    }
}
