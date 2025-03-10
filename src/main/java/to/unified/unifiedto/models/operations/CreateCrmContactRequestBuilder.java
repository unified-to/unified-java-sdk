/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class CreateCrmContactRequestBuilder {

    private CreateCrmContactRequest request;
    private final SDKMethodInterfaces.MethodCallCreateCrmContact sdk;

    public CreateCrmContactRequestBuilder(SDKMethodInterfaces.MethodCallCreateCrmContact sdk) {
        this.sdk = sdk;
    }

    public CreateCrmContactRequestBuilder request(CreateCrmContactRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateCrmContactResponse call() throws Exception {

        return sdk.createCrmContact(
            request);
    }
}
