/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetRepoBranchRequestBuilder {

    private GetRepoBranchRequest request;
    private final SDKMethodInterfaces.MethodCallGetRepoBranch sdk;

    public GetRepoBranchRequestBuilder(SDKMethodInterfaces.MethodCallGetRepoBranch sdk) {
        this.sdk = sdk;
    }

    public GetRepoBranchRequestBuilder request(GetRepoBranchRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetRepoBranchResponse call() throws Exception {

        return sdk.getRepoBranch(
            request);
    }
}
