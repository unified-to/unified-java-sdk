/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetAccountingContactRequestBuilder {

    private GetAccountingContactRequest request;
    private final SDKMethodInterfaces.MethodCallGetAccountingContact sdk;

    public GetAccountingContactRequestBuilder(SDKMethodInterfaces.MethodCallGetAccountingContact sdk) {
        this.sdk = sdk;
    }

    public GetAccountingContactRequestBuilder request(GetAccountingContactRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAccountingContactResponse call() throws Exception {

        return sdk.getAccountingContact(
            request);
    }
}
