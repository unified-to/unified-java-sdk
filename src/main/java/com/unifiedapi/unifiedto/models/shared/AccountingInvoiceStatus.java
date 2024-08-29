/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum AccountingInvoiceStatus {
    DRAFT("DRAFT"),
    VOIDED("VOIDED"),
    AUTHORIZED("AUTHORIZED"),
    PAID("PAID"),
    PARTIALLY_PAID("PARTIALLY_PAID"),
    PARTIALLY_REFUNDED("PARTIALLY_REFUNDED"),
    REFUNDED("REFUNDED");

    @JsonValue
    private final String value;

    private AccountingInvoiceStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}