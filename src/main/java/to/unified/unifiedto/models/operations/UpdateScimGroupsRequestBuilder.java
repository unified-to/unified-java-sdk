/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class UpdateScimGroupsRequestBuilder {

    private UpdateScimGroupsRequest request;
    private final SDKMethodInterfaces.MethodCallUpdateScimGroups sdk;

    public UpdateScimGroupsRequestBuilder(SDKMethodInterfaces.MethodCallUpdateScimGroups sdk) {
        this.sdk = sdk;
    }

    public UpdateScimGroupsRequestBuilder request(UpdateScimGroupsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public UpdateScimGroupsResponse call() throws Exception {

        return sdk.updateScimGroups(
            request);
    }
}
