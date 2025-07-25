/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.GetMetadataMetadataOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class GetMetadataMetadataRequestBuilder {

    private GetMetadataMetadataRequest request;
    private final SDKConfiguration sdkConfiguration;

    public GetMetadataMetadataRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public GetMetadataMetadataRequestBuilder request(GetMetadataMetadataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetMetadataMetadataResponse call() throws Exception {
        
        RequestOperation<GetMetadataMetadataRequest, GetMetadataMetadataResponse> operation
              = new GetMetadataMetadataOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
