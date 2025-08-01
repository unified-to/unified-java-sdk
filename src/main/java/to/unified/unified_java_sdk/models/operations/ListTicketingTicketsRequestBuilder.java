/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.ListTicketingTicketsOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class ListTicketingTicketsRequestBuilder {

    private ListTicketingTicketsRequest request;
    private final SDKConfiguration sdkConfiguration;

    public ListTicketingTicketsRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public ListTicketingTicketsRequestBuilder request(ListTicketingTicketsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListTicketingTicketsResponse call() throws Exception {
        
        RequestOperation<ListTicketingTicketsRequest, ListTicketingTicketsResponse> operation
              = new ListTicketingTicketsOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
