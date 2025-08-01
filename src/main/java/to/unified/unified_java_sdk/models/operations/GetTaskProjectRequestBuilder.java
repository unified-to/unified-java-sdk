/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.GetTaskProjectOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class GetTaskProjectRequestBuilder {

    private GetTaskProjectRequest request;
    private final SDKConfiguration sdkConfiguration;

    public GetTaskProjectRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public GetTaskProjectRequestBuilder request(GetTaskProjectRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetTaskProjectResponse call() throws Exception {
        
        RequestOperation<GetTaskProjectRequest, GetTaskProjectResponse> operation
              = new GetTaskProjectOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
