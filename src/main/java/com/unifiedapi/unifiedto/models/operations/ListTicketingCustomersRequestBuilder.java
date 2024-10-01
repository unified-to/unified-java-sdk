/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListTicketingCustomersRequestBuilder {

    private ListTicketingCustomersRequest request;
    private final SDKMethodInterfaces.MethodCallListTicketingCustomers sdk;

    public ListTicketingCustomersRequestBuilder(SDKMethodInterfaces.MethodCallListTicketingCustomers sdk) {
        this.sdk = sdk;
    }

    public ListTicketingCustomersRequestBuilder request(ListTicketingCustomersRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListTicketingCustomersResponse call() throws Exception {

        return sdk.listTicketingCustomers(
            request);
    }
}
