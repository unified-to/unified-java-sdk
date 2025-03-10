/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class PatchAccountingTransactionRequestBuilder {

    private PatchAccountingTransactionRequest request;
    private final SDKMethodInterfaces.MethodCallPatchAccountingTransaction sdk;

    public PatchAccountingTransactionRequestBuilder(SDKMethodInterfaces.MethodCallPatchAccountingTransaction sdk) {
        this.sdk = sdk;
    }

    public PatchAccountingTransactionRequestBuilder request(PatchAccountingTransactionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchAccountingTransactionResponse call() throws Exception {

        return sdk.patchAccountingTransaction(
            request);
    }
}
