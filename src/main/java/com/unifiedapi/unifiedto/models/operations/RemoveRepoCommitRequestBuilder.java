/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class RemoveRepoCommitRequestBuilder {

    private RemoveRepoCommitRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveRepoCommit sdk;

    public RemoveRepoCommitRequestBuilder(SDKMethodInterfaces.MethodCallRemoveRepoCommit sdk) {
        this.sdk = sdk;
    }

    public RemoveRepoCommitRequestBuilder request(RemoveRepoCommitRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveRepoCommitResponse call() throws Exception {

        return sdk.removeRepoCommit(
            request);
    }
}
