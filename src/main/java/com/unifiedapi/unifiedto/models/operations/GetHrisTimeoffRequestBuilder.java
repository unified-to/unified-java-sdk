/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetHrisTimeoffRequestBuilder {

    private GetHrisTimeoffRequest request;
    private final SDKMethodInterfaces.MethodCallGetHrisTimeoff sdk;

    public GetHrisTimeoffRequestBuilder(SDKMethodInterfaces.MethodCallGetHrisTimeoff sdk) {
        this.sdk = sdk;
    }

    public GetHrisTimeoffRequestBuilder request(GetHrisTimeoffRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetHrisTimeoffResponse call() throws Exception {

        return sdk.getHrisTimeoff(
            request);
    }
}
