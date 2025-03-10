/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class ListRepoRepositoriesRequestBuilder {

    private ListRepoRepositoriesRequest request;
    private final SDKMethodInterfaces.MethodCallListRepoRepositories sdk;

    public ListRepoRepositoriesRequestBuilder(SDKMethodInterfaces.MethodCallListRepoRepositories sdk) {
        this.sdk = sdk;
    }

    public ListRepoRepositoriesRequestBuilder request(ListRepoRepositoriesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListRepoRepositoriesResponse call() throws Exception {

        return sdk.listRepoRepositories(
            request);
    }
}
