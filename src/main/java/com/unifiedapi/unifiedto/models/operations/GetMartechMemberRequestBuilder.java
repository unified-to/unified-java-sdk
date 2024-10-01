/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetMartechMemberRequestBuilder {

    private GetMartechMemberRequest request;
    private final SDKMethodInterfaces.MethodCallGetMartechMember sdk;

    public GetMartechMemberRequestBuilder(SDKMethodInterfaces.MethodCallGetMartechMember sdk) {
        this.sdk = sdk;
    }

    public GetMartechMemberRequestBuilder request(GetMartechMemberRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetMartechMemberResponse call() throws Exception {

        return sdk.getMartechMember(
            request);
    }
}
