/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class PatchHrisEmployeeRequestBuilder {

    private PatchHrisEmployeeRequest request;
    private final SDKMethodInterfaces.MethodCallPatchHrisEmployee sdk;

    public PatchHrisEmployeeRequestBuilder(SDKMethodInterfaces.MethodCallPatchHrisEmployee sdk) {
        this.sdk = sdk;
    }

    public PatchHrisEmployeeRequestBuilder request(PatchHrisEmployeeRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchHrisEmployeeResponse call() throws Exception {

        return sdk.patchHrisEmployee(
            request);
    }
}
