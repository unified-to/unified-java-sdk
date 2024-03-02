/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.unifiedapi.unifiedto.utils.SpeakeasyMetadata;


public class CreatePaymentPaymentRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.unifiedapi.unifiedto.models.shared.PaymentPayment paymentPayment;

    public CreatePaymentPaymentRequest withPaymentPayment(com.unifiedapi.unifiedto.models.shared.PaymentPayment paymentPayment) {
        this.paymentPayment = paymentPayment;
        return this;
    }
    
    /**
     * ID of the connection
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connection_id")
    public String connectionId;

    public CreatePaymentPaymentRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    public CreatePaymentPaymentRequest(@JsonProperty("connection_id") String connectionId) {
        this.connectionId = connectionId;
  }
}