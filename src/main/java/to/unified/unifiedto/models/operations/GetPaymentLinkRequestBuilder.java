/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class GetPaymentLinkRequestBuilder {

    private GetPaymentLinkRequest request;
    private final SDKMethodInterfaces.MethodCallGetPaymentLink sdk;

    public GetPaymentLinkRequestBuilder(SDKMethodInterfaces.MethodCallGetPaymentLink sdk) {
        this.sdk = sdk;
    }

    public GetPaymentLinkRequestBuilder request(GetPaymentLinkRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetPaymentLinkResponse call() throws Exception {

        return sdk.getPaymentLink(
            request);
    }
}
