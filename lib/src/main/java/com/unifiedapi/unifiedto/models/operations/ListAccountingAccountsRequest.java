/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;


public class ListAccountingAccountsRequest {
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public ListAccountingAccountsRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * Comma-delimited fields to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String[] fields;

    public ListAccountingAccountsRequest withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Double limit;

    public ListAccountingAccountsRequest withLimit(Double limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Double offset;

    public ListAccountingAccountsRequest withOffset(Double offset) {
        this.offset = offset;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=order")
    public String order;

    public ListAccountingAccountsRequest withOrder(String order) {
        this.order = order;
        return this;
    }
    
    /**
     * Query string to search. eg. email address or name
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    public String query;

    public ListAccountingAccountsRequest withQuery(String query) {
        this.query = query;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    public String sort;

    public ListAccountingAccountsRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_gte")
    public OffsetDateTime updatedGte;

    public ListAccountingAccountsRequest withUpdatedGte(OffsetDateTime updatedGte) {
        this.updatedGte = updatedGte;
        return this;
    }
    
    public ListAccountingAccountsRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
