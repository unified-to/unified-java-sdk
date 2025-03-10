/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class PatchCrmEventRequestBuilder {

    private PatchCrmEventRequest request;
    private final SDKMethodInterfaces.MethodCallPatchCrmEvent sdk;

    public PatchCrmEventRequestBuilder(SDKMethodInterfaces.MethodCallPatchCrmEvent sdk) {
        this.sdk = sdk;
    }

    public PatchCrmEventRequestBuilder request(PatchCrmEventRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchCrmEventResponse call() throws Exception {

        return sdk.patchCrmEvent(
            request);
    }
}
