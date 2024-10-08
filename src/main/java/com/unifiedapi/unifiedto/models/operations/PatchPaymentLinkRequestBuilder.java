/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class PatchPaymentLinkRequestBuilder {

    private PatchPaymentLinkRequest request;
    private final SDKMethodInterfaces.MethodCallPatchPaymentLink sdk;

    public PatchPaymentLinkRequestBuilder(SDKMethodInterfaces.MethodCallPatchPaymentLink sdk) {
        this.sdk = sdk;
    }

    public PatchPaymentLinkRequestBuilder request(PatchPaymentLinkRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchPaymentLinkResponse call() throws Exception {

        return sdk.patchPaymentLink(
            request);
    }
}
