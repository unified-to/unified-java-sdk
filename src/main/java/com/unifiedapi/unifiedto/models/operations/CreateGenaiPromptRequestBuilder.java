/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class CreateGenaiPromptRequestBuilder {

    private CreateGenaiPromptRequest request;
    private final SDKMethodInterfaces.MethodCallCreateGenaiPrompt sdk;

    public CreateGenaiPromptRequestBuilder(SDKMethodInterfaces.MethodCallCreateGenaiPrompt sdk) {
        this.sdk = sdk;
    }

    public CreateGenaiPromptRequestBuilder request(CreateGenaiPromptRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateGenaiPromptResponse call() throws Exception {

        return sdk.createGenaiPrompt(
            request);
    }
}
