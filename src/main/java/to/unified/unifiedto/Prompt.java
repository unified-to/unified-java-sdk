/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package to.unified.unifiedto;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;
import to.unified.unifiedto.models.errors.SDKError;
import to.unified.unifiedto.models.operations.CreateGenaiPromptRequest;
import to.unified.unifiedto.models.operations.CreateGenaiPromptRequestBuilder;
import to.unified.unifiedto.models.operations.CreateGenaiPromptResponse;
import to.unified.unifiedto.models.operations.SDKMethodInterfaces.*;
import to.unified.unifiedto.models.shared.GenaiPrompt;
import to.unified.unifiedto.utils.HTTPClient;
import to.unified.unifiedto.utils.HTTPRequest;
import to.unified.unifiedto.utils.Hook.AfterErrorContextImpl;
import to.unified.unifiedto.utils.Hook.AfterSuccessContextImpl;
import to.unified.unifiedto.utils.Hook.BeforeRequestContextImpl;
import to.unified.unifiedto.utils.SerializedBody;
import to.unified.unifiedto.utils.Utils.JsonShape;
import to.unified.unifiedto.utils.Utils; 

public class Prompt implements
            MethodCallCreateGenaiPrompt {

    private final SDKConfiguration sdkConfiguration;

    Prompt(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Create a prompt
     * @return The call builder
     */
    public CreateGenaiPromptRequestBuilder createGenaiPrompt() {
        return new CreateGenaiPromptRequestBuilder(this);
    }

    /**
     * Create a prompt
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateGenaiPromptResponse createGenaiPrompt(
            CreateGenaiPromptRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                CreateGenaiPromptRequest.class,
                _baseUrl,
                "/genai/{connection_id}/prompt",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<CreateGenaiPromptRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "genaiPrompt",
                "json",
                false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                CreateGenaiPromptRequest.class,
                request, 
                null));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "createGenaiPrompt", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "createGenaiPrompt",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "createGenaiPrompt",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "createGenaiPrompt",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateGenaiPromptResponse.Builder _resBuilder = 
            CreateGenaiPromptResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateGenaiPromptResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GenaiPrompt _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GenaiPrompt>() {});
                _res.withGenaiPrompt(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
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
