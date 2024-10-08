/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class RemoveStorageFileRequestBuilder {

    private RemoveStorageFileRequest request;
    private final SDKMethodInterfaces.MethodCallRemoveStorageFile sdk;

    public RemoveStorageFileRequestBuilder(SDKMethodInterfaces.MethodCallRemoveStorageFile sdk) {
        this.sdk = sdk;
    }

    public RemoveStorageFileRequestBuilder request(RemoveStorageFileRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public RemoveStorageFileResponse call() throws Exception {

        return sdk.removeStorageFile(
            request);
    }
}
