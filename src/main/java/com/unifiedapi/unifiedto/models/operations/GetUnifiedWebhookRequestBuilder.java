/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetUnifiedWebhookRequestBuilder {

    private GetUnifiedWebhookRequest request;
    private final SDKMethodInterfaces.MethodCallGetUnifiedWebhook sdk;

    public GetUnifiedWebhookRequestBuilder(SDKMethodInterfaces.MethodCallGetUnifiedWebhook sdk) {
        this.sdk = sdk;
    }

    public GetUnifiedWebhookRequestBuilder request(GetUnifiedWebhookRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetUnifiedWebhookResponse call() throws Exception {

        return sdk.getUnifiedWebhook(
            request);
    }
}
