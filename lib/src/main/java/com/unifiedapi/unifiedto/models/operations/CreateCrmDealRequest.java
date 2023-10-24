/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateCrmDealRequest {
    /**
     * A deal represents an opportunity with companies and/or contacts
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.CrmDeal crmDeal;

    public CreateCrmDealRequest withCrmDeal(com.unifiedapi.unifiedto.models.shared.CrmDeal crmDeal) {
        this.crmDeal = crmDeal;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateCrmDealRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreateCrmDealRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}