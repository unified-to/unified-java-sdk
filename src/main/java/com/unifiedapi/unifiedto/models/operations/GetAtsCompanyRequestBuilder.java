/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetAtsCompanyRequestBuilder {

    private GetAtsCompanyRequest request;
    private final SDKMethodInterfaces.MethodCallGetAtsCompany sdk;

    public GetAtsCompanyRequestBuilder(SDKMethodInterfaces.MethodCallGetAtsCompany sdk) {
        this.sdk = sdk;
    }

    public GetAtsCompanyRequestBuilder request(GetAtsCompanyRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAtsCompanyResponse call() throws Exception {

        return sdk.getAtsCompany(
            request);
    }
}
