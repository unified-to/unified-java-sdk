/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.models.operations.GetPaymentPayoutRequest;
import to.unified.unified_java_sdk.models.operations.GetPaymentPayoutRequestBuilder;
import to.unified.unified_java_sdk.models.operations.GetPaymentPayoutResponse;
import to.unified.unified_java_sdk.models.operations.ListPaymentPayoutsRequest;
import to.unified.unified_java_sdk.models.operations.ListPaymentPayoutsRequestBuilder;
import to.unified.unified_java_sdk.models.operations.ListPaymentPayoutsResponse;
import to.unified.unified_java_sdk.operations.GetPaymentPayoutOperation;
import to.unified.unified_java_sdk.operations.ListPaymentPayoutsOperation;


public class Payout {
    private final SDKConfiguration sdkConfiguration;

    Payout(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Retrieve a payout
     * 
     * @return The call builder
     */
    public GetPaymentPayoutRequestBuilder getPaymentPayout() {
        return new GetPaymentPayoutRequestBuilder(sdkConfiguration);
    }

    /**
     * Retrieve a payout
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetPaymentPayoutResponse getPaymentPayout(GetPaymentPayoutRequest request) throws Exception {
        RequestOperation<GetPaymentPayoutRequest, GetPaymentPayoutResponse> operation
              = new GetPaymentPayoutOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * List all payouts
     * 
     * @return The call builder
     */
    public ListPaymentPayoutsRequestBuilder listPaymentPayouts() {
        return new ListPaymentPayoutsRequestBuilder(sdkConfiguration);
    }

    /**
     * List all payouts
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListPaymentPayoutsResponse listPaymentPayouts(ListPaymentPayoutsRequest request) throws Exception {
        RequestOperation<ListPaymentPayoutsRequest, ListPaymentPayoutsResponse> operation
              = new ListPaymentPayoutsOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

}
