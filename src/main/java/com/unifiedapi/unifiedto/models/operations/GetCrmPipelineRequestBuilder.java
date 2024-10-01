/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetCrmPipelineRequestBuilder {

    private GetCrmPipelineRequest request;
    private final SDKMethodInterfaces.MethodCallGetCrmPipeline sdk;

    public GetCrmPipelineRequestBuilder(SDKMethodInterfaces.MethodCallGetCrmPipeline sdk) {
        this.sdk = sdk;
    }

    public GetCrmPipelineRequestBuilder request(GetCrmPipelineRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetCrmPipelineResponse call() throws Exception {

        return sdk.getCrmPipeline(
            request);
    }
}
