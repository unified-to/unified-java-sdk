/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;
import java.time.OffsetDateTime;


public class GetAtsConnectionIdInterviewRequest {
    /**
     * The application ID to filter results
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=application_id")
    public String applicationId;

    public GetAtsConnectionIdInterviewRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public GetAtsConnectionIdInterviewRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Double limit;

    public GetAtsConnectionIdInterviewRequest withLimit(Double limit) {
        this.limit = limit;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Double offset;

    public GetAtsConnectionIdInterviewRequest withOffset(Double offset) {
        this.offset = offset;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=order")
    public String order;

    public GetAtsConnectionIdInterviewRequest withOrder(String order) {
        this.order = order;
        return this;
    }
    
    /**
     * Query string to search. eg. email address or name
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=query")
    public String query;

    public GetAtsConnectionIdInterviewRequest withQuery(String query) {
        this.query = query;
        return this;
    }
    
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    public String sort;

    public GetAtsConnectionIdInterviewRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }
    
    /**
     * Return only results whose updated date is equal or greater to this value
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_gte")
    public OffsetDateTime updatedGte;

    public GetAtsConnectionIdInterviewRequest withUpdatedGte(OffsetDateTime updatedGte) {
        this.updatedGte = updatedGte;
        return this;
    }
    
    public GetAtsConnectionIdInterviewRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
