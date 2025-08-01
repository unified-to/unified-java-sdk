/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.UpdateCrmEventOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class UpdateCrmEventRequestBuilder {

    private UpdateCrmEventRequest request;
    private final SDKConfiguration sdkConfiguration;

    public UpdateCrmEventRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public UpdateCrmEventRequestBuilder request(UpdateCrmEventRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateCrmEventResponse call() throws Exception {
        
        RequestOperation<UpdateCrmEventRequest, UpdateCrmEventResponse> operation
              = new UpdateCrmEventOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
