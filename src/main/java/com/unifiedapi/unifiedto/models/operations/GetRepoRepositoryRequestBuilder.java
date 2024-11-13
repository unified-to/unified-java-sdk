/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetRepoRepositoryRequestBuilder {

    private GetRepoRepositoryRequest request;
    private final SDKMethodInterfaces.MethodCallGetRepoRepository sdk;

    public GetRepoRepositoryRequestBuilder(SDKMethodInterfaces.MethodCallGetRepoRepository sdk) {
        this.sdk = sdk;
    }

    public GetRepoRepositoryRequestBuilder request(GetRepoRepositoryRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetRepoRepositoryResponse call() throws Exception {

        return sdk.getRepoRepository(
            request);
    }
}