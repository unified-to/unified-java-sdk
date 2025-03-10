/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class ListCrmDealsRequestBuilder {

    private ListCrmDealsRequest request;
    private final SDKMethodInterfaces.MethodCallListCrmDeals sdk;

    public ListCrmDealsRequestBuilder(SDKMethodInterfaces.MethodCallListCrmDeals sdk) {
        this.sdk = sdk;
    }

    public ListCrmDealsRequestBuilder request(ListCrmDealsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListCrmDealsResponse call() throws Exception {

        return sdk.listCrmDeals(
            request);
    }
}
