/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.ListAccountingSalesordersOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class ListAccountingSalesordersRequestBuilder {

    private ListAccountingSalesordersRequest request;
    private final SDKConfiguration sdkConfiguration;

    public ListAccountingSalesordersRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public ListAccountingSalesordersRequestBuilder request(ListAccountingSalesordersRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListAccountingSalesordersResponse call() throws Exception {
        
        RequestOperation<ListAccountingSalesordersRequest, ListAccountingSalesordersResponse> operation
              = new ListAccountingSalesordersOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
