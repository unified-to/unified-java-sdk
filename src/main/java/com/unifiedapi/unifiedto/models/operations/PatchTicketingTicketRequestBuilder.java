/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class PatchTicketingTicketRequestBuilder {

    private PatchTicketingTicketRequest request;
    private final SDKMethodInterfaces.MethodCallPatchTicketingTicket sdk;

    public PatchTicketingTicketRequestBuilder(SDKMethodInterfaces.MethodCallPatchTicketingTicket sdk) {
        this.sdk = sdk;
    }

    public PatchTicketingTicketRequestBuilder request(com.unifiedapi.unifiedto.models.operations.PatchTicketingTicketRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchTicketingTicketResponse call() throws Exception {

        return sdk.patchTicketingTicket(
            request);
    }
}