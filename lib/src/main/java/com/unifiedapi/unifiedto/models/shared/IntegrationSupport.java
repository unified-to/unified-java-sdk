/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class IntegrationSupport {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("inbound_fields")
    public PropertyIntegrationSupportInboundFields inboundFields;

    public IntegrationSupport withInboundFields(PropertyIntegrationSupportInboundFields inboundFields) {
        this.inboundFields = inboundFields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_application_id")
    public Boolean listApplicationId;

    public IntegrationSupport withListApplicationId(Boolean listApplicationId) {
        this.listApplicationId = listApplicationId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_candidate_id")
    public Boolean listCandidateId;

    public IntegrationSupport withListCandidateId(Boolean listCandidateId) {
        this.listCandidateId = listCandidateId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_company_id")
    public Boolean listCompanyId;

    public IntegrationSupport withListCompanyId(Boolean listCompanyId) {
        this.listCompanyId = listCompanyId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_contact_id")
    public Boolean listContactId;

    public IntegrationSupport withListContactId(Boolean listContactId) {
        this.listContactId = listContactId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_customer_id")
    public Boolean listCustomerId;

    public IntegrationSupport withListCustomerId(Boolean listCustomerId) {
        this.listCustomerId = listCustomerId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_deal_id")
    public Boolean listDealId;

    public IntegrationSupport withListDealId(Boolean listDealId) {
        this.listDealId = listDealId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_invoice_id")
    public Boolean listInvoiceId;

    public IntegrationSupport withListInvoiceId(Boolean listInvoiceId) {
        this.listInvoiceId = listInvoiceId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_job_id")
    public Boolean listJobId;

    public IntegrationSupport withListJobId(Boolean listJobId) {
        this.listJobId = listJobId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_limit")
    public Boolean listLimit;

    public IntegrationSupport withListLimit(Boolean listLimit) {
        this.listLimit = listLimit;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_offset")
    public Boolean listOffset;

    public IntegrationSupport withListOffset(Boolean listOffset) {
        this.listOffset = listOffset;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_order")
    public Boolean listOrder;

    public IntegrationSupport withListOrder(Boolean listOrder) {
        this.listOrder = listOrder;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_parent_id")
    public Boolean listParentId;

    public IntegrationSupport withListParentId(Boolean listParentId) {
        this.listParentId = listParentId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_query")
    public Boolean listQuery;

    public IntegrationSupport withListQuery(Boolean listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_sort_by_created_at")
    public Boolean listSortByCreatedAt;

    public IntegrationSupport withListSortByCreatedAt(Boolean listSortByCreatedAt) {
        this.listSortByCreatedAt = listSortByCreatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_sort_by_name")
    public Boolean listSortByName;

    public IntegrationSupport withListSortByName(Boolean listSortByName) {
        this.listSortByName = listSortByName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_sort_by_updated_at")
    public Boolean listSortByUpdatedAt;

    public IntegrationSupport withListSortByUpdatedAt(Boolean listSortByUpdatedAt) {
        this.listSortByUpdatedAt = listSortByUpdatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_updated_gte")
    public Boolean listUpdatedGte;

    public IntegrationSupport withListUpdatedGte(Boolean listUpdatedGte) {
        this.listUpdatedGte = listUpdatedGte;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_user_id")
    public Boolean listUserId;

    public IntegrationSupport withListUserId(Boolean listUserId) {
        this.listUserId = listUserId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("methods")
    public java.util.Map<String, Boolean> methods;

    public IntegrationSupport withMethods(java.util.Map<String, Boolean> methods) {
        this.methods = methods;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("outbound_fields")
    public PropertyIntegrationSupportOutboundFields outboundFields;

    public IntegrationSupport withOutboundFields(PropertyIntegrationSupportOutboundFields outboundFields) {
        this.outboundFields = outboundFields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_domain")
    public Boolean searchDomain;

    public IntegrationSupport withSearchDomain(Boolean searchDomain) {
        this.searchDomain = searchDomain;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_email")
    public Boolean searchEmail;

    public IntegrationSupport withSearchEmail(Boolean searchEmail) {
        this.searchEmail = searchEmail;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_linkedin_url")
    public Boolean searchLinkedinUrl;

    public IntegrationSupport withSearchLinkedinUrl(Boolean searchLinkedinUrl) {
        this.searchLinkedinUrl = searchLinkedinUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_name")
    public Boolean searchName;

    public IntegrationSupport withSearchName(Boolean searchName) {
        this.searchName = searchName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_twitter")
    public Boolean searchTwitter;

    public IntegrationSupport withSearchTwitter(Boolean searchTwitter) {
        this.searchTwitter = searchTwitter;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("webhook_events")
    public PropertyIntegrationSupportWebhookEvents[] webhookEvents;

    public IntegrationSupport withWebhookEvents(PropertyIntegrationSupportWebhookEvents[] webhookEvents) {
        this.webhookEvents = webhookEvents;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("webhook_type")
    public WebhookType webhookType;

    public IntegrationSupport withWebhookType(WebhookType webhookType) {
        this.webhookType = webhookType;
        return this;
    }
    
    public IntegrationSupport(){}
}
