/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.CreateHrisTimeshiftOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class CreateHrisTimeshiftRequestBuilder {

    private CreateHrisTimeshiftRequest request;
    private final SDKConfiguration sdkConfiguration;

    public CreateHrisTimeshiftRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public CreateHrisTimeshiftRequestBuilder request(CreateHrisTimeshiftRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateHrisTimeshiftResponse call() throws Exception {
        
        RequestOperation<CreateHrisTimeshiftRequest, CreateHrisTimeshiftResponse> operation
              = new CreateHrisTimeshiftOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
