/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class RemoveScimUsersRequestBuilder {

    private RemoveScimUsersRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveScimUsers sdk;

    public RemoveScimUsersRequestBuilder(SDKMethodInterfaces.MethodCallRemoveScimUsers sdk) {
        this.sdk = sdk;
    }

    public RemoveScimUsersRequestBuilder request(RemoveScimUsersRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveScimUsersResponse call() throws Exception {

        return sdk.removeScimUsers(
            request);
    }
}
