/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class PatchMartechMemberRequestBuilder {

    private PatchMartechMemberRequest request;
    private final SDKMethodInterfaces.MethodCallPatchMartechMember sdk;

    public PatchMartechMemberRequestBuilder(SDKMethodInterfaces.MethodCallPatchMartechMember sdk) {
        this.sdk = sdk;
    }

    public PatchMartechMemberRequestBuilder request(PatchMartechMemberRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchMartechMemberResponse call() throws Exception {

        return sdk.patchMartechMember(
            request);
    }
}
