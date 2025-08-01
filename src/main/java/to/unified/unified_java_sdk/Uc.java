/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.models.operations.CreateUcCommentRequest;
import to.unified.unified_java_sdk.models.operations.CreateUcCommentRequestBuilder;
import to.unified.unified_java_sdk.models.operations.CreateUcCommentResponse;
import to.unified.unified_java_sdk.models.operations.CreateUcContactRequest;
import to.unified.unified_java_sdk.models.operations.CreateUcContactRequestBuilder;
import to.unified.unified_java_sdk.models.operations.CreateUcContactResponse;
import to.unified.unified_java_sdk.models.operations.CreateUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.CreateUcRecordingRequestBuilder;
import to.unified.unified_java_sdk.models.operations.CreateUcRecordingResponse;
import to.unified.unified_java_sdk.models.operations.GetUcCommentRequest;
import to.unified.unified_java_sdk.models.operations.GetUcCommentRequestBuilder;
import to.unified.unified_java_sdk.models.operations.GetUcCommentResponse;
import to.unified.unified_java_sdk.models.operations.GetUcContactRequest;
import to.unified.unified_java_sdk.models.operations.GetUcContactRequestBuilder;
import to.unified.unified_java_sdk.models.operations.GetUcContactResponse;
import to.unified.unified_java_sdk.models.operations.GetUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.GetUcRecordingRequestBuilder;
import to.unified.unified_java_sdk.models.operations.GetUcRecordingResponse;
import to.unified.unified_java_sdk.models.operations.ListUcCallsRequest;
import to.unified.unified_java_sdk.models.operations.ListUcCallsRequestBuilder;
import to.unified.unified_java_sdk.models.operations.ListUcCallsResponse;
import to.unified.unified_java_sdk.models.operations.ListUcCommentsRequest;
import to.unified.unified_java_sdk.models.operations.ListUcCommentsRequestBuilder;
import to.unified.unified_java_sdk.models.operations.ListUcCommentsResponse;
import to.unified.unified_java_sdk.models.operations.ListUcContactsRequest;
import to.unified.unified_java_sdk.models.operations.ListUcContactsRequestBuilder;
import to.unified.unified_java_sdk.models.operations.ListUcContactsResponse;
import to.unified.unified_java_sdk.models.operations.ListUcRecordingsRequest;
import to.unified.unified_java_sdk.models.operations.ListUcRecordingsRequestBuilder;
import to.unified.unified_java_sdk.models.operations.ListUcRecordingsResponse;
import to.unified.unified_java_sdk.models.operations.PatchUcCommentRequest;
import to.unified.unified_java_sdk.models.operations.PatchUcCommentRequestBuilder;
import to.unified.unified_java_sdk.models.operations.PatchUcCommentResponse;
import to.unified.unified_java_sdk.models.operations.PatchUcContactRequest;
import to.unified.unified_java_sdk.models.operations.PatchUcContactRequestBuilder;
import to.unified.unified_java_sdk.models.operations.PatchUcContactResponse;
import to.unified.unified_java_sdk.models.operations.PatchUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.PatchUcRecordingRequestBuilder;
import to.unified.unified_java_sdk.models.operations.PatchUcRecordingResponse;
import to.unified.unified_java_sdk.models.operations.RemoveUcCommentRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUcCommentRequestBuilder;
import to.unified.unified_java_sdk.models.operations.RemoveUcCommentResponse;
import to.unified.unified_java_sdk.models.operations.RemoveUcContactRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUcContactRequestBuilder;
import to.unified.unified_java_sdk.models.operations.RemoveUcContactResponse;
import to.unified.unified_java_sdk.models.operations.RemoveUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.RemoveUcRecordingRequestBuilder;
import to.unified.unified_java_sdk.models.operations.RemoveUcRecordingResponse;
import to.unified.unified_java_sdk.models.operations.UpdateUcCommentRequest;
import to.unified.unified_java_sdk.models.operations.UpdateUcCommentRequestBuilder;
import to.unified.unified_java_sdk.models.operations.UpdateUcCommentResponse;
import to.unified.unified_java_sdk.models.operations.UpdateUcContactRequest;
import to.unified.unified_java_sdk.models.operations.UpdateUcContactRequestBuilder;
import to.unified.unified_java_sdk.models.operations.UpdateUcContactResponse;
import to.unified.unified_java_sdk.models.operations.UpdateUcRecordingRequest;
import to.unified.unified_java_sdk.models.operations.UpdateUcRecordingRequestBuilder;
import to.unified.unified_java_sdk.models.operations.UpdateUcRecordingResponse;
import to.unified.unified_java_sdk.operations.CreateUcCommentOperation;
import to.unified.unified_java_sdk.operations.CreateUcContactOperation;
import to.unified.unified_java_sdk.operations.CreateUcRecordingOperation;
import to.unified.unified_java_sdk.operations.GetUcCommentOperation;
import to.unified.unified_java_sdk.operations.GetUcContactOperation;
import to.unified.unified_java_sdk.operations.GetUcRecordingOperation;
import to.unified.unified_java_sdk.operations.ListUcCallsOperation;
import to.unified.unified_java_sdk.operations.ListUcCommentsOperation;
import to.unified.unified_java_sdk.operations.ListUcContactsOperation;
import to.unified.unified_java_sdk.operations.ListUcRecordingsOperation;
import to.unified.unified_java_sdk.operations.PatchUcCommentOperation;
import to.unified.unified_java_sdk.operations.PatchUcContactOperation;
import to.unified.unified_java_sdk.operations.PatchUcRecordingOperation;
import to.unified.unified_java_sdk.operations.RemoveUcCommentOperation;
import to.unified.unified_java_sdk.operations.RemoveUcContactOperation;
import to.unified.unified_java_sdk.operations.RemoveUcRecordingOperation;
import to.unified.unified_java_sdk.operations.UpdateUcCommentOperation;
import to.unified.unified_java_sdk.operations.UpdateUcContactOperation;
import to.unified.unified_java_sdk.operations.UpdateUcRecordingOperation;


public class Uc {
    private final SDKConfiguration sdkConfiguration;

    Uc(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Create a comment
     * 
     * @return The call builder
     */
    public CreateUcCommentRequestBuilder createUcComment() {
        return new CreateUcCommentRequestBuilder(sdkConfiguration);
    }

    /**
     * Create a comment
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateUcCommentResponse createUcComment(CreateUcCommentRequest request) throws Exception {
        RequestOperation<CreateUcCommentRequest, CreateUcCommentResponse> operation
              = new CreateUcCommentOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Create a contact
     * 
     * @return The call builder
     */
    public CreateUcContactRequestBuilder createUcContact() {
        return new CreateUcContactRequestBuilder(sdkConfiguration);
    }

    /**
     * Create a contact
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateUcContactResponse createUcContact(CreateUcContactRequest request) throws Exception {
        RequestOperation<CreateUcContactRequest, CreateUcContactResponse> operation
              = new CreateUcContactOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Create a recording
     * 
     * @return The call builder
     */
    public CreateUcRecordingRequestBuilder createUcRecording() {
        return new CreateUcRecordingRequestBuilder(sdkConfiguration);
    }

    /**
     * Create a recording
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateUcRecordingResponse createUcRecording(CreateUcRecordingRequest request) throws Exception {
        RequestOperation<CreateUcRecordingRequest, CreateUcRecordingResponse> operation
              = new CreateUcRecordingOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Retrieve a comment
     * 
     * @return The call builder
     */
    public GetUcCommentRequestBuilder getUcComment() {
        return new GetUcCommentRequestBuilder(sdkConfiguration);
    }

    /**
     * Retrieve a comment
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetUcCommentResponse getUcComment(GetUcCommentRequest request) throws Exception {
        RequestOperation<GetUcCommentRequest, GetUcCommentResponse> operation
              = new GetUcCommentOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Retrieve a contact
     * 
     * @return The call builder
     */
    public GetUcContactRequestBuilder getUcContact() {
        return new GetUcContactRequestBuilder(sdkConfiguration);
    }

    /**
     * Retrieve a contact
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetUcContactResponse getUcContact(GetUcContactRequest request) throws Exception {
        RequestOperation<GetUcContactRequest, GetUcContactResponse> operation
              = new GetUcContactOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Retrieve a recording
     * 
     * @return The call builder
     */
    public GetUcRecordingRequestBuilder getUcRecording() {
        return new GetUcRecordingRequestBuilder(sdkConfiguration);
    }

    /**
     * Retrieve a recording
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetUcRecordingResponse getUcRecording(GetUcRecordingRequest request) throws Exception {
        RequestOperation<GetUcRecordingRequest, GetUcRecordingResponse> operation
              = new GetUcRecordingOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * List all calls
     * 
     * @return The call builder
     */
    public ListUcCallsRequestBuilder listUcCalls() {
        return new ListUcCallsRequestBuilder(sdkConfiguration);
    }

    /**
     * List all calls
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListUcCallsResponse listUcCalls(ListUcCallsRequest request) throws Exception {
        RequestOperation<ListUcCallsRequest, ListUcCallsResponse> operation
              = new ListUcCallsOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * List all comments
     * 
     * @return The call builder
     */
    public ListUcCommentsRequestBuilder listUcComments() {
        return new ListUcCommentsRequestBuilder(sdkConfiguration);
    }

    /**
     * List all comments
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListUcCommentsResponse listUcComments(ListUcCommentsRequest request) throws Exception {
        RequestOperation<ListUcCommentsRequest, ListUcCommentsResponse> operation
              = new ListUcCommentsOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * List all contacts
     * 
     * @return The call builder
     */
    public ListUcContactsRequestBuilder listUcContacts() {
        return new ListUcContactsRequestBuilder(sdkConfiguration);
    }

    /**
     * List all contacts
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListUcContactsResponse listUcContacts(ListUcContactsRequest request) throws Exception {
        RequestOperation<ListUcContactsRequest, ListUcContactsResponse> operation
              = new ListUcContactsOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * List all recordings
     * 
     * @return The call builder
     */
    public ListUcRecordingsRequestBuilder listUcRecordings() {
        return new ListUcRecordingsRequestBuilder(sdkConfiguration);
    }

    /**
     * List all recordings
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListUcRecordingsResponse listUcRecordings(ListUcRecordingsRequest request) throws Exception {
        RequestOperation<ListUcRecordingsRequest, ListUcRecordingsResponse> operation
              = new ListUcRecordingsOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update a comment
     * 
     * @return The call builder
     */
    public PatchUcCommentRequestBuilder patchUcComment() {
        return new PatchUcCommentRequestBuilder(sdkConfiguration);
    }

    /**
     * Update a comment
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PatchUcCommentResponse patchUcComment(PatchUcCommentRequest request) throws Exception {
        RequestOperation<PatchUcCommentRequest, PatchUcCommentResponse> operation
              = new PatchUcCommentOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update a contact
     * 
     * @return The call builder
     */
    public PatchUcContactRequestBuilder patchUcContact() {
        return new PatchUcContactRequestBuilder(sdkConfiguration);
    }

    /**
     * Update a contact
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PatchUcContactResponse patchUcContact(PatchUcContactRequest request) throws Exception {
        RequestOperation<PatchUcContactRequest, PatchUcContactResponse> operation
              = new PatchUcContactOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update a recording
     * 
     * @return The call builder
     */
    public PatchUcRecordingRequestBuilder patchUcRecording() {
        return new PatchUcRecordingRequestBuilder(sdkConfiguration);
    }

    /**
     * Update a recording
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PatchUcRecordingResponse patchUcRecording(PatchUcRecordingRequest request) throws Exception {
        RequestOperation<PatchUcRecordingRequest, PatchUcRecordingResponse> operation
              = new PatchUcRecordingOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Remove a comment
     * 
     * @return The call builder
     */
    public RemoveUcCommentRequestBuilder removeUcComment() {
        return new RemoveUcCommentRequestBuilder(sdkConfiguration);
    }

    /**
     * Remove a comment
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public RemoveUcCommentResponse removeUcComment(RemoveUcCommentRequest request) throws Exception {
        RequestOperation<RemoveUcCommentRequest, RemoveUcCommentResponse> operation
              = new RemoveUcCommentOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Remove a contact
     * 
     * @return The call builder
     */
    public RemoveUcContactRequestBuilder removeUcContact() {
        return new RemoveUcContactRequestBuilder(sdkConfiguration);
    }

    /**
     * Remove a contact
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public RemoveUcContactResponse removeUcContact(RemoveUcContactRequest request) throws Exception {
        RequestOperation<RemoveUcContactRequest, RemoveUcContactResponse> operation
              = new RemoveUcContactOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Remove a recording
     * 
     * @return The call builder
     */
    public RemoveUcRecordingRequestBuilder removeUcRecording() {
        return new RemoveUcRecordingRequestBuilder(sdkConfiguration);
    }

    /**
     * Remove a recording
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public RemoveUcRecordingResponse removeUcRecording(RemoveUcRecordingRequest request) throws Exception {
        RequestOperation<RemoveUcRecordingRequest, RemoveUcRecordingResponse> operation
              = new RemoveUcRecordingOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update a comment
     * 
     * @return The call builder
     */
    public UpdateUcCommentRequestBuilder updateUcComment() {
        return new UpdateUcCommentRequestBuilder(sdkConfiguration);
    }

    /**
     * Update a comment
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateUcCommentResponse updateUcComment(UpdateUcCommentRequest request) throws Exception {
        RequestOperation<UpdateUcCommentRequest, UpdateUcCommentResponse> operation
              = new UpdateUcCommentOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update a contact
     * 
     * @return The call builder
     */
    public UpdateUcContactRequestBuilder updateUcContact() {
        return new UpdateUcContactRequestBuilder(sdkConfiguration);
    }

    /**
     * Update a contact
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateUcContactResponse updateUcContact(UpdateUcContactRequest request) throws Exception {
        RequestOperation<UpdateUcContactRequest, UpdateUcContactResponse> operation
              = new UpdateUcContactOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update a recording
     * 
     * @return The call builder
     */
    public UpdateUcRecordingRequestBuilder updateUcRecording() {
        return new UpdateUcRecordingRequestBuilder(sdkConfiguration);
    }

    /**
     * Update a recording
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateUcRecordingResponse updateUcRecording(UpdateUcRecordingRequest request) throws Exception {
        RequestOperation<UpdateUcRecordingRequest, UpdateUcRecordingResponse> operation
              = new UpdateUcRecordingOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

}
