/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.RemoveLmsStudentOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class RemoveLmsStudentRequestBuilder {

    private RemoveLmsStudentRequest request;
    private final SDKConfiguration sdkConfiguration;

    public RemoveLmsStudentRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public RemoveLmsStudentRequestBuilder request(RemoveLmsStudentRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveLmsStudentResponse call() throws Exception {
        
        RequestOperation<RemoveLmsStudentRequest, RemoveLmsStudentResponse> operation
              = new RemoveLmsStudentOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
