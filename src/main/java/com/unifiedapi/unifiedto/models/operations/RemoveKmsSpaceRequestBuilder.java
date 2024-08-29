/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class RemoveKmsSpaceRequestBuilder {

    private RemoveKmsSpaceRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveKmsSpace sdk;

    public RemoveKmsSpaceRequestBuilder(SDKMethodInterfaces.MethodCallRemoveKmsSpace sdk) {
        this.sdk = sdk;
    }

    public RemoveKmsSpaceRequestBuilder request(com.unifiedapi.unifiedto.models.operations.RemoveKmsSpaceRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveKmsSpaceResponse call() throws Exception {

        return sdk.removeKmsSpace(
            request);
    }
}