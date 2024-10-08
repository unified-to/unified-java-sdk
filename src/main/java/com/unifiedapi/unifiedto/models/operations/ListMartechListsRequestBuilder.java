/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListMartechListsRequestBuilder {

    private ListMartechListsRequest request;
    private final SDKMethodInterfaces.MethodCallListMartechLists sdk;

    public ListMartechListsRequestBuilder(SDKMethodInterfaces.MethodCallListMartechLists sdk) {
        this.sdk = sdk;
    }

    public ListMartechListsRequestBuilder request(ListMartechListsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListMartechListsResponse call() throws Exception {

        return sdk.listMartechLists(
            request);
    }
}
