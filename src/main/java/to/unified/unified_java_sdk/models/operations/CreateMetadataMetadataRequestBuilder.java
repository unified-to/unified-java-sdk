/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.CreateMetadataMetadataOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class CreateMetadataMetadataRequestBuilder {

    private CreateMetadataMetadataRequest request;
    private final SDKConfiguration sdkConfiguration;

    public CreateMetadataMetadataRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public CreateMetadataMetadataRequestBuilder request(CreateMetadataMetadataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateMetadataMetadataResponse call() throws Exception {
        
        RequestOperation<CreateMetadataMetadataRequest, CreateMetadataMetadataResponse> operation
              = new CreateMetadataMetadataOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
