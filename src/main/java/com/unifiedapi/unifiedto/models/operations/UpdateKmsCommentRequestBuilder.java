/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdateKmsCommentRequestBuilder {

    private UpdateKmsCommentRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateKmsComment sdk;

    public UpdateKmsCommentRequestBuilder(SDKMethodInterfaces.MethodCallUpdateKmsComment sdk) {
        this.sdk = sdk;
    }

    public UpdateKmsCommentRequestBuilder request(UpdateKmsCommentRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateKmsCommentResponse call() throws Exception {

        return sdk.updateKmsComment(
            request);
    }
}
