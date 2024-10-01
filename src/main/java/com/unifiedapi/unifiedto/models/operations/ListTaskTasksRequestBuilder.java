/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListTaskTasksRequestBuilder {

    private ListTaskTasksRequest request;
    private final SDKMethodInterfaces.MethodCallListTaskTasks sdk;

    public ListTaskTasksRequestBuilder(SDKMethodInterfaces.MethodCallListTaskTasks sdk) {
        this.sdk = sdk;
    }

    public ListTaskTasksRequestBuilder request(ListTaskTasksRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListTaskTasksResponse call() throws Exception {

        return sdk.listTaskTasks(
            request);
    }
}
