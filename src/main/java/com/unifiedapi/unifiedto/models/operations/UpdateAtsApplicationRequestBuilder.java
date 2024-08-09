/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdateAtsApplicationRequestBuilder {

    private UpdateAtsApplicationRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateAtsApplication sdk;

    public UpdateAtsApplicationRequestBuilder(SDKMethodInterfaces.MethodCallUpdateAtsApplication sdk) {
        this.sdk = sdk;
    }

    public UpdateAtsApplicationRequestBuilder request(com.unifiedapi.unifiedto.models.operations.UpdateAtsApplicationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateAtsApplicationResponse call() throws Exception {

        return sdk.updateAtsApplication(
            request);
    }
}
