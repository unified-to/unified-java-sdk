/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.UpdateAtsCandidateOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class UpdateAtsCandidateRequestBuilder {

    private UpdateAtsCandidateRequest request;
    private final SDKConfiguration sdkConfiguration;

    public UpdateAtsCandidateRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public UpdateAtsCandidateRequestBuilder request(UpdateAtsCandidateRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateAtsCandidateResponse call() throws Exception {
        
        RequestOperation<UpdateAtsCandidateRequest, UpdateAtsCandidateResponse> operation
              = new UpdateAtsCandidateOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
