/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class GetCrmLeadRequestBuilder {

    private GetCrmLeadRequest request;
    private final SDKMethodInterfaces.MethodCallGetCrmLead sdk;

    public GetCrmLeadRequestBuilder(SDKMethodInterfaces.MethodCallGetCrmLead sdk) {
        this.sdk = sdk;
    }

    public GetCrmLeadRequestBuilder request(GetCrmLeadRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetCrmLeadResponse call() throws Exception {

        return sdk.getCrmLead(
            request);
    }
}
