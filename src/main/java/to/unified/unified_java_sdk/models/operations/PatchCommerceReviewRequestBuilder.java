/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.PatchCommerceReviewOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class PatchCommerceReviewRequestBuilder {

    private PatchCommerceReviewRequest request;
    private final SDKConfiguration sdkConfiguration;

    public PatchCommerceReviewRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public PatchCommerceReviewRequestBuilder request(PatchCommerceReviewRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public PatchCommerceReviewResponse call() throws Exception {
        
        RequestOperation<PatchCommerceReviewRequest, PatchCommerceReviewResponse> operation
              = new PatchCommerceReviewOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
