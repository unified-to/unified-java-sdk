/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListCommerceCollectionsRequestBuilder {

    private ListCommerceCollectionsRequest request;
    private final SDKMethodInterfaces.MethodCallListCommerceCollections sdk;

    public ListCommerceCollectionsRequestBuilder(SDKMethodInterfaces.MethodCallListCommerceCollections sdk) {
        this.sdk = sdk;
    }

    public ListCommerceCollectionsRequestBuilder request(ListCommerceCollectionsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListCommerceCollectionsResponse call() throws Exception {

        return sdk.listCommerceCollections(
            request);
    }
}
