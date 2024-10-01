/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class PatchKmsPageRequestBuilder {

    private PatchKmsPageRequest request;
    private final SDKMethodInterfaces.MethodCallPatchKmsPage sdk;

    public PatchKmsPageRequestBuilder(SDKMethodInterfaces.MethodCallPatchKmsPage sdk) {
        this.sdk = sdk;
    }

    public PatchKmsPageRequestBuilder request(PatchKmsPageRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchKmsPageResponse call() throws Exception {

        return sdk.patchKmsPage(
            request);
    }
}
