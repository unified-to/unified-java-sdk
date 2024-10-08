/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdateAccountingJournalRequestBuilder {

    private UpdateAccountingJournalRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateAccountingJournal sdk;

    public UpdateAccountingJournalRequestBuilder(SDKMethodInterfaces.MethodCallUpdateAccountingJournal sdk) {
        this.sdk = sdk;
    }

    public UpdateAccountingJournalRequestBuilder request(UpdateAccountingJournalRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateAccountingJournalResponse call() throws Exception {

        return sdk.updateAccountingJournal(
            request);
    }
}
