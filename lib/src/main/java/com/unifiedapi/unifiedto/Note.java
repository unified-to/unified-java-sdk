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

public class Note {
	
	private SDKConfiguration sdkConfiguration;

	public Note(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Remove a note
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNotesTicketIdIdResponse deleteTicketingConnectionIdNotesTicketIdId(com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNotesTicketIdIdRequest request, com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNotesTicketIdIdSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNotesTicketIdIdRequest.class, baseUrl, "/ticketing/{connection_id}/notes/{ticket_id}/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNotesTicketIdIdResponse res = new com.unifiedapi.unifiedto.models.operations.DeleteTicketingConnectionIdNotesTicketIdIdResponse(contentType, httpRes.statusCode()) {{
            deleteTicketingConnectionIdNotesTicketIdIdDefaultApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.deleteTicketingConnectionIdNotesTicketIdIdDefaultApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * List all notes
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdResponse getTicketingConnectionIdNotesTicketId(com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdRequest request, com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdRequest.class, baseUrl, "/ticketing/{connection_id}/notes/{ticket_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = com.unifiedapi.unifiedto.utils.Utils.getQueryParams(com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdResponse res = new com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdResponse(contentType, httpRes.statusCode()) {{
            ticketingNotes = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.TicketingNote[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.TicketingNote[].class);
                res.ticketingNotes = out;
            }
        }

        return res;
    }

    /**
     * Retrieve a note
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdIdResponse getTicketingConnectionIdNotesTicketIdId(com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdIdRequest request, com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdIdSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdIdRequest.class, baseUrl, "/ticketing/{connection_id}/notes/{ticket_id}/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdIdResponse res = new com.unifiedapi.unifiedto.models.operations.GetTicketingConnectionIdNotesTicketIdIdResponse(contentType, httpRes.statusCode()) {{
            ticketingNote = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.TicketingNote out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.TicketingNote.class);
                res.ticketingNote = out;
            }
        }

        return res;
    }

    /**
     * Update a note
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNotesTicketIdIdResponse patchTicketingConnectionIdNotesTicketIdId(com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNotesTicketIdIdRequest request, com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNotesTicketIdIdSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNotesTicketIdIdRequest.class, baseUrl, "/ticketing/{connection_id}/notes/{ticket_id}/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "ticketingNote", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNotesTicketIdIdResponse res = new com.unifiedapi.unifiedto.models.operations.PatchTicketingConnectionIdNotesTicketIdIdResponse(contentType, httpRes.statusCode()) {{
            ticketingNote = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.TicketingNote out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.TicketingNote.class);
                res.ticketingNote = out;
            }
        }

        return res;
    }

    /**
     * Create a note
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNotesTicketIdResponse postTicketingConnectionIdNotesTicketId(com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNotesTicketIdRequest request, com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNotesTicketIdSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNotesTicketIdRequest.class, baseUrl, "/ticketing/{connection_id}/notes/{ticket_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "ticketingNote", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNotesTicketIdResponse res = new com.unifiedapi.unifiedto.models.operations.PostTicketingConnectionIdNotesTicketIdResponse(contentType, httpRes.statusCode()) {{
            ticketingNote = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.TicketingNote out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.TicketingNote.class);
                res.ticketingNote = out;
            }
        }

        return res;
    }

    /**
     * Update a note
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNotesTicketIdIdResponse putTicketingConnectionIdNotesTicketIdId(com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNotesTicketIdIdRequest request, com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNotesTicketIdIdSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNotesTicketIdIdRequest.class, baseUrl, "/ticketing/{connection_id}/notes/{ticket_id}/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "ticketingNote", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNotesTicketIdIdResponse res = new com.unifiedapi.unifiedto.models.operations.PutTicketingConnectionIdNotesTicketIdIdResponse(contentType, httpRes.statusCode()) {{
            ticketingNote = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.TicketingNote out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.TicketingNote.class);
                res.ticketingNote = out;
            }
        }

        return res;
    }
}