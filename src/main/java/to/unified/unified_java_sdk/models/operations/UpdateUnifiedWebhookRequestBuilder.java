/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.UpdateUnifiedWebhookOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class UpdateUnifiedWebhookRequestBuilder {

    private UpdateUnifiedWebhookRequest request;
    private final SDKConfiguration sdkConfiguration;

    public UpdateUnifiedWebhookRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public UpdateUnifiedWebhookRequestBuilder request(UpdateUnifiedWebhookRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateUnifiedWebhookResponse call() throws Exception {
        
        RequestOperation<UpdateUnifiedWebhookRequest, UpdateUnifiedWebhookResponse> operation
              = new UpdateUnifiedWebhookOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
