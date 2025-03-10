/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class CreateAccountingInvoiceRequestBuilder {

    private CreateAccountingInvoiceRequest request;
    private final SDKMethodInterfaces.MethodCallCreateAccountingInvoice sdk;

    public CreateAccountingInvoiceRequestBuilder(SDKMethodInterfaces.MethodCallCreateAccountingInvoice sdk) {
        this.sdk = sdk;
    }

    public CreateAccountingInvoiceRequestBuilder request(CreateAccountingInvoiceRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateAccountingInvoiceResponse call() throws Exception {

        return sdk.createAccountingInvoice(
            request);
    }
}
