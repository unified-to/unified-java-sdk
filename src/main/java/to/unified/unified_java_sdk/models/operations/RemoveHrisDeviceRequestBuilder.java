/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.RemoveHrisDeviceOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class RemoveHrisDeviceRequestBuilder {

    private RemoveHrisDeviceRequest request;
    private final SDKConfiguration sdkConfiguration;

    public RemoveHrisDeviceRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public RemoveHrisDeviceRequestBuilder request(RemoveHrisDeviceRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveHrisDeviceResponse call() throws Exception {
        
        RequestOperation<RemoveHrisDeviceRequest, RemoveHrisDeviceResponse> operation
              = new RemoveHrisDeviceOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
