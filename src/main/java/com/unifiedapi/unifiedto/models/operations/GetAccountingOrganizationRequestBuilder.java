/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetAccountingOrganizationRequestBuilder {

    private GetAccountingOrganizationRequest request;
    private final SDKMethodInterfaces.MethodCallGetAccountingOrganization sdk;

    public GetAccountingOrganizationRequestBuilder(SDKMethodInterfaces.MethodCallGetAccountingOrganization sdk) {
        this.sdk = sdk;
    }

    public GetAccountingOrganizationRequestBuilder request(com.unifiedapi.unifiedto.models.operations.GetAccountingOrganizationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAccountingOrganizationResponse call() throws Exception {

        return sdk.getAccountingOrganization(
            request);
    }
}