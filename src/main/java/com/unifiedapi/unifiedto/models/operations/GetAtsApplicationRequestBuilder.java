/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetAtsApplicationRequestBuilder {

    private GetAtsApplicationRequest request;
    private final SDKMethodInterfaces.MethodCallGetAtsApplication sdk;

    public GetAtsApplicationRequestBuilder(SDKMethodInterfaces.MethodCallGetAtsApplication sdk) {
        this.sdk = sdk;
    }

    public GetAtsApplicationRequestBuilder request(GetAtsApplicationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAtsApplicationResponse call() throws Exception {

        return sdk.getAtsApplication(
            request);
    }
}
