/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateHrisCompanyRequestBuilder {

    private CreateHrisCompanyRequest request;
    private final SDKMethodInterfaces.MethodCallCreateHrisCompany sdk;

    public CreateHrisCompanyRequestBuilder(SDKMethodInterfaces.MethodCallCreateHrisCompany sdk) {
        this.sdk = sdk;
    }

    public CreateHrisCompanyRequestBuilder request(CreateHrisCompanyRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateHrisCompanyResponse call() throws Exception {

        return sdk.createHrisCompany(
            request);
    }
}
