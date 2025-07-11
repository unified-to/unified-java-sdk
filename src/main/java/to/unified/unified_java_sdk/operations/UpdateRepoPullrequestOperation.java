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
import to.unified.unified_java_sdk.models.operations.UpdateRepoPullrequestRequest;
import to.unified.unified_java_sdk.models.operations.UpdateRepoPullrequestResponse;
import to.unified.unified_java_sdk.models.shared.RepoPullrequest;
import to.unified.unified_java_sdk.utils.HTTPClient;
import to.unified.unified_java_sdk.utils.HTTPRequest;
import to.unified.unified_java_sdk.utils.Hook.AfterErrorContextImpl;
import to.unified.unified_java_sdk.utils.Hook.AfterSuccessContextImpl;
import to.unified.unified_java_sdk.utils.Hook.BeforeRequestContextImpl;
import to.unified.unified_java_sdk.utils.SerializedBody;
import to.unified.unified_java_sdk.utils.Utils.JsonShape;
import to.unified.unified_java_sdk.utils.Utils;


public class UpdateRepoPullrequestOperation implements RequestOperation<UpdateRepoPullrequestRequest, UpdateRepoPullrequestResponse> {
    
    private final SDKConfiguration sdkConfiguration;

    public UpdateRepoPullrequestOperation(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
    
    @Override
    public HttpResponse<InputStream> doRequest(UpdateRepoPullrequestRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl();
        String url = Utils.generateURL(
                UpdateRepoPullrequestRequest.class,
                baseUrl,
                "/repo/{connection_id}/pullrequest/{id}",
                request, null);
        
        HTTPRequest req = new HTTPRequest(url, "PUT");
        Object convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<UpdateRepoPullrequestRequest>() {});
        SerializedBody serializedRequestBody = Utils.serializeRequestBody(
                convertedRequest, 
                "repoPullrequest",
                "json",
                false);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(Optional.ofNullable(serializedRequestBody));
        req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        req.addQueryParams(Utils.getQueryParams(
                UpdateRepoPullrequestRequest.class,
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
                      "updateRepoPullrequest", 
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
                            "updateRepoPullrequest",
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
                            "updateRepoPullrequest",
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
                            "updateRepoPullrequest",
                            java.util.Optional.of(java.util.List.of()),
                            hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(e));
        }
    
        return httpRes;
    }

    @Override
    public UpdateRepoPullrequestResponse handleResponse(HttpResponse<InputStream> response) throws Exception {
        String contentType = response
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateRepoPullrequestResponse.Builder resBuilder = 
            UpdateRepoPullrequestResponse
                .builder()
                .contentType(contentType)
                .statusCode(response.statusCode())
                .rawResponse(response);

        UpdateRepoPullrequestResponse res = resBuilder.build();
        
        if (Utils.statusCodeMatches(response.statusCode(), "200")) {
            if (Utils.contentTypeMatches(contentType, "application/json")) {
                RepoPullrequest out = Utils.mapper().readValue(
                    response.body(),
                    new TypeReference<>() {
                    });
                res.withRepoPullrequest(out);
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
