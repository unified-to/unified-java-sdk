/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateHrisLocationRequestBuilder {

    private CreateHrisLocationRequest request;
    private final SDKMethodInterfaces.MethodCallCreateHrisLocation sdk;

    public CreateHrisLocationRequestBuilder(SDKMethodInterfaces.MethodCallCreateHrisLocation sdk) {
        this.sdk = sdk;
    }

    public CreateHrisLocationRequestBuilder request(com.unifiedapi.unifiedto.models.operations.CreateHrisLocationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateHrisLocationResponse call() throws Exception {

        return sdk.createHrisLocation(
            request);
    }
}