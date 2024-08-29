/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListUnifiedApicallsRequestBuilder {

    private ListUnifiedApicallsRequest request;
    private final SDKMethodInterfaces.MethodCallListUnifiedApicalls sdk;

    public ListUnifiedApicallsRequestBuilder(SDKMethodInterfaces.MethodCallListUnifiedApicalls sdk) {
        this.sdk = sdk;
    }

    public ListUnifiedApicallsRequestBuilder request(com.unifiedapi.unifiedto.models.operations.ListUnifiedApicallsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListUnifiedApicallsResponse call() throws Exception {

        return sdk.listUnifiedApicalls(
            request);
    }
}