/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdateHrisGroupRequestBuilder {

    private UpdateHrisGroupRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateHrisGroup sdk;

    public UpdateHrisGroupRequestBuilder(SDKMethodInterfaces.MethodCallUpdateHrisGroup sdk) {
        this.sdk = sdk;
    }

    public UpdateHrisGroupRequestBuilder request(UpdateHrisGroupRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateHrisGroupResponse call() throws Exception {

        return sdk.updateHrisGroup(
            request);
    }
}
