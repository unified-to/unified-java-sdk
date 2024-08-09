/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class RemoveAtsJobRequestBuilder {

    private RemoveAtsJobRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveAtsJob sdk;

    public RemoveAtsJobRequestBuilder(SDKMethodInterfaces.MethodCallRemoveAtsJob sdk) {
        this.sdk = sdk;
    }

    public RemoveAtsJobRequestBuilder request(com.unifiedapi.unifiedto.models.operations.RemoveAtsJobRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveAtsJobResponse call() throws Exception {

        return sdk.removeAtsJob(
            request);
    }
}
