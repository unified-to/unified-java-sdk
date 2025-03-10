/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class PatchMetadataMetadataRequestBuilder {

    private PatchMetadataMetadataRequest request;
    private final SDKMethodInterfaces.MethodCallPatchMetadataMetadata sdk;

    public PatchMetadataMetadataRequestBuilder(SDKMethodInterfaces.MethodCallPatchMetadataMetadata sdk) {
        this.sdk = sdk;
    }

    public PatchMetadataMetadataRequestBuilder request(PatchMetadataMetadataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchMetadataMetadataResponse call() throws Exception {

        return sdk.patchMetadataMetadata(
            request);
    }
}
