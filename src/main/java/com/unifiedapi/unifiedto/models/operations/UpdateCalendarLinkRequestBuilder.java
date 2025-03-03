/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdateCalendarLinkRequestBuilder {

    private UpdateCalendarLinkRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateCalendarLink sdk;

    public UpdateCalendarLinkRequestBuilder(SDKMethodInterfaces.MethodCallUpdateCalendarLink sdk) {
        this.sdk = sdk;
    }

    public UpdateCalendarLinkRequestBuilder request(UpdateCalendarLinkRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateCalendarLinkResponse call() throws Exception {

        return sdk.updateCalendarLink(
            request);
    }
}
