/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.CreateCrmDealOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class CreateCrmDealRequestBuilder {

    private CreateCrmDealRequest request;
    private final SDKConfiguration sdkConfiguration;

    public CreateCrmDealRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public CreateCrmDealRequestBuilder request(CreateCrmDealRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateCrmDealResponse call() throws Exception {
        
        RequestOperation<CreateCrmDealRequest, CreateCrmDealResponse> operation
              = new CreateCrmDealOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
