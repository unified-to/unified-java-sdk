/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto;

import com.fasterxml.jackson.core.type.TypeReference;
import com.unifiedapi.unifiedto.models.errors.SDKError;
import com.unifiedapi.unifiedto.models.operations.CreateStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.CreateStorageFileRequestBuilder;
import com.unifiedapi.unifiedto.models.operations.CreateStorageFileResponse;
import com.unifiedapi.unifiedto.models.operations.GetStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.GetStorageFileRequestBuilder;
import com.unifiedapi.unifiedto.models.operations.GetStorageFileResponse;
import com.unifiedapi.unifiedto.models.operations.ListStorageFilesRequest;
import com.unifiedapi.unifiedto.models.operations.ListStorageFilesRequestBuilder;
import com.unifiedapi.unifiedto.models.operations.ListStorageFilesResponse;
import com.unifiedapi.unifiedto.models.operations.PatchStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.PatchStorageFileRequestBuilder;
import com.unifiedapi.unifiedto.models.operations.PatchStorageFileResponse;
import com.unifiedapi.unifiedto.models.operations.RemoveStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.RemoveStorageFileRequestBuilder;
import com.unifiedapi.unifiedto.models.operations.RemoveStorageFileResponse;
import com.unifiedapi.unifiedto.models.operations.SDKMethodInterfaces.*;
import com.unifiedapi.unifiedto.models.operations.UpdateStorageFileRequest;
import com.unifiedapi.unifiedto.models.operations.UpdateStorageFileRequestBuilder;
import com.unifiedapi.unifiedto.models.operations.UpdateStorageFileResponse;
import com.unifiedapi.unifiedto.models.shared.StorageFile;
import com.unifiedapi.unifiedto.utils.HTTPClient;
import com.unifiedapi.unifiedto.utils.HTTPRequest;
import com.unifiedapi.unifiedto.utils.Hook.AfterErrorContextImpl;
import com.unifiedapi.unifiedto.utils.Hook.AfterSuccessContextImpl;
import com.unifiedapi.unifiedto.utils.Hook.BeforeRequestContextImpl;
import com.unifiedapi.unifiedto.utils.SerializedBody;
import com.unifiedapi.unifiedto.utils.Utils.JsonShape;
import com.unifiedapi.unifiedto.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

public class File implements
            MethodCallCreateStorageFile,
            MethodCallGetStorageFile,
            MethodCallListStorageFiles,
            MethodCallPatchStorageFile,
            MethodCallRemoveStorageFile,
            MethodCallUpdateStorageFile {

    private final SDKConfiguration sdkConfiguration;

    File(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Create a file
     * @return The call builder
     */
    public CreateStorageFileRequestBuilder createStorageFile() {
        return new CreateStorageFileRequestBuilder(this);
    }

    /**
     * Create a file
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateStorageFileResponse createStorageFile(
            CreateStorageFileRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                CreateStorageFileRequest.class,
                _baseUrl,
                "/storage/{connection_id}/file",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<CreateStorageFileRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "storageFile",
                "json",
                false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                CreateStorageFileRequest.class,
                request, 
                null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "createStorageFile", 
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
                            "createStorageFile",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "createStorageFile",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "createStorageFile",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateStorageFileResponse.Builder _resBuilder = 
            CreateStorageFileResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateStorageFileResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                StorageFile _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<StorageFile>() {});
                _res.withStorageFile(Optional.ofNullable(_out));
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



    /**
     * Retrieve a file
     * @return The call builder
     */
    public GetStorageFileRequestBuilder getStorageFile() {
        return new GetStorageFileRequestBuilder(this);
    }

    /**
     * Retrieve a file
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetStorageFileResponse getStorageFile(
            GetStorageFileRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetStorageFileRequest.class,
                _baseUrl,
                "/storage/{connection_id}/file/{id}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                GetStorageFileRequest.class,
                request, 
                null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "getStorageFile", 
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
                            "getStorageFile",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "getStorageFile",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "getStorageFile",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetStorageFileResponse.Builder _resBuilder = 
            GetStorageFileResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetStorageFileResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                StorageFile _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<StorageFile>() {});
                _res.withStorageFile(Optional.ofNullable(_out));
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



    /**
     * List all files
     * @return The call builder
     */
    public ListStorageFilesRequestBuilder listStorageFiles() {
        return new ListStorageFilesRequestBuilder(this);
    }

    /**
     * List all files
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListStorageFilesResponse listStorageFiles(
            ListStorageFilesRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                ListStorageFilesRequest.class,
                _baseUrl,
                "/storage/{connection_id}/file",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                ListStorageFilesRequest.class,
                request, 
                null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "listStorageFiles", 
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
                            "listStorageFiles",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "listStorageFiles",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "listStorageFiles",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListStorageFilesResponse.Builder _resBuilder = 
            ListStorageFilesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListStorageFilesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<StorageFile> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<StorageFile>>() {});
                _res.withStorageFiles(Optional.ofNullable(_out));
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



    /**
     * Update a file
     * @return The call builder
     */
    public PatchStorageFileRequestBuilder patchStorageFile() {
        return new PatchStorageFileRequestBuilder(this);
    }

    /**
     * Update a file
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PatchStorageFileResponse patchStorageFile(
            PatchStorageFileRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                PatchStorageFileRequest.class,
                _baseUrl,
                "/storage/{connection_id}/file/{id}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "PATCH");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<PatchStorageFileRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "storageFile",
                "json",
                false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                PatchStorageFileRequest.class,
                request, 
                null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "patchStorageFile", 
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
                            "patchStorageFile",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "patchStorageFile",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "patchStorageFile",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        PatchStorageFileResponse.Builder _resBuilder = 
            PatchStorageFileResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        PatchStorageFileResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                StorageFile _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<StorageFile>() {});
                _res.withStorageFile(Optional.ofNullable(_out));
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



    /**
     * Remove a file
     * @return The call builder
     */
    public RemoveStorageFileRequestBuilder removeStorageFile() {
        return new RemoveStorageFileRequestBuilder(this);
    }

    /**
     * Remove a file
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public RemoveStorageFileResponse removeStorageFile(
            RemoveStorageFileRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                RemoveStorageFileRequest.class,
                _baseUrl,
                "/storage/{connection_id}/file/{id}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "*/*")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "removeStorageFile", 
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
                            "removeStorageFile",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "removeStorageFile",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "removeStorageFile",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        RemoveStorageFileResponse.Builder _resBuilder = 
            RemoveStorageFileResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        RemoveStorageFileResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200", "default")) {
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
     * Update a file
     * @return The call builder
     */
    public UpdateStorageFileRequestBuilder updateStorageFile() {
        return new UpdateStorageFileRequestBuilder(this);
    }

    /**
     * Update a file
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateStorageFileResponse updateStorageFile(
            UpdateStorageFileRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                UpdateStorageFileRequest.class,
                _baseUrl,
                "/storage/{connection_id}/file/{id}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "PUT");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<UpdateStorageFileRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "storageFile",
                "json",
                false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                UpdateStorageFileRequest.class,
                request, 
                null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "updateStorageFile", 
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
                            "updateStorageFile",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "updateStorageFile",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "updateStorageFile",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateStorageFileResponse.Builder _resBuilder = 
            UpdateStorageFileResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdateStorageFileResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                StorageFile _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<StorageFile>() {});
                _res.withStorageFile(Optional.ofNullable(_out));
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
