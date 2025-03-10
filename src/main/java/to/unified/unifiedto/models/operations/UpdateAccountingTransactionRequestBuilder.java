/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class UpdateAccountingTransactionRequestBuilder {

    private UpdateAccountingTransactionRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateAccountingTransaction sdk;

    public UpdateAccountingTransactionRequestBuilder(SDKMethodInterfaces.MethodCallUpdateAccountingTransaction sdk) {
        this.sdk = sdk;
    }

    public UpdateAccountingTransactionRequestBuilder request(UpdateAccountingTransactionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateAccountingTransactionResponse call() throws Exception {

        return sdk.updateAccountingTransaction(
            request);
    }
}
