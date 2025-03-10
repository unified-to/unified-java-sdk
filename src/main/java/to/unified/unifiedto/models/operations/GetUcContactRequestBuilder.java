/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class GetUcContactRequestBuilder {

    private GetUcContactRequest request;
    private final SDKMethodInterfaces.MethodCallGetUcContact sdk;

    public GetUcContactRequestBuilder(SDKMethodInterfaces.MethodCallGetUcContact sdk) {
        this.sdk = sdk;
    }

    public GetUcContactRequestBuilder request(GetUcContactRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetUcContactResponse call() throws Exception {

        return sdk.getUcContact(
            request);
    }
}
