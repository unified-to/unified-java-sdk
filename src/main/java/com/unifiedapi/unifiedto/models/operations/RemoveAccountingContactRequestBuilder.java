/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class RemoveAccountingContactRequestBuilder {

    private RemoveAccountingContactRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveAccountingContact sdk;

    public RemoveAccountingContactRequestBuilder(SDKMethodInterfaces.MethodCallRemoveAccountingContact sdk) {
        this.sdk = sdk;
    }

    public RemoveAccountingContactRequestBuilder request(RemoveAccountingContactRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveAccountingContactResponse call() throws Exception {

        return sdk.removeAccountingContact(
            request);
    }
}
