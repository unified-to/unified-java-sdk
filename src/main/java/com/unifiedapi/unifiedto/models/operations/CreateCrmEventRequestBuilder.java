/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateCrmEventRequestBuilder {

    private CreateCrmEventRequest request;
    private final SDKMethodInterfaces.MethodCallCreateCrmEvent sdk;

    public CreateCrmEventRequestBuilder(SDKMethodInterfaces.MethodCallCreateCrmEvent sdk) {
        this.sdk = sdk;
    }

    public CreateCrmEventRequestBuilder request(com.unifiedapi.unifiedto.models.operations.CreateCrmEventRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateCrmEventResponse call() throws Exception {

        return sdk.createCrmEvent(
            request);
    }
}