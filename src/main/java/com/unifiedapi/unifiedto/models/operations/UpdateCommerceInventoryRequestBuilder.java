/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class UpdateCommerceInventoryRequestBuilder {

    private UpdateCommerceInventoryRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateCommerceInventory sdk;

    public UpdateCommerceInventoryRequestBuilder(SDKMethodInterfaces.MethodCallUpdateCommerceInventory sdk) {
        this.sdk = sdk;
    }

    public UpdateCommerceInventoryRequestBuilder request(UpdateCommerceInventoryRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateCommerceInventoryResponse call() throws Exception {

        return sdk.updateCommerceInventory(
            request);
    }
}
