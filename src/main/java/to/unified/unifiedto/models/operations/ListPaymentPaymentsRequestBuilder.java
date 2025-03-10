/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class ListPaymentPaymentsRequestBuilder {

    private ListPaymentPaymentsRequest request;
    private final SDKMethodInterfaces.MethodCallListPaymentPayments sdk;

    public ListPaymentPaymentsRequestBuilder(SDKMethodInterfaces.MethodCallListPaymentPayments sdk) {
        this.sdk = sdk;
    }

    public ListPaymentPaymentsRequestBuilder request(ListPaymentPaymentsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListPaymentPaymentsResponse call() throws Exception {

        return sdk.listPaymentPayments(
            request);
    }
}
