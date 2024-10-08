/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateTicketingNoteRequestBuilder {

    private CreateTicketingNoteRequest request;
    private final SDKMethodInterfaces.MethodCallCreateTicketingNote sdk;

    public CreateTicketingNoteRequestBuilder(SDKMethodInterfaces.MethodCallCreateTicketingNote sdk) {
        this.sdk = sdk;
    }

    public CreateTicketingNoteRequestBuilder request(CreateTicketingNoteRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateTicketingNoteResponse call() throws Exception {

        return sdk.createTicketingNote(
            request);
    }
}
