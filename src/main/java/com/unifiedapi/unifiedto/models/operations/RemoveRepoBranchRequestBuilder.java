/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class RemoveRepoBranchRequestBuilder {

    private RemoveRepoBranchRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveRepoBranch sdk;

    public RemoveRepoBranchRequestBuilder(SDKMethodInterfaces.MethodCallRemoveRepoBranch sdk) {
        this.sdk = sdk;
    }

    public RemoveRepoBranchRequestBuilder request(RemoveRepoBranchRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveRepoBranchResponse call() throws Exception {

        return sdk.removeRepoBranch(
            request);
    }
}
