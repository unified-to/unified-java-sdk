/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListScimUsersRequestBuilder {

    private ListScimUsersRequest request;
    private final SDKMethodInterfaces.MethodCallListScimUsers sdk;

    public ListScimUsersRequestBuilder(SDKMethodInterfaces.MethodCallListScimUsers sdk) {
        this.sdk = sdk;
    }

    public ListScimUsersRequestBuilder request(ListScimUsersRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListScimUsersResponse call() throws Exception {

        return sdk.listScimUsers(
            request);
    }
}
