/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class RemoveLmsInstructorRequestBuilder {

    private RemoveLmsInstructorRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveLmsInstructor sdk;

    public RemoveLmsInstructorRequestBuilder(SDKMethodInterfaces.MethodCallRemoveLmsInstructor sdk) {
        this.sdk = sdk;
    }

    public RemoveLmsInstructorRequestBuilder request(RemoveLmsInstructorRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveLmsInstructorResponse call() throws Exception {

        return sdk.removeLmsInstructor(
            request);
    }
}
