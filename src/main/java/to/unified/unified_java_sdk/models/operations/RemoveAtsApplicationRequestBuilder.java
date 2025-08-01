/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.RemoveAtsApplicationOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class RemoveAtsApplicationRequestBuilder {

    private RemoveAtsApplicationRequest request;
    private final SDKConfiguration sdkConfiguration;

    public RemoveAtsApplicationRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public RemoveAtsApplicationRequestBuilder request(RemoveAtsApplicationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveAtsApplicationResponse call() throws Exception {
        
        RequestOperation<RemoveAtsApplicationRequest, RemoveAtsApplicationResponse> operation
              = new RemoveAtsApplicationOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
