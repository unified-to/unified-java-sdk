/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListCalendarBusiesRequestBuilder {

    private ListCalendarBusiesRequest request;
    private final SDKMethodInterfaces.MethodCallListCalendarBusies sdk;

    public ListCalendarBusiesRequestBuilder(SDKMethodInterfaces.MethodCallListCalendarBusies sdk) {
        this.sdk = sdk;
    }

    public ListCalendarBusiesRequestBuilder request(ListCalendarBusiesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListCalendarBusiesResponse call() throws Exception {

        return sdk.listCalendarBusies(
            request);
    }
}
