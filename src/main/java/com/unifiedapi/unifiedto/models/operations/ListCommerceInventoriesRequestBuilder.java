/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListCommerceInventoriesRequestBuilder {

    private ListCommerceInventoriesRequest request;
    private final SDKMethodInterfaces.MethodCallListCommerceInventories sdk;

    public ListCommerceInventoriesRequestBuilder(SDKMethodInterfaces.MethodCallListCommerceInventories sdk) {
        this.sdk = sdk;
    }

    public ListCommerceInventoriesRequestBuilder request(com.unifiedapi.unifiedto.models.operations.ListCommerceInventoriesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListCommerceInventoriesResponse call() throws Exception {

        return sdk.listCommerceInventories(
            request);
    }
}
