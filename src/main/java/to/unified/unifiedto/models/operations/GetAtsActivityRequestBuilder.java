/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class GetAtsActivityRequestBuilder {

    private GetAtsActivityRequest request;
    private final SDKMethodInterfaces.MethodCallGetAtsActivity sdk;

    public GetAtsActivityRequestBuilder(SDKMethodInterfaces.MethodCallGetAtsActivity sdk) {
        this.sdk = sdk;
    }

    public GetAtsActivityRequestBuilder request(GetAtsActivityRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAtsActivityResponse call() throws Exception {

        return sdk.getAtsActivity(
            request);
    }
}
