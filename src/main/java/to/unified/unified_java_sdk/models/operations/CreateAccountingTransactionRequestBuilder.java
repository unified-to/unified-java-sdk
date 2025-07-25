/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.CreateAccountingTransactionOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class CreateAccountingTransactionRequestBuilder {

    private CreateAccountingTransactionRequest request;
    private final SDKConfiguration sdkConfiguration;

    public CreateAccountingTransactionRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public CreateAccountingTransactionRequestBuilder request(CreateAccountingTransactionRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateAccountingTransactionResponse call() throws Exception {
        
        RequestOperation<CreateAccountingTransactionRequest, CreateAccountingTransactionResponse> operation
              = new CreateAccountingTransactionOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
