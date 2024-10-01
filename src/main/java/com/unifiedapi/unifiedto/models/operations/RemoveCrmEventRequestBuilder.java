/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class RemoveCrmEventRequestBuilder {

    private RemoveCrmEventRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveCrmEvent sdk;

    public RemoveCrmEventRequestBuilder(SDKMethodInterfaces.MethodCallRemoveCrmEvent sdk) {
        this.sdk = sdk;
    }

    public RemoveCrmEventRequestBuilder request(RemoveCrmEventRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveCrmEventResponse call() throws Exception {

        return sdk.removeCrmEvent(
            request);
    }
}
