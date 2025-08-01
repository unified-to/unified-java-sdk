/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.GetAccountingCategoryOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class GetAccountingCategoryRequestBuilder {

    private GetAccountingCategoryRequest request;
    private final SDKConfiguration sdkConfiguration;

    public GetAccountingCategoryRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public GetAccountingCategoryRequestBuilder request(GetAccountingCategoryRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAccountingCategoryResponse call() throws Exception {
        
        RequestOperation<GetAccountingCategoryRequest, GetAccountingCategoryResponse> operation
              = new GetAccountingCategoryOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
