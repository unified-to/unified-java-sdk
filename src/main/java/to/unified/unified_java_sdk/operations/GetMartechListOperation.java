/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.SecuritySource;
import to.unified.unified_java_sdk.models.errors.SDKError;
import to.unified.unified_java_sdk.models.operations.GetMartechListRequest;
import to.unified.unified_java_sdk.models.operations.GetMartechListResponse;
import to.unified.unified_java_sdk.models.shared.MarketingList;
import to.unified.unified_java_sdk.utils.HTTPClient;
import to.unified.unified_java_sdk.utils.HTTPRequest;
import to.unified.unified_java_sdk.utils.Hook.AfterErrorContextImpl;
import to.unified.unified_java_sdk.utils.Hook.AfterSuccessContextImpl;
import to.unified.unified_java_sdk.utils.Hook.BeforeRequestContextImpl;
import to.unified.unified_java_sdk.utils.Utils;


public class GetMartechListOperation implements RequestOperation<GetMartechListRequest, GetMartechListResponse> {
    
    private final SDKConfiguration sdkConfiguration;

    public GetMartechListOperation(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
    
    @Override
    public HttpResponse<InputStream> doRequest(GetMartechListRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl();
        String url = Utils.generateURL(
                GetMartechListRequest.class,
                baseUrl,
                "/martech/{connection_id}/list/{id}",
                request, null);
        
        HTTPRequest req = new HTTPRequest(url, "GET");
        req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        req.addQueryParams(Utils.getQueryParams(
                GetMartechListRequest.class,
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
                      "getMartechList", 
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
                            "getMartechList",
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
                            "getMartechList",
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
                            "getMartechList",
                            java.util.Optional.of(java.util.List.of()),
                            hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(e));
        }
    
        return httpRes;
    }

    @Override
    public GetMartechListResponse handleResponse(HttpResponse<InputStream> response) throws Exception {
        String contentType = response
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetMartechListResponse.Builder resBuilder = 
            GetMartechListResponse
                .builder()
                .contentType(contentType)
                .statusCode(response.statusCode())
                .rawResponse(response);

        GetMartechListResponse res = resBuilder.build();
        
        if (Utils.statusCodeMatches(response.statusCode(), "200")) {
            if (Utils.contentTypeMatches(contentType, "application/json")) {
                MarketingList out = Utils.mapper().readValue(
                    response.body(),
                    new TypeReference<>() {
                    });
                res.withMarketingList(out);
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
