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

public class Document {
	
	private SDKConfiguration sdkConfiguration;

	public Document(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create a document
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentResponse createAtsDocument(com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentRequest.class, baseUrl, "/ats/{connection_id}/document", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "atsDocument", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentResponse res = new com.unifiedapi.unifiedto.models.operations.CreateAtsDocumentResponse(contentType, httpRes.statusCode()) {{
            atsDocument = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AtsDocument out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AtsDocument.class);
                res.atsDocument = out;
            }
        }

        return res;
    }

    /**
     * Retrieve a document
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.GetAtsDocumentResponse getAtsDocument(com.unifiedapi.unifiedto.models.operations.GetAtsDocumentRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.GetAtsDocumentRequest.class, baseUrl, "/ats/{connection_id}/document/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = com.unifiedapi.unifiedto.utils.Utils.getQueryParams(com.unifiedapi.unifiedto.models.operations.GetAtsDocumentRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.GetAtsDocumentResponse res = new com.unifiedapi.unifiedto.models.operations.GetAtsDocumentResponse(contentType, httpRes.statusCode()) {{
            atsDocument = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AtsDocument out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AtsDocument.class);
                res.atsDocument = out;
            }
        }

        return res;
    }

    /**
     * List all documents
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsResponse listAtsDocuments(com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsRequest.class, baseUrl, "/ats/{connection_id}/document", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = com.unifiedapi.unifiedto.utils.Utils.getQueryParams(com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsResponse res = new com.unifiedapi.unifiedto.models.operations.ListAtsDocumentsResponse(contentType, httpRes.statusCode()) {{
            atsDocuments = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AtsDocument[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AtsDocument[].class);
                res.atsDocuments = out;
            }
        }

        return res;
    }

    /**
     * Update a document
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentResponse patchAtsDocument(com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentRequest.class, baseUrl, "/ats/{connection_id}/document/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "atsDocument", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentResponse res = new com.unifiedapi.unifiedto.models.operations.PatchAtsDocumentResponse(contentType, httpRes.statusCode()) {{
            atsDocument = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AtsDocument out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AtsDocument.class);
                res.atsDocument = out;
            }
        }

        return res;
    }

    /**
     * Remove a document
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentResponse removeAtsDocument(com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentRequest.class, baseUrl, "/ats/{connection_id}/document/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentResponse res = new com.unifiedapi.unifiedto.models.operations.RemoveAtsDocumentResponse(contentType, httpRes.statusCode()) {{
            res = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.res = out;
            }
        }

        return res;
    }

    /**
     * Update a document
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentResponse updateAtsDocument(com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentRequest.class, baseUrl, "/ats/{connection_id}/document/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "atsDocument", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentResponse res = new com.unifiedapi.unifiedto.models.operations.UpdateAtsDocumentResponse(contentType, httpRes.statusCode()) {{
            atsDocument = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AtsDocument out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AtsDocument.class);
                res.atsDocument = out;
            }
        }

        return res;
    }
}