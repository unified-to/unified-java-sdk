/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetMessagingMessageRequestBuilder {

    private GetMessagingMessageRequest request;
    private final SDKMethodInterfaces.MethodCallGetMessagingMessage sdk;

    public GetMessagingMessageRequestBuilder(SDKMethodInterfaces.MethodCallGetMessagingMessage sdk) {
        this.sdk = sdk;
    }

    public GetMessagingMessageRequestBuilder request(com.unifiedapi.unifiedto.models.operations.GetMessagingMessageRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetMessagingMessageResponse call() throws Exception {

        return sdk.getMessagingMessage(
            request);
    }
}