/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountingContactPaymentMethodType {
    ACH("ACH"),
    ALIPAY("ALIPAY"),
    CARD("CARD"),
    GIROPAY("GIROPAY"),
    IDEAL("IDEAL"),
    OTHER("OTHER"),
    PAYPAL("PAYPAL");

    @JsonValue
    public final String value;

    private AccountingContactPaymentMethodType(String value) {
        this.value = value;
    }
}
