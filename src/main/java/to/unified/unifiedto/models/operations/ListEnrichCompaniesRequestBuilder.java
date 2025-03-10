/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class ListEnrichCompaniesRequestBuilder {

    private ListEnrichCompaniesRequest request;
    private final SDKMethodInterfaces.MethodCallListEnrichCompanies sdk;

    public ListEnrichCompaniesRequestBuilder(SDKMethodInterfaces.MethodCallListEnrichCompanies sdk) {
        this.sdk = sdk;
    }

    public ListEnrichCompaniesRequestBuilder request(ListEnrichCompaniesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListEnrichCompaniesResponse call() throws Exception {

        return sdk.listEnrichCompanies(
            request);
    }
}
