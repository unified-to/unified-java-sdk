/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateTaskTaskRequestBuilder {

    private CreateTaskTaskRequest request;
    private final SDKMethodInterfaces.MethodCallCreateTaskTask sdk;

    public CreateTaskTaskRequestBuilder(SDKMethodInterfaces.MethodCallCreateTaskTask sdk) {
        this.sdk = sdk;
    }

    public CreateTaskTaskRequestBuilder request(CreateTaskTaskRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateTaskTaskResponse call() throws Exception {

        return sdk.createTaskTask(
            request);
    }
}
