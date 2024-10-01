/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class PatchMartechMemberRequestBuilder {

    private PatchMartechMemberRequest request;
    private final SDKMethodInterfaces.MethodCallPatchMartechMember sdk;

    public PatchMartechMemberRequestBuilder(SDKMethodInterfaces.MethodCallPatchMartechMember sdk) {
        this.sdk = sdk;
    }

    public PatchMartechMemberRequestBuilder request(PatchMartechMemberRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchMartechMemberResponse call() throws Exception {

        return sdk.patchMartechMember(
            request);
    }
}
