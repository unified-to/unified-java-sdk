/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.RemoveTicketingNoteOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class RemoveTicketingNoteRequestBuilder {

    private RemoveTicketingNoteRequest request;
    private final SDKConfiguration sdkConfiguration;

    public RemoveTicketingNoteRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public RemoveTicketingNoteRequestBuilder request(RemoveTicketingNoteRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveTicketingNoteResponse call() throws Exception {
        
        RequestOperation<RemoveTicketingNoteRequest, RemoveTicketingNoteResponse> operation
              = new RemoveTicketingNoteOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
