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

public class Passthrough {
	
	private SDKConfiguration sdkConfiguration;

	public Passthrough(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Passthrough DELETE
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.DeletePassthroughConnectionIdPathResponse deletePassthroughConnectionIdPath(com.unifiedapi.unifiedto.models.operations.DeletePassthroughConnectionIdPathRequest request, com.unifiedapi.unifiedto.models.operations.DeletePassthroughConnectionIdPathSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.DeletePassthroughConnectionIdPathRequest.class, baseUrl, "/passthrough/{connection_id}/{path}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.DeletePassthroughConnectionIdPathResponse res = new com.unifiedapi.unifiedto.models.operations.DeletePassthroughConnectionIdPathResponse(contentType, httpRes.statusCode()) {{
            undefined = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.Undefined out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.Undefined.class);
                res.undefined = out;
            }
        }

        return res;
    }

    /**
     * Passthrough GET
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.GetPassthroughConnectionIdPathResponse getPassthroughConnectionIdPath(com.unifiedapi.unifiedto.models.operations.GetPassthroughConnectionIdPathRequest request, com.unifiedapi.unifiedto.models.operations.GetPassthroughConnectionIdPathSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.GetPassthroughConnectionIdPathRequest.class, baseUrl, "/passthrough/{connection_id}/{path}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.GetPassthroughConnectionIdPathResponse res = new com.unifiedapi.unifiedto.models.operations.GetPassthroughConnectionIdPathResponse(contentType, httpRes.statusCode()) {{
            undefined = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.Undefined out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.Undefined.class);
                res.undefined = out;
            }
        }

        return res;
    }

    /**
     * Passthrough PUT
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PatchPassthroughConnectionIdPathResponse patchPassthroughConnectionIdPath(com.unifiedapi.unifiedto.models.operations.PatchPassthroughConnectionIdPathRequest request, com.unifiedapi.unifiedto.models.operations.PatchPassthroughConnectionIdPathSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PatchPassthroughConnectionIdPathRequest.class, baseUrl, "/passthrough/{connection_id}/{path}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "undefined", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.PatchPassthroughConnectionIdPathResponse res = new com.unifiedapi.unifiedto.models.operations.PatchPassthroughConnectionIdPathResponse(contentType, httpRes.statusCode()) {{
            undefined = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.Undefined out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.Undefined.class);
                res.undefined = out;
            }
        }

        return res;
    }

    /**
     * Passthrough POST
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PostPassthroughConnectionIdPathResponse postPassthroughConnectionIdPath(com.unifiedapi.unifiedto.models.operations.PostPassthroughConnectionIdPathRequest request, com.unifiedapi.unifiedto.models.operations.PostPassthroughConnectionIdPathSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PostPassthroughConnectionIdPathRequest.class, baseUrl, "/passthrough/{connection_id}/{path}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "undefined", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.PostPassthroughConnectionIdPathResponse res = new com.unifiedapi.unifiedto.models.operations.PostPassthroughConnectionIdPathResponse(contentType, httpRes.statusCode()) {{
            undefined = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.Undefined out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.Undefined.class);
                res.undefined = out;
            }
        }

        return res;
    }

    /**
     * Passthrough PUT
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PutPassthroughConnectionIdPathResponse putPassthroughConnectionIdPath(com.unifiedapi.unifiedto.models.operations.PutPassthroughConnectionIdPathRequest request, com.unifiedapi.unifiedto.models.operations.PutPassthroughConnectionIdPathSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PutPassthroughConnectionIdPathRequest.class, baseUrl, "/passthrough/{connection_id}/{path}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "undefined", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.PutPassthroughConnectionIdPathResponse res = new com.unifiedapi.unifiedto.models.operations.PutPassthroughConnectionIdPathResponse(contentType, httpRes.statusCode()) {{
            undefined = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.Undefined out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.Undefined.class);
                res.undefined = out;
            }
        }

        return res;
    }
}