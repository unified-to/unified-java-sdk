/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetTaskTaskRequestBuilder {

    private GetTaskTaskRequest request;
    private final SDKMethodInterfaces.MethodCallGetTaskTask sdk;

    public GetTaskTaskRequestBuilder(SDKMethodInterfaces.MethodCallGetTaskTask sdk) {
        this.sdk = sdk;
    }

    public GetTaskTaskRequestBuilder request(GetTaskTaskRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetTaskTaskResponse call() throws Exception {

        return sdk.getTaskTask(
            request);
    }
}
