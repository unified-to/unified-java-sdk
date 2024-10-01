/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class RemoveHrisGroupRequestBuilder {

    private RemoveHrisGroupRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveHrisGroup sdk;

    public RemoveHrisGroupRequestBuilder(SDKMethodInterfaces.MethodCallRemoveHrisGroup sdk) {
        this.sdk = sdk;
    }

    public RemoveHrisGroupRequestBuilder request(RemoveHrisGroupRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveHrisGroupResponse call() throws Exception {

        return sdk.removeHrisGroup(
            request);
    }
}
