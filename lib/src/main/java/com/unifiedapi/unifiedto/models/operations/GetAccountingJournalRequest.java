/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class GetAccountingJournalRequest {
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public GetAccountingJournalRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * Comma-delimited fields to return
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    public String[] fields;

    public GetAccountingJournalRequest withFields(String[] fields) {
        this.fields = fields;
        return this;
    }
    
    /**
     * ID of the Journal
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public GetAccountingJournalRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public GetAccountingJournalRequest(@JsonProperty("connection_id") String connectionId, @JsonProperty("id") String id) {
        this.connectionId = connectionId;
        this.id = id;
  }
}
