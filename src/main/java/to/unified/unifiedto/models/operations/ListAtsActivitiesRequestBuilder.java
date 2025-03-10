/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class ListAtsActivitiesRequestBuilder {

    private ListAtsActivitiesRequest request;
    private final SDKMethodInterfaces.MethodCallListAtsActivities sdk;

    public ListAtsActivitiesRequestBuilder(SDKMethodInterfaces.MethodCallListAtsActivities sdk) {
        this.sdk = sdk;
    }

    public ListAtsActivitiesRequestBuilder request(ListAtsActivitiesRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListAtsActivitiesResponse call() throws Exception {

        return sdk.listAtsActivities(
            request);
    }
}
