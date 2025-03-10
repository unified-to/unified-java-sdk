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
import to.unified.unifiedto.models.operations.CreateScimUsersRequest;
import to.unified.unifiedto.models.operations.CreateScimUsersRequestBuilder;
import to.unified.unifiedto.models.operations.CreateScimUsersResponse;
import to.unified.unifiedto.models.operations.GetScimUsersRequest;
import to.unified.unifiedto.models.operations.GetScimUsersRequestBuilder;
import to.unified.unifiedto.models.operations.GetScimUsersResponse;
import to.unified.unifiedto.models.operations.ListScimUsersRequest;
import to.unified.unifiedto.models.operations.ListScimUsersRequestBuilder;
import to.unified.unifiedto.models.operations.ListScimUsersResponse;
import to.unified.unifiedto.models.operations.PatchScimUsersRequest;
import to.unified.unifiedto.models.operations.PatchScimUsersRequestBuilder;
import to.unified.unifiedto.models.operations.PatchScimUsersResponse;
import to.unified.unifiedto.models.operations.RemoveScimUsersRequest;
import to.unified.unifiedto.models.operations.RemoveScimUsersRequestBuilder;
import to.unified.unifiedto.models.operations.RemoveScimUsersResponse;
import to.unified.unifiedto.models.operations.SDKMethodInterfaces.*;
import to.unified.unifiedto.models.operations.UpdateScimUsersRequest;
import to.unified.unifiedto.models.operations.UpdateScimUsersRequestBuilder;
import to.unified.unifiedto.models.operations.UpdateScimUsersResponse;
import to.unified.unifiedto.models.shared.ScimUser;
import to.unified.unifiedto.utils.HTTPClient;
import to.unified.unifiedto.utils.HTTPRequest;
import to.unified.unifiedto.utils.Hook.AfterErrorContextImpl;
import to.unified.unifiedto.utils.Hook.AfterSuccessContextImpl;
import to.unified.unifiedto.utils.Hook.BeforeRequestContextImpl;
import to.unified.unifiedto.utils.SerializedBody;
import to.unified.unifiedto.utils.Utils.JsonShape;
import to.unified.unifiedto.utils.Utils; 

public class User implements
            MethodCallCreateScimUsers,
            MethodCallGetScimUsers,
            MethodCallListScimUsers,
            MethodCallPatchScimUsers,
            MethodCallRemoveScimUsers,
            MethodCallUpdateScimUsers {

    private final SDKConfiguration sdkConfiguration;

    User(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Create user
     * @return The call builder
     */
    public CreateScimUsersRequestBuilder createScimUsers() {
        return new CreateScimUsersRequestBuilder(this);
    }

    /**
     * Create user
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateScimUsersResponse createScimUsers(
            CreateScimUsersRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                CreateScimUsersRequest.class,
                _baseUrl,
                "/scim/{connection_id}/users",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<CreateScimUsersRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "scimUser",
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
                CreateScimUsersRequest.class,
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
                      "createScimUsers", 
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
                            "createScimUsers",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "createScimUsers",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "createScimUsers",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateScimUsersResponse.Builder _resBuilder = 
            CreateScimUsersResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateScimUsersResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ScimUser _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ScimUser>() {});
                _res.withScimUser(Optional.ofNullable(_out));
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



    /**
     * Get user
     * @return The call builder
     */
    public GetScimUsersRequestBuilder getScimUsers() {
        return new GetScimUsersRequestBuilder(this);
    }

    /**
     * Get user
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetScimUsersResponse getScimUsers(
            GetScimUsersRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetScimUsersRequest.class,
                _baseUrl,
                "/scim/{connection_id}/users/{id}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "getScimUsers", 
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
                            "getScimUsers",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getScimUsers",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getScimUsers",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetScimUsersResponse.Builder _resBuilder = 
            GetScimUsersResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetScimUsersResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ScimUser _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ScimUser>() {});
                _res.withScimUser(Optional.ofNullable(_out));
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



    /**
     * List users
     * @return The call builder
     */
    public ListScimUsersRequestBuilder listScimUsers() {
        return new ListScimUsersRequestBuilder(this);
    }

    /**
     * List users
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListScimUsersResponse listScimUsers(
            ListScimUsersRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                ListScimUsersRequest.class,
                _baseUrl,
                "/scim/{connection_id}/users",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListScimUsersRequest.class,
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
                      "listScimUsers", 
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
                            "listScimUsers",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "listScimUsers",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "listScimUsers",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListScimUsersResponse.Builder _resBuilder = 
            ListScimUsersResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListScimUsersResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<ScimUser> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<ScimUser>>() {});
                _res.withScimUsers(Optional.ofNullable(_out));
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



    /**
     * Update user
     * @return The call builder
     */
    public PatchScimUsersRequestBuilder patchScimUsers() {
        return new PatchScimUsersRequestBuilder(this);
    }

    /**
     * Update user
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PatchScimUsersResponse patchScimUsers(
            PatchScimUsersRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                PatchScimUsersRequest.class,
                _baseUrl,
                "/scim/{connection_id}/users/{id}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "PATCH");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<PatchScimUsersRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "scimUser",
                "json",
                false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "patchScimUsers", 
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
                            "patchScimUsers",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "patchScimUsers",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "patchScimUsers",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        PatchScimUsersResponse.Builder _resBuilder = 
            PatchScimUsersResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        PatchScimUsersResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ScimUser _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ScimUser>() {});
                _res.withScimUser(Optional.ofNullable(_out));
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



    /**
     * Delete user
     * @return The call builder
     */
    public RemoveScimUsersRequestBuilder removeScimUsers() {
        return new RemoveScimUsersRequestBuilder(this);
    }

    /**
     * Delete user
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public RemoveScimUsersResponse removeScimUsers(
            RemoveScimUsersRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                RemoveScimUsersRequest.class,
                _baseUrl,
                "/scim/{connection_id}/users/{id}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "*/*")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "removeScimUsers", 
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
                            "removeScimUsers",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "removeScimUsers",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "removeScimUsers",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        RemoveScimUsersResponse.Builder _resBuilder = 
            RemoveScimUsersResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        RemoveScimUsersResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
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
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "default")) {
            _res.withHeaders(_httpRes.headers().map());
            // no content 
            return _res;
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }



    /**
     * Update user
     * @return The call builder
     */
    public UpdateScimUsersRequestBuilder updateScimUsers() {
        return new UpdateScimUsersRequestBuilder(this);
    }

    /**
     * Update user
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateScimUsersResponse updateScimUsers(
            UpdateScimUsersRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                UpdateScimUsersRequest.class,
                _baseUrl,
                "/scim/{connection_id}/users/{id}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "PUT");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<UpdateScimUsersRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "scimUser",
                "json",
                false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "updateScimUsers", 
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
                            "updateScimUsers",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "updateScimUsers",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "updateScimUsers",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateScimUsersResponse.Builder _resBuilder = 
            UpdateScimUsersResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdateScimUsersResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ScimUser _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ScimUser>() {});
                _res.withScimUser(Optional.ofNullable(_out));
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
