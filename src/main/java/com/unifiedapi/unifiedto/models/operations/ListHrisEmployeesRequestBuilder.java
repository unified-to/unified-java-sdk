/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListHrisEmployeesRequestBuilder {

    private ListHrisEmployeesRequest request;
    private final SDKMethodInterfaces.MethodCallListHrisEmployees sdk;

    public ListHrisEmployeesRequestBuilder(SDKMethodInterfaces.MethodCallListHrisEmployees sdk) {
        this.sdk = sdk;
    }

    public ListHrisEmployeesRequestBuilder request(com.unifiedapi.unifiedto.models.operations.ListHrisEmployeesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListHrisEmployeesResponse call() throws Exception {

        return sdk.listHrisEmployees(
            request);
    }
}
