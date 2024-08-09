/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListTaskProjectsRequestBuilder {

    private ListTaskProjectsRequest request;
    private final SDKMethodInterfaces.MethodCallListTaskProjects sdk;

    public ListTaskProjectsRequestBuilder(SDKMethodInterfaces.MethodCallListTaskProjects sdk) {
        this.sdk = sdk;
    }

    public ListTaskProjectsRequestBuilder request(com.unifiedapi.unifiedto.models.operations.ListTaskProjectsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListTaskProjectsResponse call() throws Exception {

        return sdk.listTaskProjects(
            request);
    }
}
