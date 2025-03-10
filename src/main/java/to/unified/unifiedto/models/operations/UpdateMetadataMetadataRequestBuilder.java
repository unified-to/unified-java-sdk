/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class UpdateMetadataMetadataRequestBuilder {

    private UpdateMetadataMetadataRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateMetadataMetadata sdk;

    public UpdateMetadataMetadataRequestBuilder(SDKMethodInterfaces.MethodCallUpdateMetadataMetadata sdk) {
        this.sdk = sdk;
    }

    public UpdateMetadataMetadataRequestBuilder request(UpdateMetadataMetadataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateMetadataMetadataResponse call() throws Exception {

        return sdk.updateMetadataMetadata(
            request);
    }
}
