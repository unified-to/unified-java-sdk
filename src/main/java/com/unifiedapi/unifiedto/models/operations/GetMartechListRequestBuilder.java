/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetMartechListRequestBuilder {

    private GetMartechListRequest request;
    private final SDKMethodInterfaces.MethodCallGetMartechList sdk;

    public GetMartechListRequestBuilder(SDKMethodInterfaces.MethodCallGetMartechList sdk) {
        this.sdk = sdk;
    }

    public GetMartechListRequestBuilder request(com.unifiedapi.unifiedto.models.operations.GetMartechListRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetMartechListResponse call() throws Exception {

        return sdk.getMartechList(
            request);
    }
}
