/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class CreateAtsJobRequestBuilder {

    private CreateAtsJobRequest request;
    private final SDKMethodInterfaces.MethodCallCreateAtsJob sdk;

    public CreateAtsJobRequestBuilder(SDKMethodInterfaces.MethodCallCreateAtsJob sdk) {
        this.sdk = sdk;
    }

    public CreateAtsJobRequestBuilder request(CreateAtsJobRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateAtsJobResponse call() throws Exception {

        return sdk.createAtsJob(
            request);
    }
}
