/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class PatchAtsJobRequestBuilder {

    private PatchAtsJobRequest request;
    private final SDKMethodInterfaces.MethodCallPatchAtsJob sdk;

    public PatchAtsJobRequestBuilder(SDKMethodInterfaces.MethodCallPatchAtsJob sdk) {
        this.sdk = sdk;
    }

    public PatchAtsJobRequestBuilder request(PatchAtsJobRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchAtsJobResponse call() throws Exception {

        return sdk.patchAtsJob(
            request);
    }
}
