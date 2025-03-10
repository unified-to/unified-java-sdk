/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class ListKmsPagesRequestBuilder {

    private ListKmsPagesRequest request;
    private final SDKMethodInterfaces.MethodCallListKmsPages sdk;

    public ListKmsPagesRequestBuilder(SDKMethodInterfaces.MethodCallListKmsPages sdk) {
        this.sdk = sdk;
    }

    public ListKmsPagesRequestBuilder request(ListKmsPagesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListKmsPagesResponse call() throws Exception {

        return sdk.listKmsPages(
            request);
    }
}
