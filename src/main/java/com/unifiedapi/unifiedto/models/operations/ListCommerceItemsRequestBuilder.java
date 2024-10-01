/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListCommerceItemsRequestBuilder {

    private ListCommerceItemsRequest request;
    private final SDKMethodInterfaces.MethodCallListCommerceItems sdk;

    public ListCommerceItemsRequestBuilder(SDKMethodInterfaces.MethodCallListCommerceItems sdk) {
        this.sdk = sdk;
    }

    public ListCommerceItemsRequestBuilder request(ListCommerceItemsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListCommerceItemsResponse call() throws Exception {

        return sdk.listCommerceItems(
            request);
    }
}
