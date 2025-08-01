/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.UpdateRepoCommitOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class UpdateRepoCommitRequestBuilder {

    private UpdateRepoCommitRequest request;
    private final SDKConfiguration sdkConfiguration;

    public UpdateRepoCommitRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public UpdateRepoCommitRequestBuilder request(UpdateRepoCommitRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateRepoCommitResponse call() throws Exception {
        
        RequestOperation<UpdateRepoCommitRequest, UpdateRepoCommitResponse> operation
              = new UpdateRepoCommitOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
