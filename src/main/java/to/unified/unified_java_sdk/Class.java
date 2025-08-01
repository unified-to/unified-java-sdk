/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.models.operations.CreateLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.CreateLmsClassRequestBuilder;
import to.unified.unified_java_sdk.models.operations.CreateLmsClassResponse;
import to.unified.unified_java_sdk.models.operations.GetLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.GetLmsClassRequestBuilder;
import to.unified.unified_java_sdk.models.operations.GetLmsClassResponse;
import to.unified.unified_java_sdk.models.operations.ListLmsClassesRequest;
import to.unified.unified_java_sdk.models.operations.ListLmsClassesRequestBuilder;
import to.unified.unified_java_sdk.models.operations.ListLmsClassesResponse;
import to.unified.unified_java_sdk.models.operations.PatchLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.PatchLmsClassRequestBuilder;
import to.unified.unified_java_sdk.models.operations.PatchLmsClassResponse;
import to.unified.unified_java_sdk.models.operations.RemoveLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.RemoveLmsClassRequestBuilder;
import to.unified.unified_java_sdk.models.operations.RemoveLmsClassResponse;
import to.unified.unified_java_sdk.models.operations.UpdateLmsClassRequest;
import to.unified.unified_java_sdk.models.operations.UpdateLmsClassRequestBuilder;
import to.unified.unified_java_sdk.models.operations.UpdateLmsClassResponse;
import to.unified.unified_java_sdk.operations.CreateLmsClassOperation;
import to.unified.unified_java_sdk.operations.GetLmsClassOperation;
import to.unified.unified_java_sdk.operations.ListLmsClassesOperation;
import to.unified.unified_java_sdk.operations.PatchLmsClassOperation;
import to.unified.unified_java_sdk.operations.RemoveLmsClassOperation;
import to.unified.unified_java_sdk.operations.UpdateLmsClassOperation;


public class Class {
    private final SDKConfiguration sdkConfiguration;

    Class(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Create a class
     * 
     * @return The call builder
     */
    public CreateLmsClassRequestBuilder createLmsClass() {
        return new CreateLmsClassRequestBuilder(sdkConfiguration);
    }

    /**
     * Create a class
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateLmsClassResponse createLmsClass(CreateLmsClassRequest request) throws Exception {
        RequestOperation<CreateLmsClassRequest, CreateLmsClassResponse> operation
              = new CreateLmsClassOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Retrieve a class
     * 
     * @return The call builder
     */
    public GetLmsClassRequestBuilder getLmsClass() {
        return new GetLmsClassRequestBuilder(sdkConfiguration);
    }

    /**
     * Retrieve a class
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetLmsClassResponse getLmsClass(GetLmsClassRequest request) throws Exception {
        RequestOperation<GetLmsClassRequest, GetLmsClassResponse> operation
              = new GetLmsClassOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * List all classes
     * 
     * @return The call builder
     */
    public ListLmsClassesRequestBuilder listLmsClasses() {
        return new ListLmsClassesRequestBuilder(sdkConfiguration);
    }

    /**
     * List all classes
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListLmsClassesResponse listLmsClasses(ListLmsClassesRequest request) throws Exception {
        RequestOperation<ListLmsClassesRequest, ListLmsClassesResponse> operation
              = new ListLmsClassesOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update a class
     * 
     * @return The call builder
     */
    public PatchLmsClassRequestBuilder patchLmsClass() {
        return new PatchLmsClassRequestBuilder(sdkConfiguration);
    }

    /**
     * Update a class
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PatchLmsClassResponse patchLmsClass(PatchLmsClassRequest request) throws Exception {
        RequestOperation<PatchLmsClassRequest, PatchLmsClassResponse> operation
              = new PatchLmsClassOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Remove a class
     * 
     * @return The call builder
     */
    public RemoveLmsClassRequestBuilder removeLmsClass() {
        return new RemoveLmsClassRequestBuilder(sdkConfiguration);
    }

    /**
     * Remove a class
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public RemoveLmsClassResponse removeLmsClass(RemoveLmsClassRequest request) throws Exception {
        RequestOperation<RemoveLmsClassRequest, RemoveLmsClassResponse> operation
              = new RemoveLmsClassOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

    /**
     * Update a class
     * 
     * @return The call builder
     */
    public UpdateLmsClassRequestBuilder updateLmsClass() {
        return new UpdateLmsClassRequestBuilder(sdkConfiguration);
    }

    /**
     * Update a class
     * 
     * @param request The request object containing all the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateLmsClassResponse updateLmsClass(UpdateLmsClassRequest request) throws Exception {
        RequestOperation<UpdateLmsClassRequest, UpdateLmsClassResponse> operation
              = new UpdateLmsClassOperation(sdkConfiguration);
        return operation.handleResponse(operation.doRequest(request));
    }

}
