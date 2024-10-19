/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateScimGroupsRequestBuilder {

    private CreateScimGroupsRequest request;
    private final SDKMethodInterfaces.MethodCallCreateScimGroups sdk;

    public CreateScimGroupsRequestBuilder(SDKMethodInterfaces.MethodCallCreateScimGroups sdk) {
        this.sdk = sdk;
    }

    public CreateScimGroupsRequestBuilder request(CreateScimGroupsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateScimGroupsResponse call() throws Exception {

        return sdk.createScimGroups(
            request);
    }
}