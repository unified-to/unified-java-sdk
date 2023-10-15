/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class PatchMartechMemberRequest {
    /**
     * A member represents a person
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.MarketingMember marketingMember;

    public PatchMartechMemberRequest withMarketingMember(com.unifiedapi.unifiedto.models.shared.MarketingMember marketingMember) {
        this.marketingMember = marketingMember;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public PatchMartechMemberRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * ID of the Member
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public PatchMartechMemberRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * ID of the list
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=list_id")
    public String listId;

    public PatchMartechMemberRequest withListId(String listId) {
        this.listId = listId;
        return this;
    }
    
    public PatchMartechMemberRequest(@JsonProperty("connection_id") String connectionId, @JsonProperty("id") String id, @JsonProperty("list_id") String listId) {
        this.connectionId = connectionId;
        this.id = id;
        this.listId = listId;
  }
}
