/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.UpdateAccountingOrderOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class UpdateAccountingOrderRequestBuilder {

    private UpdateAccountingOrderRequest request;
    private final SDKConfiguration sdkConfiguration;

    public UpdateAccountingOrderRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public UpdateAccountingOrderRequestBuilder request(UpdateAccountingOrderRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateAccountingOrderResponse call() throws Exception {
        
        RequestOperation<UpdateAccountingOrderRequest, UpdateAccountingOrderResponse> operation
              = new UpdateAccountingOrderOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
