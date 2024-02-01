/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateCommerceLocationRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.CommerceLocation commerceLocation;

    public CreateCommerceLocationRequest withCommerceLocation(com.unifiedapi.unifiedto.models.shared.CommerceLocation commerceLocation) {
        this.commerceLocation = commerceLocation;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateCommerceLocationRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreateCommerceLocationRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
