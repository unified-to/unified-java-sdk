/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetRepoCommitRequestBuilder {

    private GetRepoCommitRequest request;
    private final SDKMethodInterfaces.MethodCallGetRepoCommit sdk;

    public GetRepoCommitRequestBuilder(SDKMethodInterfaces.MethodCallGetRepoCommit sdk) {
        this.sdk = sdk;
    }

    public GetRepoCommitRequestBuilder request(GetRepoCommitRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetRepoCommitResponse call() throws Exception {

        return sdk.getRepoCommit(
            request);
    }
}