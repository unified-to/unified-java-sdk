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

public class Taxrate {
	
	private SDKConfiguration sdkConfiguration;

	public Taxrate(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create a taxrate
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateResponse createAccountingTaxrate(com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateRequest.class, baseUrl, "/accounting/{connection_id}/taxrate", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "accountingTaxrate", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateResponse res = new com.unifiedapi.unifiedto.models.operations.CreateAccountingTaxrateResponse(contentType, httpRes.statusCode(), httpRes) {{
            accountingTaxrate = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AccountingTaxrate out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AccountingTaxrate.class);
                res.accountingTaxrate = out;
            }
        }

        return res;
    }

    /**
     * Retrieve a taxrate
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateResponse getAccountingTaxrate(com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateRequest.class, baseUrl, "/accounting/{connection_id}/taxrate/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = com.unifiedapi.unifiedto.utils.Utils.getQueryParams(com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateResponse res = new com.unifiedapi.unifiedto.models.operations.GetAccountingTaxrateResponse(contentType, httpRes.statusCode(), httpRes) {{
            accountingTaxrate = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AccountingTaxrate out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AccountingTaxrate.class);
                res.accountingTaxrate = out;
            }
        }

        return res;
    }

    /**
     * List all taxrates
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesResponse listAccountingTaxrates(com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesRequest.class, baseUrl, "/accounting/{connection_id}/taxrate", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = com.unifiedapi.unifiedto.utils.Utils.getQueryParams(com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesResponse res = new com.unifiedapi.unifiedto.models.operations.ListAccountingTaxratesResponse(contentType, httpRes.statusCode(), httpRes) {{
            accountingTaxrates = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AccountingTaxrate[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AccountingTaxrate[].class);
                res.accountingTaxrates = out;
            }
        }

        return res;
    }

    /**
     * Update a taxrate
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateResponse patchAccountingTaxrate(com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateRequest.class, baseUrl, "/accounting/{connection_id}/taxrate/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "accountingTaxrate", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateResponse res = new com.unifiedapi.unifiedto.models.operations.PatchAccountingTaxrateResponse(contentType, httpRes.statusCode(), httpRes) {{
            accountingTaxrate = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AccountingTaxrate out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AccountingTaxrate.class);
                res.accountingTaxrate = out;
            }
        }

        return res;
    }

    /**
     * Remove a taxrate
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateResponse removeAccountingTaxrate(com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateRequest.class, baseUrl, "/accounting/{connection_id}/taxrate/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateResponse res = new com.unifiedapi.unifiedto.models.operations.RemoveAccountingTaxrateResponse(contentType, httpRes.statusCode(), httpRes) {{
            string = null;
        }};
        
        if ((httpRes.statusCode() >= 200 && httpRes.statusCode() < 300)) {
        }
        else {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                String out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), String.class);
                res.string = out;
            }
        }

        return res;
    }

    /**
     * Update a taxrate
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateResponse updateAccountingTaxrate(com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateRequest.class, baseUrl, "/accounting/{connection_id}/taxrate/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "accountingTaxrate", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateResponse res = new com.unifiedapi.unifiedto.models.operations.UpdateAccountingTaxrateResponse(contentType, httpRes.statusCode(), httpRes) {{
            accountingTaxrate = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AccountingTaxrate out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AccountingTaxrate.class);
                res.accountingTaxrate = out;
            }
        }

        return res;
    }
}