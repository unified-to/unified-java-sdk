/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class GetTicketingCustomerRequestBuilder {

    private GetTicketingCustomerRequest request;
    private final SDKMethodInterfaces.MethodCallGetTicketingCustomer sdk;

    public GetTicketingCustomerRequestBuilder(SDKMethodInterfaces.MethodCallGetTicketingCustomer sdk) {
        this.sdk = sdk;
    }

    public GetTicketingCustomerRequestBuilder request(GetTicketingCustomerRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetTicketingCustomerResponse call() throws Exception {

        return sdk.getTicketingCustomer(
            request);
    }
}
