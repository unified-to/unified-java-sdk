/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateMartechMemberRequest {
    /**
     * A member represents a person
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.MarketingMember marketingMember;

    public CreateMartechMemberRequest withMarketingMember(com.unifiedapi.unifiedto.models.shared.MarketingMember marketingMember) {
        this.marketingMember = marketingMember;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateMartechMemberRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreateMartechMemberRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
