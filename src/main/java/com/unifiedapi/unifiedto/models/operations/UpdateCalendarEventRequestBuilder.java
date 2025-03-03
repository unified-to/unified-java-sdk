/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdateCalendarEventRequestBuilder {

    private UpdateCalendarEventRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateCalendarEvent sdk;

    public UpdateCalendarEventRequestBuilder(SDKMethodInterfaces.MethodCallUpdateCalendarEvent sdk) {
        this.sdk = sdk;
    }

    public UpdateCalendarEventRequestBuilder request(UpdateCalendarEventRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateCalendarEventResponse call() throws Exception {

        return sdk.updateCalendarEvent(
            request);
    }
}
