/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.CreateUcRecordingOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class CreateUcRecordingRequestBuilder {

    private CreateUcRecordingRequest request;
    private final SDKConfiguration sdkConfiguration;

    public CreateUcRecordingRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public CreateUcRecordingRequestBuilder request(CreateUcRecordingRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateUcRecordingResponse call() throws Exception {
        
        RequestOperation<CreateUcRecordingRequest, CreateUcRecordingResponse> operation
              = new CreateUcRecordingOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
