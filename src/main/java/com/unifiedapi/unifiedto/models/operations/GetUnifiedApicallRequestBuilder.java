/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetUnifiedApicallRequestBuilder {

    private GetUnifiedApicallRequest request;
    private final SDKMethodInterfaces.MethodCallGetUnifiedApicall sdk;

    public GetUnifiedApicallRequestBuilder(SDKMethodInterfaces.MethodCallGetUnifiedApicall sdk) {
        this.sdk = sdk;
    }

    public GetUnifiedApicallRequestBuilder request(com.unifiedapi.unifiedto.models.operations.GetUnifiedApicallRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetUnifiedApicallResponse call() throws Exception {

        return sdk.getUnifiedApicall(
            request);
    }
}
