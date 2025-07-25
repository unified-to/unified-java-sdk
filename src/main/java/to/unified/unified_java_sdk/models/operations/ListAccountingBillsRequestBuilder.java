/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.ListAccountingBillsOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class ListAccountingBillsRequestBuilder {

    private ListAccountingBillsRequest request;
    private final SDKConfiguration sdkConfiguration;

    public ListAccountingBillsRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public ListAccountingBillsRequestBuilder request(ListAccountingBillsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListAccountingBillsResponse call() throws Exception {
        
        RequestOperation<ListAccountingBillsRequest, ListAccountingBillsResponse> operation
              = new ListAccountingBillsOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
