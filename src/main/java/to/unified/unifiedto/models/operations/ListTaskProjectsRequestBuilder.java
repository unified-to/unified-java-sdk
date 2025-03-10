/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class ListTaskProjectsRequestBuilder {

    private ListTaskProjectsRequest request;
    private final SDKMethodInterfaces.MethodCallListTaskProjects sdk;

    public ListTaskProjectsRequestBuilder(SDKMethodInterfaces.MethodCallListTaskProjects sdk) {
        this.sdk = sdk;
    }

    public ListTaskProjectsRequestBuilder request(ListTaskProjectsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListTaskProjectsResponse call() throws Exception {

        return sdk.listTaskProjects(
            request);
    }
}
