/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetLmsStudentRequestBuilder {

    private GetLmsStudentRequest request;
    private final SDKMethodInterfaces.MethodCallGetLmsStudent sdk;

    public GetLmsStudentRequestBuilder(SDKMethodInterfaces.MethodCallGetLmsStudent sdk) {
        this.sdk = sdk;
    }

    public GetLmsStudentRequestBuilder request(GetLmsStudentRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetLmsStudentResponse call() throws Exception {

        return sdk.getLmsStudent(
            request);
    }
}