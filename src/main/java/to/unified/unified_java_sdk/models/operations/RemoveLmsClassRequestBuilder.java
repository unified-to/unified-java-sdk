/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.RemoveLmsClassOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class RemoveLmsClassRequestBuilder {

    private RemoveLmsClassRequest request;
    private final SDKConfiguration sdkConfiguration;

    public RemoveLmsClassRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public RemoveLmsClassRequestBuilder request(RemoveLmsClassRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveLmsClassResponse call() throws Exception {
        
        RequestOperation<RemoveLmsClassRequest, RemoveLmsClassResponse> operation
              = new RemoveLmsClassOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
