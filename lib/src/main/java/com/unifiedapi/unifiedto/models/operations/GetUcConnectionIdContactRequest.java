/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import java.time.LocalDate;


public class GetUcConnectionIdContactRequest {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=agent_id")
    public String agentId;

    public GetUcConnectionIdContactRequest withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public GetUcConnectionIdContactRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Double limit;

    public GetUcConnectionIdContactRequest withLimit(Double limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Double offset;

    public GetUcConnectionIdContactRequest withOffset(Double offset) {
        this.offset = offset;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=order")
    public String order;

    public GetUcConnectionIdContactRequest withOrder(String order) {
        this.order = order;
        return this;
    }
    
    /**
     * Query string to search. eg. email address or name
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    public String query;

    public GetUcConnectionIdContactRequest withQuery(String query) {
        this.query = query;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    public String sort;

    public GetUcConnectionIdContactRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_gte")
    public LocalDate updatedGte;

    public GetUcConnectionIdContactRequest withUpdatedGte(LocalDate updatedGte) {
        this.updatedGte = updatedGte;
        return this;
    }
    
    public GetUcConnectionIdContactRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
