/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto;

import com.fasterxml.jackson.core.type.TypeReference;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesRequest;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesRequestBuilder;
import com.unifiedapi.unifiedto.models.operations.ListAtsApplicationstatusesResponse;
import com.unifiedapi.unifiedto.models.operations.SDKMethodInterfaces.*;
import com.unifiedapi.unifiedto.models.shared.AtsStatus;
import com.unifiedapi.unifiedto.utils.HTTPClient;
import com.unifiedapi.unifiedto.utils.HTTPRequest;
import com.unifiedapi.unifiedto.utils.Hook.AfterErrorContextImpl;
import com.unifiedapi.unifiedto.utils.Hook.AfterSuccessContextImpl;
import com.unifiedapi.unifiedto.utils.Hook.BeforeRequestContextImpl;
import com.unifiedapi.unifiedto.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

public class Applicationstatus implements
            MethodCallListAtsApplicationstatuses {

    private final SDKConfiguration sdkConfiguration;

    Applicationstatus(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List all applicationstatuses
     * @return The call builder
     */
    public ListAtsApplicationstatusesRequestBuilder listAtsApplicationstatuses() {
        return new ListAtsApplicationstatusesRequestBuilder(this);
    }

    /**
     * List all applicationstatuses
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListAtsApplicationstatusesResponse listAtsApplicationstatuses(
            ListAtsApplicationstatusesRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                ListAtsApplicationstatusesRequest.class,
                _baseUrl,
                "/ats/{connection_id}/applicationstatus",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                ListAtsApplicationstatusesRequest.class,
                request, 
                null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "listAtsApplicationstatuses", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "listAtsApplicationstatuses",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "listAtsApplicationstatuses",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "listAtsApplicationstatuses",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListAtsApplicationstatusesResponse.Builder _resBuilder = 
            ListAtsApplicationstatusesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListAtsApplicationstatusesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<AtsStatus> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<AtsStatus>>() {});
                _res.withAtsStatuses(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}
