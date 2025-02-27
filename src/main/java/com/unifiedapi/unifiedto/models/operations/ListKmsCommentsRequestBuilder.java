/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListKmsCommentsRequestBuilder {

    private ListKmsCommentsRequest request;
    private final SDKMethodInterfaces.MethodCallListKmsComments sdk;

    public ListKmsCommentsRequestBuilder(SDKMethodInterfaces.MethodCallListKmsComments sdk) {
        this.sdk = sdk;
    }

    public ListKmsCommentsRequestBuilder request(ListKmsCommentsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListKmsCommentsResponse call() throws Exception {

        return sdk.listKmsComments(
            request);
    }
}
