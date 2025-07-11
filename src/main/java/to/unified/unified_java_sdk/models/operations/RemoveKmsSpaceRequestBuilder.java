/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.RemoveKmsSpaceOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class RemoveKmsSpaceRequestBuilder {

    private RemoveKmsSpaceRequest request;
    private final SDKConfiguration sdkConfiguration;

    public RemoveKmsSpaceRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public RemoveKmsSpaceRequestBuilder request(RemoveKmsSpaceRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveKmsSpaceResponse call() throws Exception {
        
        RequestOperation<RemoveKmsSpaceRequest, RemoveKmsSpaceResponse> operation
              = new RemoveKmsSpaceOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
