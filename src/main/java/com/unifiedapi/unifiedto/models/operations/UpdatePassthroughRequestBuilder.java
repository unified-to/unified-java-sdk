/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdatePassthroughRequestBuilder {

    private UpdatePassthroughRequest request;
    private final SDKMethodInterfaces.MethodCallUpdatePassthrough sdk;

    public UpdatePassthroughRequestBuilder(SDKMethodInterfaces.MethodCallUpdatePassthrough sdk) {
        this.sdk = sdk;
    }

    public UpdatePassthroughRequestBuilder request(com.unifiedapi.unifiedto.models.operations.UpdatePassthroughRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdatePassthroughResponse call() throws Exception {

        return sdk.updatePassthrough(
            request);
    }
}
