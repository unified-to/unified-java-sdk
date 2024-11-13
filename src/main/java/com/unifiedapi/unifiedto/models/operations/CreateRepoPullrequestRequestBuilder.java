/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateRepoPullrequestRequestBuilder {

    private CreateRepoPullrequestRequest request;
    private final SDKMethodInterfaces.MethodCallCreateRepoPullrequest sdk;

    public CreateRepoPullrequestRequestBuilder(SDKMethodInterfaces.MethodCallCreateRepoPullrequest sdk) {
        this.sdk = sdk;
    }

    public CreateRepoPullrequestRequestBuilder request(CreateRepoPullrequestRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateRepoPullrequestResponse call() throws Exception {

        return sdk.createRepoPullrequest(
            request);
    }
}