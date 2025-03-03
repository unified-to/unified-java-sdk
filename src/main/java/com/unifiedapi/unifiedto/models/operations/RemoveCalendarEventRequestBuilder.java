/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class RemoveCalendarEventRequestBuilder {

    private RemoveCalendarEventRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveCalendarEvent sdk;

    public RemoveCalendarEventRequestBuilder(SDKMethodInterfaces.MethodCallRemoveCalendarEvent sdk) {
        this.sdk = sdk;
    }

    public RemoveCalendarEventRequestBuilder request(RemoveCalendarEventRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveCalendarEventResponse call() throws Exception {

        return sdk.removeCalendarEvent(
            request);
    }
}
