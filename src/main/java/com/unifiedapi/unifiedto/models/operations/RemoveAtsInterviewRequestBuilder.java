/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class RemoveAtsInterviewRequestBuilder {

    private RemoveAtsInterviewRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveAtsInterview sdk;

    public RemoveAtsInterviewRequestBuilder(SDKMethodInterfaces.MethodCallRemoveAtsInterview sdk) {
        this.sdk = sdk;
    }

    public RemoveAtsInterviewRequestBuilder request(com.unifiedapi.unifiedto.models.operations.RemoveAtsInterviewRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveAtsInterviewResponse call() throws Exception {

        return sdk.removeAtsInterview(
            request);
    }
}