/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.UpdateLmsCourseOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class UpdateLmsCourseRequestBuilder {

    private UpdateLmsCourseRequest request;
    private final SDKConfiguration sdkConfiguration;

    public UpdateLmsCourseRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public UpdateLmsCourseRequestBuilder request(UpdateLmsCourseRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateLmsCourseResponse call() throws Exception {
        
        RequestOperation<UpdateLmsCourseRequest, UpdateLmsCourseResponse> operation
              = new UpdateLmsCourseOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
