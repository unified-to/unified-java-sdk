/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class ListMetadataMetadatasRequestBuilder {

    private ListMetadataMetadatasRequest request;
    private final SDKMethodInterfaces.MethodCallListMetadataMetadatas sdk;

    public ListMetadataMetadatasRequestBuilder(SDKMethodInterfaces.MethodCallListMetadataMetadatas sdk) {
        this.sdk = sdk;
    }

    public ListMetadataMetadatasRequestBuilder request(ListMetadataMetadatasRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListMetadataMetadatasResponse call() throws Exception {

        return sdk.listMetadataMetadatas(
            request);
    }
}
