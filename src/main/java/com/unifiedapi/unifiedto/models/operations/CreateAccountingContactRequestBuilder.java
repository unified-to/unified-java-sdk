/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateAccountingContactRequestBuilder {

    private CreateAccountingContactRequest request;
    private final SDKMethodInterfaces.MethodCallCreateAccountingContact sdk;

    public CreateAccountingContactRequestBuilder(SDKMethodInterfaces.MethodCallCreateAccountingContact sdk) {
        this.sdk = sdk;
    }

    public CreateAccountingContactRequestBuilder request(CreateAccountingContactRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateAccountingContactResponse call() throws Exception {

        return sdk.createAccountingContact(
            request);
    }
}
