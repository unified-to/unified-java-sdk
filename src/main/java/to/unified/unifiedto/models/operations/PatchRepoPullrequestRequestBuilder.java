/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class PatchRepoPullrequestRequestBuilder {

    private PatchRepoPullrequestRequest request;
    private final SDKMethodInterfaces.MethodCallPatchRepoPullrequest sdk;

    public PatchRepoPullrequestRequestBuilder(SDKMethodInterfaces.MethodCallPatchRepoPullrequest sdk) {
        this.sdk = sdk;
    }

    public PatchRepoPullrequestRequestBuilder request(PatchRepoPullrequestRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchRepoPullrequestResponse call() throws Exception {

        return sdk.patchRepoPullrequest(
            request);
    }
}
