/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateLmsStudentRequestBuilder {

    private CreateLmsStudentRequest request;
    private final SDKMethodInterfaces.MethodCallCreateLmsStudent sdk;

    public CreateLmsStudentRequestBuilder(SDKMethodInterfaces.MethodCallCreateLmsStudent sdk) {
        this.sdk = sdk;
    }

    public CreateLmsStudentRequestBuilder request(CreateLmsStudentRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateLmsStudentResponse call() throws Exception {

        return sdk.createLmsStudent(
            request);
    }
}
