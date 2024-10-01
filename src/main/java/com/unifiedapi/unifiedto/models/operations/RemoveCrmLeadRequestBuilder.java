/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class RemoveCrmLeadRequestBuilder {

    private RemoveCrmLeadRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveCrmLead sdk;

    public RemoveCrmLeadRequestBuilder(SDKMethodInterfaces.MethodCallRemoveCrmLead sdk) {
        this.sdk = sdk;
    }

    public RemoveCrmLeadRequestBuilder request(RemoveCrmLeadRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveCrmLeadResponse call() throws Exception {

        return sdk.removeCrmLead(
            request);
    }
}
