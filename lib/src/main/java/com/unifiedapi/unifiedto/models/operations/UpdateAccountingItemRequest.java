/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class UpdateAccountingItemRequest {
    /**
     * An item or product
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.AccountingItem accountingItem;

    public UpdateAccountingItemRequest withAccountingItem(com.unifiedapi.unifiedto.models.shared.AccountingItem accountingItem) {
        this.accountingItem = accountingItem;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public UpdateAccountingItemRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * ID of the Item
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public UpdateAccountingItemRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public UpdateAccountingItemRequest(@JsonProperty("connection_id") String connectionId, @JsonProperty("id") String id) {
        this.connectionId = connectionId;
        this.id = id;
  }
}