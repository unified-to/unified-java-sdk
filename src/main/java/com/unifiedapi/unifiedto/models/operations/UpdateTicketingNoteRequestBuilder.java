/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdateTicketingNoteRequestBuilder {

    private UpdateTicketingNoteRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateTicketingNote sdk;

    public UpdateTicketingNoteRequestBuilder(SDKMethodInterfaces.MethodCallUpdateTicketingNote sdk) {
        this.sdk = sdk;
    }

    public UpdateTicketingNoteRequestBuilder request(UpdateTicketingNoteRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateTicketingNoteResponse call() throws Exception {

        return sdk.updateTicketingNote(
            request);
    }
}
