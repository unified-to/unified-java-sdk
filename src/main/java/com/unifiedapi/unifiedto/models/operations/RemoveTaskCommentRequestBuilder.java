/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class RemoveTaskCommentRequestBuilder {

    private RemoveTaskCommentRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveTaskComment sdk;

    public RemoveTaskCommentRequestBuilder(SDKMethodInterfaces.MethodCallRemoveTaskComment sdk) {
        this.sdk = sdk;
    }

    public RemoveTaskCommentRequestBuilder request(RemoveTaskCommentRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveTaskCommentResponse call() throws Exception {

        return sdk.removeTaskComment(
            request);
    }
}
