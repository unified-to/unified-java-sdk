/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetUnifiedConnectionRequestBuilder {

    private GetUnifiedConnectionRequest request;
    private final SDKMethodInterfaces.MethodCallGetUnifiedConnection sdk;

    public GetUnifiedConnectionRequestBuilder(SDKMethodInterfaces.MethodCallGetUnifiedConnection sdk) {
        this.sdk = sdk;
    }

    public GetUnifiedConnectionRequestBuilder request(com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetUnifiedConnectionResponse call() throws Exception {

        return sdk.getUnifiedConnection(
            request);
    }
}