/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.GetAccountingTaxrateOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class GetAccountingTaxrateRequestBuilder {

    private GetAccountingTaxrateRequest request;
    private final SDKConfiguration sdkConfiguration;

    public GetAccountingTaxrateRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public GetAccountingTaxrateRequestBuilder request(GetAccountingTaxrateRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAccountingTaxrateResponse call() throws Exception {
        
        RequestOperation<GetAccountingTaxrateRequest, GetAccountingTaxrateResponse> operation
              = new GetAccountingTaxrateOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
