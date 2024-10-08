/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetHrisGroupRequestBuilder {

    private GetHrisGroupRequest request;
    private final SDKMethodInterfaces.MethodCallGetHrisGroup sdk;

    public GetHrisGroupRequestBuilder(SDKMethodInterfaces.MethodCallGetHrisGroup sdk) {
        this.sdk = sdk;
    }

    public GetHrisGroupRequestBuilder request(GetHrisGroupRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetHrisGroupResponse call() throws Exception {

        return sdk.getHrisGroup(
            request);
    }
}
