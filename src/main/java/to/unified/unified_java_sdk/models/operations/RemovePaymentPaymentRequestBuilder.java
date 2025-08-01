/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.RemovePaymentPaymentOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class RemovePaymentPaymentRequestBuilder {

    private RemovePaymentPaymentRequest request;
    private final SDKConfiguration sdkConfiguration;

    public RemovePaymentPaymentRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public RemovePaymentPaymentRequestBuilder request(RemovePaymentPaymentRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemovePaymentPaymentResponse call() throws Exception {
        
        RequestOperation<RemovePaymentPaymentRequest, RemovePaymentPaymentResponse> operation
              = new RemovePaymentPaymentOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
