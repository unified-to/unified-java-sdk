/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.unifiedapi.unifiedto.utils.Utils;

public class ListAccountingOrganizationsRequestBuilder {

    private ListAccountingOrganizationsRequest request;
    private final SDKMethodInterfaces.MethodCallListAccountingOrganizations sdk;

    public ListAccountingOrganizationsRequestBuilder(SDKMethodInterfaces.MethodCallListAccountingOrganizations sdk) {
        this.sdk = sdk;
    }

    public ListAccountingOrganizationsRequestBuilder request(com.unifiedapi.unifiedto.models.operations.ListAccountingOrganizationsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListAccountingOrganizationsResponse call() throws Exception {

        return sdk.listAccountingOrganizations(
            request);
    }
}