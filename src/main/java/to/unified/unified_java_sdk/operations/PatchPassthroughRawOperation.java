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
import to.unified.unified_java_sdk.models.operations.PatchPassthroughRawRequest;
import to.unified.unified_java_sdk.models.operations.PatchPassthroughRawResponse;
import to.unified.unified_java_sdk.utils.HTTPClient;
import to.unified.unified_java_sdk.utils.HTTPRequest;
import to.unified.unified_java_sdk.utils.Hook.AfterErrorContextImpl;
import to.unified.unified_java_sdk.utils.Hook.AfterSuccessContextImpl;
import to.unified.unified_java_sdk.utils.Hook.BeforeRequestContextImpl;
import to.unified.unified_java_sdk.utils.SerializedBody;
import to.unified.unified_java_sdk.utils.Utils.JsonShape;
import to.unified.unified_java_sdk.utils.Utils;


public class PatchPassthroughRawOperation implements RequestOperation<PatchPassthroughRawRequest, PatchPassthroughRawResponse> {
    
    private final SDKConfiguration sdkConfiguration;

    public PatchPassthroughRawOperation(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
    
    @Override
    public HttpResponse<InputStream> doRequest(PatchPassthroughRawRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl();
        String url = Utils.generateURL(
                PatchPassthroughRawRequest.class,
                baseUrl,
                "/passthrough/{connection_id}/{path}",
                request, null);
        
        HTTPRequest req = new HTTPRequest(url, "PATCH");
        Object convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<PatchPassthroughRawRequest>() {});
        SerializedBody serializedRequestBody = Utils.serializeRequestBody(
                convertedRequest, 
                "requestBody",
                "raw",
                false);
        req.setBody(Optional.ofNullable(serializedRequestBody));
        req.addHeader("Accept", "application/json;q=1, text/csv;q=0.8, text/plain;q=0.6, application/xml;q=0.4, */*;q=0")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        req.addQueryParams(Utils.getQueryParams(
                PatchPassthroughRawRequest.class,
                request, 
                null));
        
        Optional<SecuritySource> hookSecuritySource = Optional.of(this.sdkConfiguration.securitySource());
        Utils.configureSecurity(req,  
                this.sdkConfiguration.securitySource().getSecurity());
        HTTPClient client = this.sdkConfiguration.client();
        HttpRequest r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      this.sdkConfiguration,
                      baseUrl,
                      "patchPassthrough_raw", 
                      java.util.Optional.of(java.util.List.of()), 
                      hookSecuritySource),
                  req.build());
        HttpResponse<InputStream> httpRes;
        try {
            httpRes = client.send(r);
            if (Utils.statusCodeMatches(httpRes.statusCode(), "4XX", "5XX")) {
                httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            this.sdkConfiguration,
                            baseUrl,
                            "patchPassthrough_raw",
                            java.util.Optional.of(java.util.List.of()),
                            hookSecuritySource),
                        Optional.of(httpRes),
                        Optional.empty());
            } else {
                httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            this.sdkConfiguration,
                            baseUrl,
                            "patchPassthrough_raw",
                            java.util.Optional.of(java.util.List.of()), 
                            hookSecuritySource),
                         httpRes);
            }
        } catch (Exception e) {
            httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            this.sdkConfiguration,
                            baseUrl,
                            "patchPassthrough_raw",
                            java.util.Optional.of(java.util.List.of()),
                            hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(e));
        }
    
        return httpRes;
    }

    @Override
    public PatchPassthroughRawResponse handleResponse(HttpResponse<InputStream> response) throws Exception {
        String contentType = response
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        PatchPassthroughRawResponse.Builder resBuilder = 
            PatchPassthroughRawResponse
                .builder()
                .contentType(contentType)
                .statusCode(response.statusCode())
                .rawResponse(response);
        if (Utils.statusCodeMatches(response.statusCode(), "default") && Utils.contentTypeMatches(contentType, "*/*")) {
            resBuilder.defaultWildcardWildcardResponseStream(response.body());
        }

        PatchPassthroughRawResponse res = resBuilder.build();
        
        if (Utils.statusCodeMatches(response.statusCode(), "204", "205")) {
            res.withHeaders(response.headers().map());
            // no content 
            return res;
        }
        if (Utils.statusCodeMatches(response.statusCode(), "304")) {
            res.withHeaders(response.headers().map());
            // no content 
            return res;
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
        if (Utils.statusCodeMatches(response.statusCode(), "default")) {
            res.withHeaders(response.headers().map());
            if (Utils.contentTypeMatches(contentType, "application/json")) {
                Object out = Utils.mapper().readValue(
                    response.body(),
                    new TypeReference<>() {
                    });
                res.withDefaultApplicationJsonAny(out);
                return res;
            } else if (Utils.contentTypeMatches(contentType, "application/xml")) {
                String out = Utils.toUtf8AndClose(response.body());
                res.withDefaultApplicationXmlRes(out);
                return res;
            } else if (Utils.contentTypeMatches(contentType, "text/csv")) {
                String out = Utils.toUtf8AndClose(response.body());
                res.withDefaultTextCsvRes(out);
                return res;
            } else if (Utils.contentTypeMatches(contentType, "text/plain")) {
                String out = Utils.toUtf8AndClose(response.body());
                res.withDefaultTextPlainRes(out);
                return res;
            } else if (Utils.contentTypeMatches(contentType, "*/*")) {
                return res;
            } else {
                throw new SDKError(
                    response, 
                    response.statusCode(), 
                    "Unexpected content-type received: " + contentType, 
                    Utils.extractByteArrayFromBody(response));
            }
        }
        throw new SDKError(
            response, 
            response.statusCode(), 
            "Unexpected status code received: " + response.statusCode(), 
            Utils.extractByteArrayFromBody(response));
    }
}
