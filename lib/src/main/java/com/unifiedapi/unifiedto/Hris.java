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
import java.time.LocalDate;
import org.apache.http.NameValuePair;

public class Hris {
	
	private SDKConfiguration sdkConfiguration;

	public Hris(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Remove a Employee
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdEmployeeIdResponse deleteHrisConnectionIdEmployeeId(com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdEmployeeIdRequest request, com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdEmployeeIdSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdEmployeeIdRequest.class, baseUrl, "/hris/{connection_id}/employee/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdEmployeeIdResponse res = new com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdEmployeeIdResponse(contentType, httpRes.statusCode()) {{
            deleteHrisConnectionIdEmployeeIdDefaultApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.deleteHrisConnectionIdEmployeeIdDefaultApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * Remove a Group
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdGroupIdResponse deleteHrisConnectionIdGroupId(com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdGroupIdRequest request, com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdGroupIdSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdGroupIdRequest.class, baseUrl, "/hris/{connection_id}/group/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdGroupIdResponse res = new com.unifiedapi.unifiedto.models.operations.DeleteHrisConnectionIdGroupIdResponse(contentType, httpRes.statusCode()) {{
            deleteHrisConnectionIdGroupIdDefaultApplicationJSONString = null;
        }};
        res.rawResponse = httpRes;
        
        if (true) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.deleteHrisConnectionIdGroupIdDefaultApplicationJSONString = out;
            }
        }

        return res;
    }

    /**
     * List all Employees
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeResponse getHrisConnectionIdEmployee(com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeRequest request, com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeRequest.class, baseUrl, "/hris/{connection_id}/employee", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = com.unifiedapi.unifiedto.utils.Utils.getQueryParams(com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeResponse res = new com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeResponse(contentType, httpRes.statusCode()) {{
            hrisEmployees = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.HrisEmployee[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.HrisEmployee[].class);
                res.hrisEmployees = out;
            }
        }

        return res;
    }

    /**
     * Retrieve a Employee
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeIdResponse getHrisConnectionIdEmployeeId(com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeIdRequest request, com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeIdSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeIdRequest.class, baseUrl, "/hris/{connection_id}/employee/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeIdResponse res = new com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdEmployeeIdResponse(contentType, httpRes.statusCode()) {{
            hrisEmployee = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.HrisEmployee out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.HrisEmployee.class);
                res.hrisEmployee = out;
            }
        }

        return res;
    }

    /**
     * List all Groups
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupResponse getHrisConnectionIdGroup(com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupRequest request, com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupRequest.class, baseUrl, "/hris/{connection_id}/group", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = com.unifiedapi.unifiedto.utils.Utils.getQueryParams(com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupResponse res = new com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupResponse(contentType, httpRes.statusCode()) {{
            hrisGroups = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.HrisGroup[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.HrisGroup[].class);
                res.hrisGroups = out;
            }
        }

        return res;
    }

    /**
     * Retrieve a Group
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupIdResponse getHrisConnectionIdGroupId(com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupIdRequest request, com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupIdSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupIdRequest.class, baseUrl, "/hris/{connection_id}/group/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupIdResponse res = new com.unifiedapi.unifiedto.models.operations.GetHrisConnectionIdGroupIdResponse(contentType, httpRes.statusCode()) {{
            hrisGroup = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.HrisGroup out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.HrisGroup.class);
                res.hrisGroup = out;
            }
        }

        return res;
    }

    /**
     * Update a Employee
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdEmployeeIdResponse patchHrisConnectionIdEmployeeId(com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdEmployeeIdRequest request, com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdEmployeeIdSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdEmployeeIdRequest.class, baseUrl, "/hris/{connection_id}/employee/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "hrisEmployee", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdEmployeeIdResponse res = new com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdEmployeeIdResponse(contentType, httpRes.statusCode()) {{
            hrisEmployee = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.HrisEmployee out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.HrisEmployee.class);
                res.hrisEmployee = out;
            }
        }

        return res;
    }

    /**
     * Update a Group
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdGroupIdResponse patchHrisConnectionIdGroupId(com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdGroupIdRequest request, com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdGroupIdSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdGroupIdRequest.class, baseUrl, "/hris/{connection_id}/group/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "hrisGroup", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdGroupIdResponse res = new com.unifiedapi.unifiedto.models.operations.PatchHrisConnectionIdGroupIdResponse(contentType, httpRes.statusCode()) {{
            hrisGroup = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.HrisGroup out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.HrisGroup.class);
                res.hrisGroup = out;
            }
        }

        return res;
    }

    /**
     * Create a Employee
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdEmployeeResponse postHrisConnectionIdEmployee(com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdEmployeeRequest request, com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdEmployeeSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdEmployeeRequest.class, baseUrl, "/hris/{connection_id}/employee", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "hrisEmployee", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdEmployeeResponse res = new com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdEmployeeResponse(contentType, httpRes.statusCode()) {{
            hrisEmployee = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.HrisEmployee out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.HrisEmployee.class);
                res.hrisEmployee = out;
            }
        }

        return res;
    }

    /**
     * Create a Group
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdGroupResponse postHrisConnectionIdGroup(com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdGroupRequest request, com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdGroupSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdGroupRequest.class, baseUrl, "/hris/{connection_id}/group", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "hrisGroup", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdGroupResponse res = new com.unifiedapi.unifiedto.models.operations.PostHrisConnectionIdGroupResponse(contentType, httpRes.statusCode()) {{
            hrisGroup = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.HrisGroup out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.HrisGroup.class);
                res.hrisGroup = out;
            }
        }

        return res;
    }

    /**
     * Update a Employee
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdEmployeeIdResponse putHrisConnectionIdEmployeeId(com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdEmployeeIdRequest request, com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdEmployeeIdSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdEmployeeIdRequest.class, baseUrl, "/hris/{connection_id}/employee/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "hrisEmployee", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdEmployeeIdResponse res = new com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdEmployeeIdResponse(contentType, httpRes.statusCode()) {{
            hrisEmployee = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.HrisEmployee out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.HrisEmployee.class);
                res.hrisEmployee = out;
            }
        }

        return res;
    }

    /**
     * Update a Group
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdGroupIdResponse putHrisConnectionIdGroupId(com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdGroupIdRequest request, com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdGroupIdSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = com.unifiedapi.unifiedto.utils.Utils.generateURL(com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdGroupIdRequest.class, baseUrl, "/hris/{connection_id}/group/{id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = com.unifiedapi.unifiedto.utils.Utils.serializeRequestBody(request, "hrisGroup", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = com.unifiedapi.unifiedto.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdGroupIdResponse res = new com.unifiedapi.unifiedto.models.operations.PutHrisConnectionIdGroupIdResponse(contentType, httpRes.statusCode()) {{
            hrisGroup = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (com.unifiedapi.unifiedto.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                com.unifiedapi.unifiedto.models.shared.HrisGroup out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), com.unifiedapi.unifiedto.models.shared.HrisGroup.class);
                res.hrisGroup = out;
            }
        }

        return res;
    }
}