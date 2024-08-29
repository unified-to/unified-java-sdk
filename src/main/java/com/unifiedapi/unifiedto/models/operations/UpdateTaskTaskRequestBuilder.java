/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdateTaskTaskRequestBuilder {

    private UpdateTaskTaskRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateTaskTask sdk;

    public UpdateTaskTaskRequestBuilder(SDKMethodInterfaces.MethodCallUpdateTaskTask sdk) {
        this.sdk = sdk;
    }

    public UpdateTaskTaskRequestBuilder request(com.unifiedapi.unifiedto.models.operations.UpdateTaskTaskRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateTaskTaskResponse call() throws Exception {

        return sdk.updateTaskTask(
            request);
    }
}