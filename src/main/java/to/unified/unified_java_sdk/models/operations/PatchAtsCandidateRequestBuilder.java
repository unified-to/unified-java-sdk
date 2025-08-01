/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.PatchAtsCandidateOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class PatchAtsCandidateRequestBuilder {

    private PatchAtsCandidateRequest request;
    private final SDKConfiguration sdkConfiguration;

    public PatchAtsCandidateRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public PatchAtsCandidateRequestBuilder request(PatchAtsCandidateRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchAtsCandidateResponse call() throws Exception {
        
        RequestOperation<PatchAtsCandidateRequest, PatchAtsCandidateResponse> operation
              = new PatchAtsCandidateOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
