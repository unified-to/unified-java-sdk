/* 
 * Code generated by Speakeasy (https://speakeasyapi.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountingInvoiceStatus {
    DRAFT("DRAFT"),
    VOIDED("VOIDED"),
    AUTHORIZED("AUTHORIZED"),
    PAID("PAID"),
    PARTIALLY_PAID("PARTIALLY_PAID"),
    PARTIALLY_REFUNDED("PARTIALLY_REFUNDED"),
    REFUNDED("REFUNDED");

    @JsonValue
    public final String value;

    private AccountingInvoiceStatus(String value) {
        this.value = value;
    }
}
