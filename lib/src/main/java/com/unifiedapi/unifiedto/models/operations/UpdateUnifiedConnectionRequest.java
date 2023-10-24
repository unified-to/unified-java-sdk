/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class UpdateUnifiedConnectionRequest {
    /**
     * A connection represents a specific authentication of an integration.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.Connection connection;

    public UpdateUnifiedConnectionRequest withConnection(com.unifiedapi.unifiedto.models.shared.Connection connection) {
        this.connection = connection;
        return this;
    }
    
    /**
     * ID of the Connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public UpdateUnifiedConnectionRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public UpdateUnifiedConnectionRequest(@JsonProperty("id") String id) {
        this.id = id;
  }
}