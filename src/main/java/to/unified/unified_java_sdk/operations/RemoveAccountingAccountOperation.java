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
import to.unified.unified_java_sdk.models.operations.RemoveAccountingAccountRequest;
import to.unified.unified_java_sdk.models.operations.RemoveAccountingAccountResponse;
import to.unified.unified_java_sdk.utils.HTTPClient;
import to.unified.unified_java_sdk.utils.HTTPRequest;
import to.unified.unified_java_sdk.utils.Hook.AfterErrorContextImpl;
import to.unified.unified_java_sdk.utils.Hook.AfterSuccessContextImpl;
import to.unified.unified_java_sdk.utils.Hook.BeforeRequestContextImpl;
import to.unified.unified_java_sdk.utils.Utils;


public class RemoveAccountingAccountOperation implements RequestOperation<RemoveAccountingAccountRequest, RemoveAccountingAccountResponse> {

    private final SDKConfiguration sdkConfiguration;
    private final String baseUrl;
    private final SecuritySource securitySource;
    private final HTTPClient client;

    public RemoveAccountingAccountOperation(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.baseUrl = this.sdkConfiguration.serverUrl();
        this.securitySource = this.sdkConfiguration.securitySource();
        this.client = this.sdkConfiguration.client();
    }

    private Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(this.securitySource);
    }

    public HttpRequest buildRequest(RemoveAccountingAccountRequest request) throws Exception {
        String url = Utils.generateURL(
                RemoveAccountingAccountRequest.class,
                this.baseUrl,
                "/accounting/{connection_id}/account/{id}",
                request, null);
        HTTPRequest req = new HTTPRequest(url, "DELETE");
        req.addHeader("Accept", "*/*")
                .addHeader("user-agent", SDKConfiguration.USER_AGENT);
        Utils.configureSecurity(req, this.sdkConfiguration.securitySource().getSecurity());

        return sdkConfiguration.hooks().beforeRequest(
              new BeforeRequestContextImpl(
                  this.sdkConfiguration,
                  this.baseUrl,
                  "removeAccountingAccount",
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
                    "removeAccountingAccount",
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
                    "removeAccountingAccount",
                    java.util.Optional.of(java.util.List.of()),
                    securitySource()),
                response);
    }

    @Override
    public HttpResponse<InputStream> doRequest(RemoveAccountingAccountRequest request) throws Exception {
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
    public RemoveAccountingAccountResponse handleResponse(HttpResponse<InputStream> response) throws Exception {
        String contentType = response
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        RemoveAccountingAccountResponse.Builder resBuilder = 
            RemoveAccountingAccountResponse
                .builder()
                .contentType(contentType)
                .statusCode(response.statusCode())
                .rawResponse(response);

        RemoveAccountingAccountResponse res = resBuilder.build();
        
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
