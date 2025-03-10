/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class PatchAccountingJournalRequestBuilder {

    private PatchAccountingJournalRequest request;
    private final SDKMethodInterfaces.MethodCallPatchAccountingJournal sdk;

    public PatchAccountingJournalRequestBuilder(SDKMethodInterfaces.MethodCallPatchAccountingJournal sdk) {
        this.sdk = sdk;
    }

    public PatchAccountingJournalRequestBuilder request(PatchAccountingJournalRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchAccountingJournalResponse call() throws Exception {

        return sdk.patchAccountingJournal(
            request);
    }
}
