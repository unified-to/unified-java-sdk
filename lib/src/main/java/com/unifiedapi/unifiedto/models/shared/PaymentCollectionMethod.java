/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentCollectionMethod {
    SEND_INVOICE("send_invoice"),
    CHARGE_AUTOMATICALLY("charge_automatically");

    @JsonValue
    public final String value;

    private PaymentCollectionMethod(String value) {
        this.value = value;
    }
}
