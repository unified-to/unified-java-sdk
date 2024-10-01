/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListAtsJobsRequestBuilder {

    private ListAtsJobsRequest request;
    private final SDKMethodInterfaces.MethodCallListAtsJobs sdk;

    public ListAtsJobsRequestBuilder(SDKMethodInterfaces.MethodCallListAtsJobs sdk) {
        this.sdk = sdk;
    }

    public ListAtsJobsRequestBuilder request(ListAtsJobsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListAtsJobsResponse call() throws Exception {

        return sdk.listAtsJobs(
            request);
    }
}
