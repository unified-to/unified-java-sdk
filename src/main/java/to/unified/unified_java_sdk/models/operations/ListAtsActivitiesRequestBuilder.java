/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.ListAtsActivitiesOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class ListAtsActivitiesRequestBuilder {

    private ListAtsActivitiesRequest request;
    private final SDKConfiguration sdkConfiguration;

    public ListAtsActivitiesRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public ListAtsActivitiesRequestBuilder request(ListAtsActivitiesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListAtsActivitiesResponse call() throws Exception {
        
        RequestOperation<ListAtsActivitiesRequest, ListAtsActivitiesResponse> operation
              = new ListAtsActivitiesOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
