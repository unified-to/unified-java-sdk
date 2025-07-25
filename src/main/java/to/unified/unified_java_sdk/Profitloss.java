/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.models.operations.GetAccountingProfitlossRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingProfitlossRequestBuilder;
import to.unified.unified_java_sdk.models.operations.GetAccountingProfitlossResponse;
import to.unified.unified_java_sdk.models.operations.ListAccountingProfitlossesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingProfitlossesRequestBuilder;
import to.unified.unified_java_sdk.models.operations.ListAccountingProfitlossesResponse;
import to.unified.unified_java_sdk.operations.GetAccountingProfitlossOperation;
import to.unified.unified_java_sdk.operations.ListAccountingProfitlossesOperation;


public class Profitloss {
    private final SDKConfiguration sdkConfiguration;

    Profitloss(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Retrieve a profitloss
     * 
     * @return The call builder
     */
    public GetAccountingProfitlossRequestBuilder getAccountingProfitloss() {
        return new GetAccountingProfitlossRequestBuilder(sdkConfiguration);
    }

    /**
     * Retrieve a profitloss
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetAccountingProfitlossResponse getAccountingProfitloss(GetAccountingProfitlossRequest request) throws Exception {
        RequestOperation<GetAccountingProfitlossRequest, GetAccountingProfitlossResponse> operation
              = new GetAccountingProfitlossOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * List all profitlosses
     * 
     * @return The call builder
     */
    public ListAccountingProfitlossesRequestBuilder listAccountingProfitlosses() {
        return new ListAccountingProfitlossesRequestBuilder(sdkConfiguration);
    }

    /**
     * List all profitlosses
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListAccountingProfitlossesResponse listAccountingProfitlosses(ListAccountingProfitlossesRequest request) throws Exception {
        RequestOperation<ListAccountingProfitlossesRequest, ListAccountingProfitlossesResponse> operation
              = new ListAccountingProfitlossesOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

}
