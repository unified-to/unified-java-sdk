/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.ListTicketingCustomersOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class ListTicketingCustomersRequestBuilder {

    private ListTicketingCustomersRequest request;
    private final SDKConfiguration sdkConfiguration;

    public ListTicketingCustomersRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public ListTicketingCustomersRequestBuilder request(ListTicketingCustomersRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListTicketingCustomersResponse call() throws Exception {
        
        RequestOperation<ListTicketingCustomersRequest, ListTicketingCustomersResponse> operation
              = new ListTicketingCustomersOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
