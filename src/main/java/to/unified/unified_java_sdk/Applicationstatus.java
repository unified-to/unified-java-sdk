/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.models.operations.ListAtsApplicationstatusesRequest;
import to.unified.unified_java_sdk.models.operations.ListAtsApplicationstatusesRequestBuilder;
import to.unified.unified_java_sdk.models.operations.ListAtsApplicationstatusesResponse;
import to.unified.unified_java_sdk.operations.ListAtsApplicationstatusesOperation;


public class Applicationstatus {
    private final SDKConfiguration sdkConfiguration;

    Applicationstatus(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * List all applicationstatuses
     * 
     * @return The call builder
     */
    public ListAtsApplicationstatusesRequestBuilder listAtsApplicationstatuses() {
        return new ListAtsApplicationstatusesRequestBuilder(sdkConfiguration);
    }

    /**
     * List all applicationstatuses
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListAtsApplicationstatusesResponse listAtsApplicationstatuses(ListAtsApplicationstatusesRequest request) throws Exception {
        RequestOperation<ListAtsApplicationstatusesRequest, ListAtsApplicationstatusesResponse> operation
              = new ListAtsApplicationstatusesOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

}
