/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.RemoveRepoPullrequestOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class RemoveRepoPullrequestRequestBuilder {

    private RemoveRepoPullrequestRequest request;
    private final SDKConfiguration sdkConfiguration;

    public RemoveRepoPullrequestRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public RemoveRepoPullrequestRequestBuilder request(RemoveRepoPullrequestRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveRepoPullrequestResponse call() throws Exception {
        
        RequestOperation<RemoveRepoPullrequestRequest, RemoveRepoPullrequestResponse> operation
              = new RemoveRepoPullrequestOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
