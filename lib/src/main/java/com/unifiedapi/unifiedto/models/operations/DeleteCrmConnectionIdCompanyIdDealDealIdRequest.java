/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class DeleteCrmConnectionIdCompanyIdDealDealIdRequest {
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public DeleteCrmConnectionIdCompanyIdDealDealIdRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * ID of the deal
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=deal_id")
    public String dealId;

    public DeleteCrmConnectionIdCompanyIdDealDealIdRequest withDealId(String dealId) {
        this.dealId = dealId;
        return this;
    }
    
    /**
     * ID of the Company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public DeleteCrmConnectionIdCompanyIdDealDealIdRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public DeleteCrmConnectionIdCompanyIdDealDealIdRequest(@JsonProperty("connection_id") String connectionId, @JsonProperty("deal_id") String dealId, @JsonProperty("id") String id) {
        this.connectionId = connectionId;
        this.dealId = dealId;
        this.id = id;
  }
}
