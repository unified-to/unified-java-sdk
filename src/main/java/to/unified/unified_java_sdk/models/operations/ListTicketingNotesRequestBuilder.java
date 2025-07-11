/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.ListTicketingNotesOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class ListTicketingNotesRequestBuilder {

    private ListTicketingNotesRequest request;
    private final SDKConfiguration sdkConfiguration;

    public ListTicketingNotesRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public ListTicketingNotesRequestBuilder request(ListTicketingNotesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListTicketingNotesResponse call() throws Exception {
        
        RequestOperation<ListTicketingNotesRequest, ListTicketingNotesResponse> operation
              = new ListTicketingNotesOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
