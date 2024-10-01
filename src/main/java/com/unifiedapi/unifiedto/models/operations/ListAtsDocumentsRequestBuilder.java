/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListAtsDocumentsRequestBuilder {

    private ListAtsDocumentsRequest request;
    private final SDKMethodInterfaces.MethodCallListAtsDocuments sdk;

    public ListAtsDocumentsRequestBuilder(SDKMethodInterfaces.MethodCallListAtsDocuments sdk) {
        this.sdk = sdk;
    }

    public ListAtsDocumentsRequestBuilder request(ListAtsDocumentsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListAtsDocumentsResponse call() throws Exception {

        return sdk.listAtsDocuments(
            request);
    }
}
