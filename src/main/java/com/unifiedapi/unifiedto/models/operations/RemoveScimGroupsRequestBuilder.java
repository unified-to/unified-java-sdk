/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class RemoveScimGroupsRequestBuilder {

    private RemoveScimGroupsRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveScimGroups sdk;

    public RemoveScimGroupsRequestBuilder(SDKMethodInterfaces.MethodCallRemoveScimGroups sdk) {
        this.sdk = sdk;
    }

    public RemoveScimGroupsRequestBuilder request(RemoveScimGroupsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveScimGroupsResponse call() throws Exception {

        return sdk.removeScimGroups(
            request);
    }
}
