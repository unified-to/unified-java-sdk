/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.GetCommerceLocationOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class GetCommerceLocationRequestBuilder {

    private GetCommerceLocationRequest request;
    private final SDKConfiguration sdkConfiguration;

    public GetCommerceLocationRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public GetCommerceLocationRequestBuilder request(GetCommerceLocationRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetCommerceLocationResponse call() throws Exception {
        
        RequestOperation<GetCommerceLocationRequest, GetCommerceLocationResponse> operation
              = new GetCommerceLocationOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
