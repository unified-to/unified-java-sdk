/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetAtsDocumentRequestBuilder {

    private GetAtsDocumentRequest request;
    private final SDKMethodInterfaces.MethodCallGetAtsDocument sdk;

    public GetAtsDocumentRequestBuilder(SDKMethodInterfaces.MethodCallGetAtsDocument sdk) {
        this.sdk = sdk;
    }

    public GetAtsDocumentRequestBuilder request(GetAtsDocumentRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAtsDocumentResponse call() throws Exception {

        return sdk.getAtsDocument(
            request);
    }
}
