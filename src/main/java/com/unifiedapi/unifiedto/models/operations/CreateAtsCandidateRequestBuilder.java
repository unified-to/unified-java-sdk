/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateAtsCandidateRequestBuilder {

    private CreateAtsCandidateRequest request;
    private final SDKMethodInterfaces.MethodCallCreateAtsCandidate sdk;

    public CreateAtsCandidateRequestBuilder(SDKMethodInterfaces.MethodCallCreateAtsCandidate sdk) {
        this.sdk = sdk;
    }

    public CreateAtsCandidateRequestBuilder request(CreateAtsCandidateRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateAtsCandidateResponse call() throws Exception {

        return sdk.createAtsCandidate(
            request);
    }
}
