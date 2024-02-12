/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unifiedapi.unifiedto.utils.HTTPClient;
import com.unifiedapi.unifiedto.utils.HTTPRequest;
import com.unifiedapi.unifiedto.utils.JSON;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Payout {
	
	private SDKConfiguration sdkConfiguration;

	public Payout(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Retrieve a payout
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.GetAccountingPayoutResponse getAccountingPayout(com.unifiedapi.unifiedto.models.operations.GetAccountingPayoutRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.GetAccountingPayoutRequest.class, baseUrl, "/accounting/{connection_id}/payout/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = com.unifiedapi.unifiedto.utils.Utils.getQueryParams(com.unifiedapi.unifiedto.models.operations.GetAccountingPayoutRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.GetAccountingPayoutResponse res = new com.unifiedapi.unifiedto.models.operations.GetAccountingPayoutResponse(contentType, httpRes.statusCode(), httpRes) {{
            accountingPayout = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AccountingPayout out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AccountingPayout.class);
                res.accountingPayout = out;
            }
        }

        return res;
    }

    /**
     * List all payouts
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.ListAccountingPayoutsResponse listAccountingPayouts(com.unifiedapi.unifiedto.models.operations.ListAccountingPayoutsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.ListAccountingPayoutsRequest.class, baseUrl, "/accounting/{connection_id}/payout", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = com.unifiedapi.unifiedto.utils.Utils.getQueryParams(com.unifiedapi.unifiedto.models.operations.ListAccountingPayoutsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        com.unifiedapi.unifiedto.models.operations.ListAccountingPayoutsResponse res = new com.unifiedapi.unifiedto.models.operations.ListAccountingPayoutsResponse(contentType, httpRes.statusCode(), httpRes) {{
            accountingPayouts = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.AccountingPayout[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.AccountingPayout[].class);
                res.accountingPayouts = out;
            }
        }

        return res;
    }
}