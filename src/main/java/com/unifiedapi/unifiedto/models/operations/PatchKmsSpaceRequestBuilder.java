/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class PatchKmsSpaceRequestBuilder {

    private PatchKmsSpaceRequest request;
    private final SDKMethodInterfaces.MethodCallPatchKmsSpace sdk;

    public PatchKmsSpaceRequestBuilder(SDKMethodInterfaces.MethodCallPatchKmsSpace sdk) {
        this.sdk = sdk;
    }

    public PatchKmsSpaceRequestBuilder request(com.unifiedapi.unifiedto.models.operations.PatchKmsSpaceRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchKmsSpaceResponse call() throws Exception {

        return sdk.patchKmsSpace(
            request);
    }
}
