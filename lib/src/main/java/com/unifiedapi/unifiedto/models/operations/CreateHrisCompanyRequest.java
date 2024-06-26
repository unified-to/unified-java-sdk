/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateHrisCompanyRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.HrisCompany hrisCompany;

    public CreateHrisCompanyRequest withHrisCompany(com.unifiedapi.unifiedto.models.shared.HrisCompany hrisCompany) {
        this.hrisCompany = hrisCompany;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateHrisCompanyRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreateHrisCompanyRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
