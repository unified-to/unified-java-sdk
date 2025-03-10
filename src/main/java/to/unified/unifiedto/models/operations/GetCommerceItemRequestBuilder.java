/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class GetCommerceItemRequestBuilder {

    private GetCommerceItemRequest request;
    private final SDKMethodInterfaces.MethodCallGetCommerceItem sdk;

    public GetCommerceItemRequestBuilder(SDKMethodInterfaces.MethodCallGetCommerceItem sdk) {
        this.sdk = sdk;
    }

    public GetCommerceItemRequestBuilder request(GetCommerceItemRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetCommerceItemResponse call() throws Exception {

        return sdk.getCommerceItem(
            request);
    }
}
