/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class IntegrationSupport {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from_webhook")
    public FromWebhook fromWebhook;

    public IntegrationSupport withFromWebhook(FromWebhook fromWebhook) {
        this.fromWebhook = fromWebhook;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("inbound_fields")
    public java.util.Map<String, java.lang.Object> inboundFields;

    public IntegrationSupport withInboundFields(java.util.Map<String, java.lang.Object> inboundFields) {
        this.inboundFields = inboundFields;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_account_id")
    public ListAccountId listAccountId;

    public IntegrationSupport withListAccountId(ListAccountId listAccountId) {
        this.listAccountId = listAccountId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_application_id")
    public ListApplicationId listApplicationId;

    public IntegrationSupport withListApplicationId(ListApplicationId listApplicationId) {
        this.listApplicationId = listApplicationId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_candidate_id")
    public ListCandidateId listCandidateId;

    public IntegrationSupport withListCandidateId(ListCandidateId listCandidateId) {
        this.listCandidateId = listCandidateId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_channel_id")
    public ListChannelId listChannelId;

    public IntegrationSupport withListChannelId(ListChannelId listChannelId) {
        this.listChannelId = listChannelId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_collection_id")
    public ListCollectionId listCollectionId;

    public IntegrationSupport withListCollectionId(ListCollectionId listCollectionId) {
        this.listCollectionId = listCollectionId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_company_id")
    public ListCompanyId listCompanyId;

    public IntegrationSupport withListCompanyId(ListCompanyId listCompanyId) {
        this.listCompanyId = listCompanyId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_contact_id")
    public ListContactId listContactId;

    public IntegrationSupport withListContactId(ListContactId listContactId) {
        this.listContactId = listContactId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_customer_id")
    public ListCustomerId listCustomerId;

    public IntegrationSupport withListCustomerId(ListCustomerId listCustomerId) {
        this.listCustomerId = listCustomerId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_deal_id")
    public ListDealId listDealId;

    public IntegrationSupport withListDealId(ListDealId listDealId) {
        this.listDealId = listDealId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_interview_id")
    public ListInterviewId listInterviewId;

    public IntegrationSupport withListInterviewId(ListInterviewId listInterviewId) {
        this.listInterviewId = listInterviewId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_invoice_id")
    public ListInvoiceId listInvoiceId;

    public IntegrationSupport withListInvoiceId(ListInvoiceId listInvoiceId) {
        this.listInvoiceId = listInvoiceId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_item_id")
    public ListItemId listItemId;

    public IntegrationSupport withListItemId(ListItemId listItemId) {
        this.listItemId = listItemId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_item_variant_id")
    public ListItemVariantId listItemVariantId;

    public IntegrationSupport withListItemVariantId(ListItemVariantId listItemVariantId) {
        this.listItemVariantId = listItemVariantId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_job_id")
    public ListJobId listJobId;

    public IntegrationSupport withListJobId(ListJobId listJobId) {
        this.listJobId = listJobId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_limit")
    public ListLimit listLimit;

    public IntegrationSupport withListLimit(ListLimit listLimit) {
        this.listLimit = listLimit;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_link_id")
    public ListLinkId listLinkId;

    public IntegrationSupport withListLinkId(ListLinkId listLinkId) {
        this.listLinkId = listLinkId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_list_id")
    public ListListId listListId;

    public IntegrationSupport withListListId(ListListId listListId) {
        this.listListId = listListId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_location_id")
    public ListLocationId listLocationId;

    public IntegrationSupport withListLocationId(ListLocationId listLocationId) {
        this.listLocationId = listLocationId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_offset")
    public ListOffset listOffset;

    public IntegrationSupport withListOffset(ListOffset listOffset) {
        this.listOffset = listOffset;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_order")
    public ListOrder listOrder;

    public IntegrationSupport withListOrder(ListOrder listOrder) {
        this.listOrder = listOrder;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_parent_id")
    public ListParentId listParentId;

    public IntegrationSupport withListParentId(ListParentId listParentId) {
        this.listParentId = listParentId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_project_id")
    public ListProjectId listProjectId;

    public IntegrationSupport withListProjectId(ListProjectId listProjectId) {
        this.listProjectId = listProjectId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_query")
    public ListQuery listQuery;

    public IntegrationSupport withListQuery(ListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_sort_by_created_at")
    public ListSortByCreatedAt listSortByCreatedAt;

    public IntegrationSupport withListSortByCreatedAt(ListSortByCreatedAt listSortByCreatedAt) {
        this.listSortByCreatedAt = listSortByCreatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_sort_by_name")
    public ListSortByName listSortByName;

    public IntegrationSupport withListSortByName(ListSortByName listSortByName) {
        this.listSortByName = listSortByName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_sort_by_updated_at")
    public ListSortByUpdatedAt listSortByUpdatedAt;

    public IntegrationSupport withListSortByUpdatedAt(ListSortByUpdatedAt listSortByUpdatedAt) {
        this.listSortByUpdatedAt = listSortByUpdatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_space_id")
    public ListSpaceId listSpaceId;

    public IntegrationSupport withListSpaceId(ListSpaceId listSpaceId) {
        this.listSpaceId = listSpaceId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_ticket_id")
    public ListTicketId listTicketId;

    public IntegrationSupport withListTicketId(ListTicketId listTicketId) {
        this.listTicketId = listTicketId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_type")
    public ListType listType;

    public IntegrationSupport withListType(ListType listType) {
        this.listType = listType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_updated_gte")
    public ListUpdatedGte listUpdatedGte;

    public IntegrationSupport withListUpdatedGte(ListUpdatedGte listUpdatedGte) {
        this.listUpdatedGte = listUpdatedGte;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("list_user_id")
    public ListUserId listUserId;

    public IntegrationSupport withListUserId(ListUserId listUserId) {
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
    public java.util.Map<String, java.lang.Object> outboundFields;

    public IntegrationSupport withOutboundFields(java.util.Map<String, java.lang.Object> outboundFields) {
        this.outboundFields = outboundFields;
        return this;
    }
    
    /**
     * objects that we map from in the integration
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("raw_objects")
    public String[] rawObjects;

    public IntegrationSupport withRawObjects(String[] rawObjects) {
        this.rawObjects = rawObjects;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_domain")
    public SearchDomain searchDomain;

    public IntegrationSupport withSearchDomain(SearchDomain searchDomain) {
        this.searchDomain = searchDomain;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_email")
    public SearchEmail searchEmail;

    public IntegrationSupport withSearchEmail(SearchEmail searchEmail) {
        this.searchEmail = searchEmail;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_linkedinurl")
    public SearchLinkedinurl searchLinkedinurl;

    public IntegrationSupport withSearchLinkedinurl(SearchLinkedinurl searchLinkedinurl) {
        this.searchLinkedinurl = searchLinkedinurl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_name")
    public SearchName searchName;

    public IntegrationSupport withSearchName(SearchName searchName) {
        this.searchName = searchName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("search_twitter")
    public SearchTwitter searchTwitter;

    public IntegrationSupport withSearchTwitter(SearchTwitter searchTwitter) {
        this.searchTwitter = searchTwitter;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("webhook_events")
    public PropertyIntegrationSupportWebhookEvents webhookEvents;

    public IntegrationSupport withWebhookEvents(PropertyIntegrationSupportWebhookEvents webhookEvents) {
        this.webhookEvents = webhookEvents;
        return this;
    }
    
    public IntegrationSupport(){}
}
