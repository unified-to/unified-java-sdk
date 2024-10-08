/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetHrisCompanyRequestBuilder {

    private GetHrisCompanyRequest request;
    private final SDKMethodInterfaces.MethodCallGetHrisCompany sdk;

    public GetHrisCompanyRequestBuilder(SDKMethodInterfaces.MethodCallGetHrisCompany sdk) {
        this.sdk = sdk;
    }

    public GetHrisCompanyRequestBuilder request(GetHrisCompanyRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetHrisCompanyResponse call() throws Exception {

        return sdk.getHrisCompany(
            request);
    }
}
