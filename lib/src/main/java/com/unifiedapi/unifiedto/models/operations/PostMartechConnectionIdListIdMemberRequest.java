/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class PostMartechConnectionIdListIdMemberRequest {
    /**
     * A member represents a person
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.MarketingMember marketingMember;

    public PostMartechConnectionIdListIdMemberRequest withMarketingMember(com.unifiedapi.unifiedto.models.shared.MarketingMember marketingMember) {
        this.marketingMember = marketingMember;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public PostMartechConnectionIdListIdMemberRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * ID of the list
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=list_id")
    public String listId;

    public PostMartechConnectionIdListIdMemberRequest withListId(String listId) {
        this.listId = listId;
        return this;
    }
    
    public PostMartechConnectionIdListIdMemberRequest(@JsonProperty("connection_id") String connectionId, @JsonProperty("list_id") String listId) {
        this.connectionId = connectionId;
        this.listId = listId;
  }
}