/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListCrmContactsRequestBuilder {

    private ListCrmContactsRequest request;
    private final SDKMethodInterfaces.MethodCallListCrmContacts sdk;

    public ListCrmContactsRequestBuilder(SDKMethodInterfaces.MethodCallListCrmContacts sdk) {
        this.sdk = sdk;
    }

    public ListCrmContactsRequestBuilder request(ListCrmContactsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListCrmContactsResponse call() throws Exception {

        return sdk.listCrmContacts(
            request);
    }
}
