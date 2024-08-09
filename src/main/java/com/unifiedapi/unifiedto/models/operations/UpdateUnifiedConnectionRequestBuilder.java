/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdateUnifiedConnectionRequestBuilder {

    private UpdateUnifiedConnectionRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateUnifiedConnection sdk;

    public UpdateUnifiedConnectionRequestBuilder(SDKMethodInterfaces.MethodCallUpdateUnifiedConnection sdk) {
        this.sdk = sdk;
    }

    public UpdateUnifiedConnectionRequestBuilder request(com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateUnifiedConnectionResponse call() throws Exception {

        return sdk.updateUnifiedConnection(
            request);
    }
}
