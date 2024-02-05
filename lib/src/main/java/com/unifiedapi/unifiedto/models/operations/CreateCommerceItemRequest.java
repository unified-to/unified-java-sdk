/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateCommerceItemRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.CommerceItem commerceItem;

    public CreateCommerceItemRequest withCommerceItem(com.unifiedapi.unifiedto.models.shared.CommerceItem commerceItem) {
        this.commerceItem = commerceItem;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateCommerceItemRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreateCommerceItemRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}