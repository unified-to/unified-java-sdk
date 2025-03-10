/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto.models.operations;

import to.unified.unifiedto.utils.Utils;

public class GetCalendarRecordingRequestBuilder {

    private GetCalendarRecordingRequest request;
    private final SDKMethodInterfaces.MethodCallGetCalendarRecording sdk;

    public GetCalendarRecordingRequestBuilder(SDKMethodInterfaces.MethodCallGetCalendarRecording sdk) {
        this.sdk = sdk;
    }

    public GetCalendarRecordingRequestBuilder request(GetCalendarRecordingRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetCalendarRecordingResponse call() throws Exception {

        return sdk.getCalendarRecording(
            request);
    }
}
