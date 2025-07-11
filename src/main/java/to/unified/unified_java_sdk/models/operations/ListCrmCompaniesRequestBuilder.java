/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.ListCrmCompaniesOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class ListCrmCompaniesRequestBuilder {

    private ListCrmCompaniesRequest request;
    private final SDKConfiguration sdkConfiguration;

    public ListCrmCompaniesRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public ListCrmCompaniesRequestBuilder request(ListCrmCompaniesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListCrmCompaniesResponse call() throws Exception {
        
        RequestOperation<ListCrmCompaniesRequest, ListCrmCompaniesResponse> operation
              = new ListCrmCompaniesOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
