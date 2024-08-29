/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateCrmCompanyRequestBuilder {

    private CreateCrmCompanyRequest request;
    private final SDKMethodInterfaces.MethodCallCreateCrmCompany sdk;

    public CreateCrmCompanyRequestBuilder(SDKMethodInterfaces.MethodCallCreateCrmCompany sdk) {
        this.sdk = sdk;
    }

    public CreateCrmCompanyRequestBuilder request(com.unifiedapi.unifiedto.models.operations.CreateCrmCompanyRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateCrmCompanyResponse call() throws Exception {

        return sdk.createCrmCompany(
            request);
    }
}