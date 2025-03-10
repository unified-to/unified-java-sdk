/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class CreateKmsCommentRequestBuilder {

    private CreateKmsCommentRequest request;
    private final SDKMethodInterfaces.MethodCallCreateKmsComment sdk;

    public CreateKmsCommentRequestBuilder(SDKMethodInterfaces.MethodCallCreateKmsComment sdk) {
        this.sdk = sdk;
    }

    public CreateKmsCommentRequestBuilder request(CreateKmsCommentRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateKmsCommentResponse call() throws Exception {

        return sdk.createKmsComment(
            request);
    }
}
