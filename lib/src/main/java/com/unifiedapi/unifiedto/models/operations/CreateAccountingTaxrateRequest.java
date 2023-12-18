/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreateAccountingTaxrateRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.AccountingTaxrate accountingTaxrate;

    public CreateAccountingTaxrateRequest withAccountingTaxrate(com.unifiedapi.unifiedto.models.shared.AccountingTaxrate accountingTaxrate) {
        this.accountingTaxrate = accountingTaxrate;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreateAccountingTaxrateRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreateAccountingTaxrateRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}
