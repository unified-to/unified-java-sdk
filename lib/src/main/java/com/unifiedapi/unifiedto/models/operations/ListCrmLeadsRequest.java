/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;


public class ListCrmLeadsRequest {
    /**
     * The company ID to filter results
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=company_id")
    public String companyId;

    public ListCrmLeadsRequest withCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public ListCrmLeadsRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * The contact ID to filter results
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=contact_id")
    public String contactId;

    public ListCrmLeadsRequest withContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    
    /**
     * Comma-delimited fields to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String[] fields;

    public ListCrmLeadsRequest withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Double limit;

    public ListCrmLeadsRequest withLimit(Double limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Double offset;

    public ListCrmLeadsRequest withOffset(Double offset) {
        this.offset = offset;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=order")
    public String order;

    public ListCrmLeadsRequest withOrder(String order) {
        this.order = order;
        return this;
    }
    
    /**
     * Query string to search. eg. email address or name
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    public String query;

    public ListCrmLeadsRequest withQuery(String query) {
        this.query = query;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    public String sort;

    public ListCrmLeadsRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_gte")
    public OffsetDateTime updatedGte;

    public ListCrmLeadsRequest withUpdatedGte(OffsetDateTime updatedGte) {
        this.updatedGte = updatedGte;
        return this;
    }
    
    /**
     * The user/owner ID to filter results
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=user_id")
    public String userId;

    public ListCrmLeadsRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }
    
    public ListCrmLeadsRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
