/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class PatchAccountingPaymentRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.AccountingPayment accountingPayment;

    public PatchAccountingPaymentRequest withAccountingPayment(com.unifiedapi.unifiedto.models.shared.AccountingPayment accountingPayment) {
        this.accountingPayment = accountingPayment;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public PatchAccountingPaymentRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    /**
     * ID of the Payment
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public PatchAccountingPaymentRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public PatchAccountingPaymentRequest(@JsonProperty("connection_id") String connectionId, @JsonProperty("id") String id) {
        this.connectionId = connectionId;
        this.id = id;
  }
}
