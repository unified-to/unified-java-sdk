/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateRepoBranchRequestBuilder {

    private CreateRepoBranchRequest request;
    private final SDKMethodInterfaces.MethodCallCreateRepoBranch sdk;

    public CreateRepoBranchRequestBuilder(SDKMethodInterfaces.MethodCallCreateRepoBranch sdk) {
        this.sdk = sdk;
    }

    public CreateRepoBranchRequestBuilder request(CreateRepoBranchRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateRepoBranchResponse call() throws Exception {

        return sdk.createRepoBranch(
            request);
    }
}