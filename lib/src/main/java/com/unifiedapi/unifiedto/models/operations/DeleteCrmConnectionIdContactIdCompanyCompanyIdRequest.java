/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class DeleteCrmConnectionIdContactIdCompanyCompanyIdRequest {
    /**
     * ID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=company_id")
    public String companyId;

    public DeleteCrmConnectionIdContactIdCompanyCompanyIdRequest withCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public DeleteCrmConnectionIdContactIdCompanyCompanyIdRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * ID of the Contact
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public DeleteCrmConnectionIdContactIdCompanyCompanyIdRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public DeleteCrmConnectionIdContactIdCompanyCompanyIdRequest(@JsonProperty("company_id") String companyId, @JsonProperty("connection_id") String connectionId, @JsonProperty("id") String id) {
        this.companyId = companyId;
        this.connectionId = connectionId;
        this.id = id;
  }
}