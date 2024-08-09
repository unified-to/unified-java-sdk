/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateTaskProjectRequestBuilder {

    private CreateTaskProjectRequest request;
    private final SDKMethodInterfaces.MethodCallCreateTaskProject sdk;

    public CreateTaskProjectRequestBuilder(SDKMethodInterfaces.MethodCallCreateTaskProject sdk) {
        this.sdk = sdk;
    }

    public CreateTaskProjectRequestBuilder request(com.unifiedapi.unifiedto.models.operations.CreateTaskProjectRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateTaskProjectResponse call() throws Exception {

        return sdk.createTaskProject(
            request);
    }
}
