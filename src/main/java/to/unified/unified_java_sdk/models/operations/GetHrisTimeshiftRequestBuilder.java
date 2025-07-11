/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.GetHrisTimeshiftOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class GetHrisTimeshiftRequestBuilder {

    private GetHrisTimeshiftRequest request;
    private final SDKConfiguration sdkConfiguration;

    public GetHrisTimeshiftRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public GetHrisTimeshiftRequestBuilder request(GetHrisTimeshiftRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetHrisTimeshiftResponse call() throws Exception {
        
        RequestOperation<GetHrisTimeshiftRequest, GetHrisTimeshiftResponse> operation
              = new GetHrisTimeshiftOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
