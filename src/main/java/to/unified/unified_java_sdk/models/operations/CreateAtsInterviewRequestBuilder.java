/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.CreateAtsInterviewOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class CreateAtsInterviewRequestBuilder {

    private CreateAtsInterviewRequest request;
    private final SDKConfiguration sdkConfiguration;

    public CreateAtsInterviewRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public CreateAtsInterviewRequestBuilder request(CreateAtsInterviewRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateAtsInterviewResponse call() throws Exception {
        
        RequestOperation<CreateAtsInterviewRequest, CreateAtsInterviewResponse> operation
              = new CreateAtsInterviewOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
