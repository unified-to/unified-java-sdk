/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateHrisEmployeeRequestBuilder {

    private CreateHrisEmployeeRequest request;
    private final SDKMethodInterfaces.MethodCallCreateHrisEmployee sdk;

    public CreateHrisEmployeeRequestBuilder(SDKMethodInterfaces.MethodCallCreateHrisEmployee sdk) {
        this.sdk = sdk;
    }

    public CreateHrisEmployeeRequestBuilder request(CreateHrisEmployeeRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateHrisEmployeeResponse call() throws Exception {

        return sdk.createHrisEmployee(
            request);
    }
}
