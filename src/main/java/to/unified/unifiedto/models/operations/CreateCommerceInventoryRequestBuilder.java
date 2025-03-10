/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class CreateCommerceInventoryRequestBuilder {

    private CreateCommerceInventoryRequest request;
    private final SDKMethodInterfaces.MethodCallCreateCommerceInventory sdk;

    public CreateCommerceInventoryRequestBuilder(SDKMethodInterfaces.MethodCallCreateCommerceInventory sdk) {
        this.sdk = sdk;
    }

    public CreateCommerceInventoryRequestBuilder request(CreateCommerceInventoryRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateCommerceInventoryResponse call() throws Exception {

        return sdk.createCommerceInventory(
            request);
    }
}
