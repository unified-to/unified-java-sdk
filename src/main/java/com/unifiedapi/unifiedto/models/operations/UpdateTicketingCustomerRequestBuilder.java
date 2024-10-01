/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdateTicketingCustomerRequestBuilder {

    private UpdateTicketingCustomerRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateTicketingCustomer sdk;

    public UpdateTicketingCustomerRequestBuilder(SDKMethodInterfaces.MethodCallUpdateTicketingCustomer sdk) {
        this.sdk = sdk;
    }

    public UpdateTicketingCustomerRequestBuilder request(UpdateTicketingCustomerRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateTicketingCustomerResponse call() throws Exception {

        return sdk.updateTicketingCustomer(
            request);
    }
}
