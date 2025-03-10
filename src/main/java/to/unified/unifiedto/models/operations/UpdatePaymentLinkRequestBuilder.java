/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class UpdatePaymentLinkRequestBuilder {

    private UpdatePaymentLinkRequest request;
    private final SDKMethodInterfaces.MethodCallUpdatePaymentLink sdk;

    public UpdatePaymentLinkRequestBuilder(SDKMethodInterfaces.MethodCallUpdatePaymentLink sdk) {
        this.sdk = sdk;
    }

    public UpdatePaymentLinkRequestBuilder request(UpdatePaymentLinkRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdatePaymentLinkResponse call() throws Exception {

        return sdk.updatePaymentLink(
            request);
    }
}
