/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListCrmDealsRequestBuilder {

    private ListCrmDealsRequest request;
    private final SDKMethodInterfaces.MethodCallListCrmDeals sdk;

    public ListCrmDealsRequestBuilder(SDKMethodInterfaces.MethodCallListCrmDeals sdk) {
        this.sdk = sdk;
    }

    public ListCrmDealsRequestBuilder request(ListCrmDealsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListCrmDealsResponse call() throws Exception {

        return sdk.listCrmDeals(
            request);
    }
}
