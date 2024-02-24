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

public class Inventory {
	
	private SDKConfiguration sdkConfiguration;

	public Inventory(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create an inventory
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.CreateCommerceInventoryResponse createCommerceInventory(com.unifiedapi.unifiedto.models.operations.CreateCommerceInventoryRequest request, com.unifiedapi.unifiedto.models.operations.CreateCommerceInventorySecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.CreateCommerceInventoryRequest.class, baseUrl, "/commerce/{connection_id}/inventory", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "commerceInventory", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.CreateCommerceInventoryResponse res = new com.unifiedapi.unifiedto.models.operations.CreateCommerceInventoryResponse(contentType, httpRes.statusCode(), httpRes) {{
            commerceInventory = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.CommerceInventory out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.CommerceInventory.class);
                res.commerceInventory = out;
            }
        }

        return res;
    }

    /**
     * Retrieve an inventory
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.GetCommerceInventoryResponse getCommerceInventory(com.unifiedapi.unifiedto.models.operations.GetCommerceInventoryRequest request, com.unifiedapi.unifiedto.models.operations.GetCommerceInventorySecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.GetCommerceInventoryRequest.class, baseUrl, "/commerce/{connection_id}/inventory/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = com.unifiedapi.unifiedto.utils.Utils.getQueryParams(com.unifiedapi.unifiedto.models.operations.GetCommerceInventoryRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.GetCommerceInventoryResponse res = new com.unifiedapi.unifiedto.models.operations.GetCommerceInventoryResponse(contentType, httpRes.statusCode(), httpRes) {{
            commerceInventory = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.CommerceInventory out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.CommerceInventory.class);
                res.commerceInventory = out;
            }
        }

        return res;
    }

    /**
     * List all inventories
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.ListCommerceInventoriesResponse listCommerceInventories(com.unifiedapi.unifiedto.models.operations.ListCommerceInventoriesRequest request, com.unifiedapi.unifiedto.models.operations.ListCommerceInventoriesSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.ListCommerceInventoriesRequest.class, baseUrl, "/commerce/{connection_id}/inventory", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = com.unifiedapi.unifiedto.utils.Utils.getQueryParams(com.unifiedapi.unifiedto.models.operations.ListCommerceInventoriesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.ListCommerceInventoriesResponse res = new com.unifiedapi.unifiedto.models.operations.ListCommerceInventoriesResponse(contentType, httpRes.statusCode(), httpRes) {{
            commerceInventories = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.CommerceInventory[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.CommerceInventory[].class);
                res.commerceInventories = out;
            }
        }

        return res;
    }

    /**
     * Update an inventory
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PatchCommerceInventoryResponse patchCommerceInventory(com.unifiedapi.unifiedto.models.operations.PatchCommerceInventoryRequest request, com.unifiedapi.unifiedto.models.operations.PatchCommerceInventorySecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PatchCommerceInventoryRequest.class, baseUrl, "/commerce/{connection_id}/inventory/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "commerceInventory", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.PatchCommerceInventoryResponse res = new com.unifiedapi.unifiedto.models.operations.PatchCommerceInventoryResponse(contentType, httpRes.statusCode(), httpRes) {{
            commerceInventory = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.CommerceInventory out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.CommerceInventory.class);
                res.commerceInventory = out;
            }
        }

        return res;
    }

    /**
     * Remove an inventory
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.RemoveCommerceInventoryResponse removeCommerceInventory(com.unifiedapi.unifiedto.models.operations.RemoveCommerceInventoryRequest request, com.unifiedapi.unifiedto.models.operations.RemoveCommerceInventorySecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.RemoveCommerceInventoryRequest.class, baseUrl, "/commerce/{connection_id}/inventory/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.RemoveCommerceInventoryResponse res = new com.unifiedapi.unifiedto.models.operations.RemoveCommerceInventoryResponse(contentType, httpRes.statusCode(), httpRes) {{
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
     * Update an inventory
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.UpdateCommerceInventoryResponse updateCommerceInventory(com.unifiedapi.unifiedto.models.operations.UpdateCommerceInventoryRequest request, com.unifiedapi.unifiedto.models.operations.UpdateCommerceInventorySecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.UpdateCommerceInventoryRequest.class, baseUrl, "/commerce/{connection_id}/inventory/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "commerceInventory", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.UpdateCommerceInventoryResponse res = new com.unifiedapi.unifiedto.models.operations.UpdateCommerceInventoryResponse(contentType, httpRes.statusCode(), httpRes) {{
            commerceInventory = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.CommerceInventory out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.CommerceInventory.class);
                res.commerceInventory = out;
            }
        }

        return res;
    }
}