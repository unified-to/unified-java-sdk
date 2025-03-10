/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class ListEnrichPeopleRequestBuilder {

    private ListEnrichPeopleRequest request;
    private final SDKMethodInterfaces.MethodCallListEnrichPeople sdk;

    public ListEnrichPeopleRequestBuilder(SDKMethodInterfaces.MethodCallListEnrichPeople sdk) {
        this.sdk = sdk;
    }

    public ListEnrichPeopleRequestBuilder request(ListEnrichPeopleRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListEnrichPeopleResponse call() throws Exception {

        return sdk.listEnrichPeople(
            request);
    }
}
