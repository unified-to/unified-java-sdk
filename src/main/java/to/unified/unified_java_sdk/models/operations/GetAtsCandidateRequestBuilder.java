/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.GetAtsCandidateOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class GetAtsCandidateRequestBuilder {

    private GetAtsCandidateRequest request;
    private final SDKConfiguration sdkConfiguration;

    public GetAtsCandidateRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public GetAtsCandidateRequestBuilder request(GetAtsCandidateRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAtsCandidateResponse call() throws Exception {
        
        RequestOperation<GetAtsCandidateRequest, GetAtsCandidateResponse> operation
              = new GetAtsCandidateOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
