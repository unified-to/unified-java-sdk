/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unifiedapi.unifiedto.utils.HTTPClient;
import com.unifiedapi.unifiedto.utils.HTTPRequest;
import com.unifiedapi.unifiedto.utils.JSON;
import com.unifiedapi.unifiedto.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;

public class Connection {
	
	private SDKConfiguration sdkConfiguration;

	public Connection(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create connection
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.CreateUnifiedConnectionResponse createUnifiedConnection(com.unifiedapi.unifiedto.models.shared.Connection request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(baseUrl, "/unified/connection");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.CreateUnifiedConnectionResponse res = new com.unifiedapi.unifiedto.models.operations.CreateUnifiedConnectionResponse(contentType, httpRes.statusCode(), httpRes) {{
            connection = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.Connection out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.Connection.class);
                res.connection = out;
            }
        }

        return res;
    }

    /**
     * Retrieve connection
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionResponse getUnifiedConnection(com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionRequest.class, baseUrl, "/unified/connection/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionResponse res = new com.unifiedapi.unifiedto.models.operations.GetUnifiedConnectionResponse(contentType, httpRes.statusCode(), httpRes) {{
            connection = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.Connection out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.Connection.class);
                res.connection = out;
            }
        }

        return res;
    }

    /**
     * List all connections
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsResponse listUnifiedConnections(com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(baseUrl, "/unified/connection");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = com.unifiedapi.unifiedto.utils.Utils.getQueryParams(com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsResponse res = new com.unifiedapi.unifiedto.models.operations.ListUnifiedConnectionsResponse(contentType, httpRes.statusCode(), httpRes) {{
            connections = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.Connection[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.Connection[].class);
                res.connections = out;
            }
        }

        return res;
    }

    /**
     * Update connection
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionResponse patchUnifiedConnection(com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionRequest.class, baseUrl, "/unified/connection/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "connection", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionResponse res = new com.unifiedapi.unifiedto.models.operations.PatchUnifiedConnectionResponse(contentType, httpRes.statusCode(), httpRes) {{
            connection = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.Connection out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.Connection.class);
                res.connection = out;
            }
        }

        return res;
    }

    /**
     * Remove connection
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionResponse removeUnifiedConnection(com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionRequest.class, baseUrl, "/unified/connection/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionResponse res = new com.unifiedapi.unifiedto.models.operations.RemoveUnifiedConnectionResponse(contentType, httpRes.statusCode(), httpRes) {{
            res = null;
        }};
        
        if (true) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.res = out;
            }
        }

        return res;
    }

    /**
     * Update connection
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionResponse updateUnifiedConnection(com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionRequest.class, baseUrl, "/unified/connection/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "connection", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionResponse res = new com.unifiedapi.unifiedto.models.operations.UpdateUnifiedConnectionResponse(contentType, httpRes.statusCode(), httpRes) {{
            connection = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.Connection out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.Connection.class);
                res.connection = out;
            }
        }

        return res;
    }
}