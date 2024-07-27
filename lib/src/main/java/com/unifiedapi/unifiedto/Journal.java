/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unifiedapi.unifiedto.utils.HTTPClient;
import com.unifiedapi.unifiedto.utils.HTTPRequest;
import com.unifiedapi.unifiedto.utils.JSON;
import com.unifiedapi.unifiedto.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Journal {
	
	private SDKConfiguration sdkConfiguration;

	public Journal(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create a journal
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.CreateAccountingJournalResponse createAccountingJournal(com.unifiedapi.unifiedto.models.operations.CreateAccountingJournalRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.CreateAccountingJournalRequest.class, baseUrl, "/accounting/{connection_id}/journal", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "accountingJournal", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.CreateAccountingJournalResponse res = new com.unifiedapi.unifiedto.models.operations.CreateAccountingJournalResponse(contentType, httpRes.statusCode(), httpRes) {{
            accountingJournal = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AccountingJournal out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AccountingJournal.class);
                res.accountingJournal = out;
            }
        }

        return res;
    }

    /**
     * Retrieve a journal
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.GetAccountingJournalResponse getAccountingJournal(com.unifiedapi.unifiedto.models.operations.GetAccountingJournalRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.GetAccountingJournalRequest.class, baseUrl, "/accounting/{connection_id}/journal/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = com.unifiedapi.unifiedto.utils.Utils.getQueryParams(com.unifiedapi.unifiedto.models.operations.GetAccountingJournalRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.GetAccountingJournalResponse res = new com.unifiedapi.unifiedto.models.operations.GetAccountingJournalResponse(contentType, httpRes.statusCode(), httpRes) {{
            accountingJournal = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AccountingJournal out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AccountingJournal.class);
                res.accountingJournal = out;
            }
        }

        return res;
    }

    /**
     * List all journals
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.ListAccountingJournalsResponse listAccountingJournals(com.unifiedapi.unifiedto.models.operations.ListAccountingJournalsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.ListAccountingJournalsRequest.class, baseUrl, "/accounting/{connection_id}/journal", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = com.unifiedapi.unifiedto.utils.Utils.getQueryParams(com.unifiedapi.unifiedto.models.operations.ListAccountingJournalsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.ListAccountingJournalsResponse res = new com.unifiedapi.unifiedto.models.operations.ListAccountingJournalsResponse(contentType, httpRes.statusCode(), httpRes) {{
            accountingJournals = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AccountingJournal[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AccountingJournal[].class);
                res.accountingJournals = out;
            }
        }

        return res;
    }

    /**
     * Update a journal
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PatchAccountingJournalResponse patchAccountingJournal(com.unifiedapi.unifiedto.models.operations.PatchAccountingJournalRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PatchAccountingJournalRequest.class, baseUrl, "/accounting/{connection_id}/journal/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "accountingJournal", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.PatchAccountingJournalResponse res = new com.unifiedapi.unifiedto.models.operations.PatchAccountingJournalResponse(contentType, httpRes.statusCode(), httpRes) {{
            accountingJournal = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AccountingJournal out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AccountingJournal.class);
                res.accountingJournal = out;
            }
        }

        return res;
    }

    /**
     * Remove a journal
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.RemoveAccountingJournalResponse removeAccountingJournal(com.unifiedapi.unifiedto.models.operations.RemoveAccountingJournalRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.RemoveAccountingJournalRequest.class, baseUrl, "/accounting/{connection_id}/journal/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.RemoveAccountingJournalResponse res = new com.unifiedapi.unifiedto.models.operations.RemoveAccountingJournalResponse(contentType, httpRes.statusCode(), httpRes) {{
            string = null;
        }};
        
        if (true) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                String out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), String.class);
                res.string = out;
            }
        }

        return res;
    }

    /**
     * Update a journal
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.UpdateAccountingJournalResponse updateAccountingJournal(com.unifiedapi.unifiedto.models.operations.UpdateAccountingJournalRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.UpdateAccountingJournalRequest.class, baseUrl, "/accounting/{connection_id}/journal/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "accountingJournal", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.UpdateAccountingJournalResponse res = new com.unifiedapi.unifiedto.models.operations.UpdateAccountingJournalResponse(contentType, httpRes.statusCode(), httpRes) {{
            accountingJournal = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AccountingJournal out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AccountingJournal.class);
                res.accountingJournal = out;
            }
        }

        return res;
    }
}