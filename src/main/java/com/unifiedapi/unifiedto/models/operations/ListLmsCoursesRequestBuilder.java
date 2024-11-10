/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListLmsCoursesRequestBuilder {

    private ListLmsCoursesRequest request;
    private final SDKMethodInterfaces.MethodCallListLmsCourses sdk;

    public ListLmsCoursesRequestBuilder(SDKMethodInterfaces.MethodCallListLmsCourses sdk) {
        this.sdk = sdk;
    }

    public ListLmsCoursesRequestBuilder request(ListLmsCoursesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListLmsCoursesResponse call() throws Exception {

        return sdk.listLmsCourses(
            request);
    }
}
