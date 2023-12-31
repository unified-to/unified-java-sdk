/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class UpdateCrmCompanyRequest {
    /**
     * A company represents an organization that optionally is associated with a deal and/or contacts
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.CrmCompany crmCompany;

    public UpdateCrmCompanyRequest withCrmCompany(com.unifiedapi.unifiedto.models.shared.CrmCompany crmCompany) {
        this.crmCompany = crmCompany;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public UpdateCrmCompanyRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * ID of the Company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public UpdateCrmCompanyRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public UpdateCrmCompanyRequest(@JsonProperty("connection_id") String connectionId, @JsonProperty("id") String id) {
        this.connectionId = connectionId;
        this.id = id;
  }
}
