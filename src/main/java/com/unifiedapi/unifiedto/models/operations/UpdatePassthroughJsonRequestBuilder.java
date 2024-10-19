/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdatePassthroughJsonRequestBuilder {

    private UpdatePassthroughJsonRequest request;
    private final SDKMethodInterfaces.MethodCallUpdatePassthroughJson sdk;

    public UpdatePassthroughJsonRequestBuilder(SDKMethodInterfaces.MethodCallUpdatePassthroughJson sdk) {
        this.sdk = sdk;
    }

    public UpdatePassthroughJsonRequestBuilder request(UpdatePassthroughJsonRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdatePassthroughJsonResponse call() throws Exception {

        return sdk.updatePassthroughJson(
            request);
    }
}