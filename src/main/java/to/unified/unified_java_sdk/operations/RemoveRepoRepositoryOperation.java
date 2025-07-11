/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package to.unified.unified_java_sdk.operations;

import static to.unified.unified_java_sdk.operations.Operations.RequestOperation;

import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;
import to.unified.unified_java_sdk.SDKConfiguration;
import to.unified.unified_java_sdk.SecuritySource;
import to.unified.unified_java_sdk.models.errors.SDKError;
import to.unified.unified_java_sdk.models.operations.RemoveRepoRepositoryRequest;
import to.unified.unified_java_sdk.models.operations.RemoveRepoRepositoryResponse;
import to.unified.unified_java_sdk.utils.HTTPClient;
import to.unified.unified_java_sdk.utils.HTTPRequest;
import to.unified.unified_java_sdk.utils.Hook.AfterErrorContextImpl;
import to.unified.unified_java_sdk.utils.Hook.AfterSuccessContextImpl;
import to.unified.unified_java_sdk.utils.Hook.BeforeRequestContextImpl;
import to.unified.unified_java_sdk.utils.Utils;


public class RemoveRepoRepositoryOperation implements RequestOperation<RemoveRepoRepositoryRequest, RemoveRepoRepositoryResponse> {
    
    private final SDKConfiguration sdkConfiguration;

    public RemoveRepoRepositoryOperation(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }
    
    @Override
    public HttpResponse<InputStream> doRequest(RemoveRepoRepositoryRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl();
        String url = Utils.generateURL(
                RemoveRepoRepositoryRequest.class,
                baseUrl,
                "/repo/{connection_id}/repository/{id}",
                request, null);
        
        HTTPRequest req = new HTTPRequest(url, "DELETE");
        req.addHeader("Accept", "*/*")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        
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
                      "removeRepoRepository", 
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
                            "removeRepoRepository",
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
                            "removeRepoRepository",
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
                            "removeRepoRepository",
                            java.util.Optional.of(java.util.List.of()),
                            hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(e));
        }
    
        return httpRes;
    }

    @Override
    public RemoveRepoRepositoryResponse handleResponse(HttpResponse<InputStream> response) throws Exception {
        String contentType = response
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        RemoveRepoRepositoryResponse.Builder resBuilder = 
            RemoveRepoRepositoryResponse
                .builder()
                .contentType(contentType)
                .statusCode(response.statusCode())
                .rawResponse(response);

        RemoveRepoRepositoryResponse res = resBuilder.build();
        
        if (Utils.statusCodeMatches(response.statusCode(), "200")) {
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
            // no content 
            return res;
        }
        throw new SDKError(
            response, 
            response.statusCode(), 
            "Unexpected status code received: " + response.statusCode(), 
            Utils.extractByteArrayFromBody(response));
    }
}
