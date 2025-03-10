/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class PatchAccountingTaxrateRequestBuilder {

    private PatchAccountingTaxrateRequest request;
    private final SDKMethodInterfaces.MethodCallPatchAccountingTaxrate sdk;

    public PatchAccountingTaxrateRequestBuilder(SDKMethodInterfaces.MethodCallPatchAccountingTaxrate sdk) {
        this.sdk = sdk;
    }

    public PatchAccountingTaxrateRequestBuilder request(PatchAccountingTaxrateRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchAccountingTaxrateResponse call() throws Exception {

        return sdk.patchAccountingTaxrate(
            request);
    }
}
