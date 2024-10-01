/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreatePassthroughJsonRequestBuilder {

    private CreatePassthroughJsonRequest request;
    private final SDKMethodInterfaces.MethodCallCreatePassthroughJson sdk;

    public CreatePassthroughJsonRequestBuilder(SDKMethodInterfaces.MethodCallCreatePassthroughJson sdk) {
        this.sdk = sdk;
    }

    public CreatePassthroughJsonRequestBuilder request(CreatePassthroughJsonRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreatePassthroughJsonResponse call() throws Exception {

        return sdk.createPassthroughJson(
            request);
    }
}
