/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class GetAccountingInvoiceRequestBuilder {

    private GetAccountingInvoiceRequest request;
    private final SDKMethodInterfaces.MethodCallGetAccountingInvoice sdk;

    public GetAccountingInvoiceRequestBuilder(SDKMethodInterfaces.MethodCallGetAccountingInvoice sdk) {
        this.sdk = sdk;
    }

    public GetAccountingInvoiceRequestBuilder request(com.unifiedapi.unifiedto.models.operations.GetAccountingInvoiceRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAccountingInvoiceResponse call() throws Exception {

        return sdk.getAccountingInvoice(
            request);
    }
}