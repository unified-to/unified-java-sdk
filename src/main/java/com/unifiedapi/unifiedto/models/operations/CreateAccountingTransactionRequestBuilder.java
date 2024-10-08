/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateAccountingTransactionRequestBuilder {

    private CreateAccountingTransactionRequest request;
    private final SDKMethodInterfaces.MethodCallCreateAccountingTransaction sdk;

    public CreateAccountingTransactionRequestBuilder(SDKMethodInterfaces.MethodCallCreateAccountingTransaction sdk) {
        this.sdk = sdk;
    }

    public CreateAccountingTransactionRequestBuilder request(CreateAccountingTransactionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateAccountingTransactionResponse call() throws Exception {

        return sdk.createAccountingTransaction(
            request);
    }
}
