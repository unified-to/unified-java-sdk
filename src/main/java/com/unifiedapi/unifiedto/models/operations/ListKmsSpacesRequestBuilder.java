/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListKmsSpacesRequestBuilder {

    private ListKmsSpacesRequest request;
    private final SDKMethodInterfaces.MethodCallListKmsSpaces sdk;

    public ListKmsSpacesRequestBuilder(SDKMethodInterfaces.MethodCallListKmsSpaces sdk) {
        this.sdk = sdk;
    }

    public ListKmsSpacesRequestBuilder request(ListKmsSpacesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListKmsSpacesResponse call() throws Exception {

        return sdk.listKmsSpaces(
            request);
    }
}
