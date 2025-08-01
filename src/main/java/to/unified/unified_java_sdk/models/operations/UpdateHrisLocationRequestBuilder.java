/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.UpdateHrisLocationOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class UpdateHrisLocationRequestBuilder {

    private UpdateHrisLocationRequest request;
    private final SDKConfiguration sdkConfiguration;

    public UpdateHrisLocationRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public UpdateHrisLocationRequestBuilder request(UpdateHrisLocationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateHrisLocationResponse call() throws Exception {
        
        RequestOperation<UpdateHrisLocationRequest, UpdateHrisLocationResponse> operation
              = new UpdateHrisLocationOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
