/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class GetAccountingJournalRequestBuilder {

    private GetAccountingJournalRequest request;
    private final SDKMethodInterfaces.MethodCallGetAccountingJournal sdk;

    public GetAccountingJournalRequestBuilder(SDKMethodInterfaces.MethodCallGetAccountingJournal sdk) {
        this.sdk = sdk;
    }

    public GetAccountingJournalRequestBuilder request(GetAccountingJournalRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAccountingJournalResponse call() throws Exception {

        return sdk.getAccountingJournal(
            request);
    }
}
