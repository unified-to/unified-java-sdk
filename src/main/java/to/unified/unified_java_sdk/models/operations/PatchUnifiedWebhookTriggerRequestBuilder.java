/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.PatchUnifiedWebhookTriggerOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class PatchUnifiedWebhookTriggerRequestBuilder {

    private PatchUnifiedWebhookTriggerRequest request;
    private final SDKConfiguration sdkConfiguration;

    public PatchUnifiedWebhookTriggerRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public PatchUnifiedWebhookTriggerRequestBuilder request(PatchUnifiedWebhookTriggerRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchUnifiedWebhookTriggerResponse call() throws Exception {
        
        RequestOperation<PatchUnifiedWebhookTriggerRequest, PatchUnifiedWebhookTriggerResponse> operation
              = new PatchUnifiedWebhookTriggerOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
