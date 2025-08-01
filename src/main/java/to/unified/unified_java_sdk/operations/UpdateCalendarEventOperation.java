/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.SecuritySource;
import to.unified.unified_java_sdk.models.errors.SDKError;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarEventRequest;
import to.unified.unified_java_sdk.models.operations.UpdateCalendarEventResponse;
import to.unified.unified_java_sdk.models.shared.CalendarEvent;
import to.unified.unified_java_sdk.utils.HTTPClient;
import to.unified.unified_java_sdk.utils.HTTPRequest;
import to.unified.unified_java_sdk.utils.Hook.AfterErrorContextImpl;
import to.unified.unified_java_sdk.utils.Hook.AfterSuccessContextImpl;
import to.unified.unified_java_sdk.utils.Hook.BeforeRequestContextImpl;
import to.unified.unified_java_sdk.utils.SerializedBody;
import to.unified.unified_java_sdk.utils.Utils.JsonShape;
import to.unified.unified_java_sdk.utils.Utils;


public class UpdateCalendarEventOperation implements RequestOperation<UpdateCalendarEventRequest, UpdateCalendarEventResponse> {

    private final SDKConfiguration sdkConfiguration;
    private final String baseUrl;
    private final SecuritySource securitySource;
    private final HTTPClient client;

    public UpdateCalendarEventOperation(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.baseUrl = this.sdkConfiguration.serverUrl();
        this.securitySource = this.sdkConfiguration.securitySource();
        this.client = this.sdkConfiguration.client();
    }

    private Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(this.securitySource);
    }

    public HttpRequest buildRequest(UpdateCalendarEventRequest request) throws Exception {
        String url = Utils.generateURL(
                UpdateCalendarEventRequest.class,
                this.baseUrl,
                "/calendar/{connection_id}/event/{id}",
                request, null);
        HTTPRequest req = new HTTPRequest(url, "PUT");
        Object convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<UpdateCalendarEventRequest>() {});
        SerializedBody serializedRequestBody = Utils.serializeRequestBody(
                convertedRequest, 
                "calendarEvent",
                "json",
                false);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(Optional.ofNullable(serializedRequestBody));
        req.addHeader("Accept", "application/json")
                .addHeader("user-agent", SDKConfiguration.USER_AGENT);

        req.addQueryParams(Utils.getQueryParams(
                UpdateCalendarEventRequest.class,
                request, 
                null));
        Utils.configureSecurity(req, this.sdkConfiguration.securitySource().getSecurity());

        return sdkConfiguration.hooks().beforeRequest(
              new BeforeRequestContextImpl(
                  this.sdkConfiguration,
                  this.baseUrl,
                  "updateCalendarEvent",
                  java.util.Optional.of(java.util.List.of()),
                  securitySource()),
              req.build());
    }

    private HttpResponse<InputStream> onError(HttpResponse<InputStream> response,
                                              Exception error) throws Exception {
        return sdkConfiguration.hooks()
            .afterError(
                new AfterErrorContextImpl(
                    this.sdkConfiguration,
                    this.baseUrl,
                    "updateCalendarEvent",
                    java.util.Optional.of(java.util.List.of()),
                    securitySource()),
                Optional.ofNullable(response),
                Optional.ofNullable(error));
    }

    private HttpResponse<InputStream> onSuccess(HttpResponse<InputStream> response) throws Exception {
        return sdkConfiguration.hooks()
            .afterSuccess(
                new AfterSuccessContextImpl(
                    this.sdkConfiguration,
                    this.baseUrl,
                    "updateCalendarEvent",
                    java.util.Optional.of(java.util.List.of()),
                    securitySource()),
                response);
    }

    @Override
    public HttpResponse<InputStream> doRequest(UpdateCalendarEventRequest request) throws Exception {
        HttpRequest r = buildRequest(request);
        HttpResponse<InputStream> httpRes;
        try {
            httpRes = client.send(r);
            if (Utils.statusCodeMatches(httpRes.statusCode(), "4XX", "5XX")) {
                httpRes = onError(httpRes, null);
            } else {
                httpRes = onSuccess(httpRes);
            }
        } catch (Exception e) {
            httpRes = onError(null, e);
        }

        return httpRes;
    }


    @Override
    public UpdateCalendarEventResponse handleResponse(HttpResponse<InputStream> response) throws Exception {
        String contentType = response
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateCalendarEventResponse.Builder resBuilder = 
            UpdateCalendarEventResponse
                .builder()
                .contentType(contentType)
                .statusCode(response.statusCode())
                .rawResponse(response);

        UpdateCalendarEventResponse res = resBuilder.build();
        
        if (Utils.statusCodeMatches(response.statusCode(), "200")) {
            if (Utils.contentTypeMatches(contentType, "application/json")) {
                CalendarEvent out = Utils.mapper().readValue(
                    response.body(),
                    new TypeReference<>() {
                    });
                res.withCalendarEvent(out);
                return res;
            } else {
                throw new SDKError(
                    response, 
                    response.statusCode(), 
                    "Unexpected content-type received: " + contentType, 
                    Utils.extractByteArrayFromBody(response));
            }
        }
        if (Utils.statusCodeMatches(response.statusCode(), "4XX")) {
            // no content 
            throw new SDKError(
                    response, 
                    response.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(response));
        }
        if (Utils.statusCodeMatches(response.statusCode(), "5XX")) {
            // no content 
            throw new SDKError(
                    response, 
                    response.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(response));
        }
        throw new SDKError(
            response, 
            response.statusCode(), 
            "Unexpected status code received: " + response.statusCode(), 
            Utils.extractByteArrayFromBody(response));
    }
}
