/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.models.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.lang.Exception;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.operations.GetMessagingChannelOperation;
import to.unified.unified_java_sdk.utils.Utils;

public class GetMessagingChannelRequestBuilder {

    private GetMessagingChannelRequest request;
    private final SDKConfiguration sdkConfiguration;

    public GetMessagingChannelRequestBuilder(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    public GetMessagingChannelRequestBuilder request(GetMessagingChannelRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetMessagingChannelResponse call() throws Exception {
        
        RequestOperation<GetMessagingChannelRequest, GetMessagingChannelResponse> operation
              = new GetMessagingChannelOperation(sdkConfiguration);

        return operation.handleResponse(operation.doRequest(request));
    }
}
