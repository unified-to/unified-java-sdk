/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetKmsPageRequestBuilder {

    private GetKmsPageRequest request;
    private final SDKMethodInterfaces.MethodCallGetKmsPage sdk;

    public GetKmsPageRequestBuilder(SDKMethodInterfaces.MethodCallGetKmsPage sdk) {
        this.sdk = sdk;
    }

    public GetKmsPageRequestBuilder request(GetKmsPageRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetKmsPageResponse call() throws Exception {

        return sdk.getKmsPage(
            request);
    }
}
