/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.models.operations.CreateAccountingInvoiceRequest;
import to.unified.unified_java_sdk.models.operations.CreateAccountingInvoiceRequestBuilder;
import to.unified.unified_java_sdk.models.operations.CreateAccountingInvoiceResponse;
import to.unified.unified_java_sdk.models.operations.GetAccountingInvoiceRequest;
import to.unified.unified_java_sdk.models.operations.GetAccountingInvoiceRequestBuilder;
import to.unified.unified_java_sdk.models.operations.GetAccountingInvoiceResponse;
import to.unified.unified_java_sdk.models.operations.ListAccountingInvoicesRequest;
import to.unified.unified_java_sdk.models.operations.ListAccountingInvoicesRequestBuilder;
import to.unified.unified_java_sdk.models.operations.ListAccountingInvoicesResponse;
import to.unified.unified_java_sdk.models.operations.PatchAccountingInvoiceRequest;
import to.unified.unified_java_sdk.models.operations.PatchAccountingInvoiceRequestBuilder;
import to.unified.unified_java_sdk.models.operations.PatchAccountingInvoiceResponse;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingInvoiceRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingInvoiceRequestBuilder;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingInvoiceResponse;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingInvoiceRequest;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingInvoiceRequestBuilder;
import to.unified.unified_java_sdk.models.operations.UpdateAccountingInvoiceResponse;
import to.unified.unified_java_sdk.operations.CreateAccountingInvoiceOperation;
import to.unified.unified_java_sdk.operations.GetAccountingInvoiceOperation;
import to.unified.unified_java_sdk.operations.ListAccountingInvoicesOperation;
import to.unified.unified_java_sdk.operations.PatchAccountingInvoiceOperation;
import to.unified.unified_java_sdk.operations.RemoveAccountingInvoiceOperation;
import to.unified.unified_java_sdk.operations.UpdateAccountingInvoiceOperation;


public class Invoice {
    private final SDKConfiguration sdkConfiguration;

    Invoice(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Create an invoice
     * 
     * @return The call builder
     */
    public CreateAccountingInvoiceRequestBuilder createAccountingInvoice() {
        return new CreateAccountingInvoiceRequestBuilder(sdkConfiguration);
    }

    /**
     * Create an invoice
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateAccountingInvoiceResponse createAccountingInvoice(CreateAccountingInvoiceRequest request) throws Exception {
        RequestOperation<CreateAccountingInvoiceRequest, CreateAccountingInvoiceResponse> operation
              = new CreateAccountingInvoiceOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Retrieve an invoice
     * 
     * @return The call builder
     */
    public GetAccountingInvoiceRequestBuilder getAccountingInvoice() {
        return new GetAccountingInvoiceRequestBuilder(sdkConfiguration);
    }

    /**
     * Retrieve an invoice
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetAccountingInvoiceResponse getAccountingInvoice(GetAccountingInvoiceRequest request) throws Exception {
        RequestOperation<GetAccountingInvoiceRequest, GetAccountingInvoiceResponse> operation
              = new GetAccountingInvoiceOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * List all invoices
     * 
     * @return The call builder
     */
    public ListAccountingInvoicesRequestBuilder listAccountingInvoices() {
        return new ListAccountingInvoicesRequestBuilder(sdkConfiguration);
    }

    /**
     * List all invoices
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListAccountingInvoicesResponse listAccountingInvoices(ListAccountingInvoicesRequest request) throws Exception {
        RequestOperation<ListAccountingInvoicesRequest, ListAccountingInvoicesResponse> operation
              = new ListAccountingInvoicesOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update an invoice
     * 
     * @return The call builder
     */
    public PatchAccountingInvoiceRequestBuilder patchAccountingInvoice() {
        return new PatchAccountingInvoiceRequestBuilder(sdkConfiguration);
    }

    /**
     * Update an invoice
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PatchAccountingInvoiceResponse patchAccountingInvoice(PatchAccountingInvoiceRequest request) throws Exception {
        RequestOperation<PatchAccountingInvoiceRequest, PatchAccountingInvoiceResponse> operation
              = new PatchAccountingInvoiceOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Remove an invoice
     * 
     * @return The call builder
     */
    public RemoveAccountingInvoiceRequestBuilder removeAccountingInvoice() {
        return new RemoveAccountingInvoiceRequestBuilder(sdkConfiguration);
    }

    /**
     * Remove an invoice
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public RemoveAccountingInvoiceResponse removeAccountingInvoice(RemoveAccountingInvoiceRequest request) throws Exception {
        RequestOperation<RemoveAccountingInvoiceRequest, RemoveAccountingInvoiceResponse> operation
              = new RemoveAccountingInvoiceOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update an invoice
     * 
     * @return The call builder
     */
    public UpdateAccountingInvoiceRequestBuilder updateAccountingInvoice() {
        return new UpdateAccountingInvoiceRequestBuilder(sdkConfiguration);
    }

    /**
     * Update an invoice
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateAccountingInvoiceResponse updateAccountingInvoice(UpdateAccountingInvoiceRequest request) throws Exception {
        RequestOperation<UpdateAccountingInvoiceRequest, UpdateAccountingInvoiceResponse> operation
              = new UpdateAccountingInvoiceOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

}
