/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentType {
    DIRECT("DIRECT"),
    CHEQUE("CHEQUE"),
    CASH("CASH");

    @JsonValue
    public final String value;

    private PaymentType(String value) {
        this.value = value;
    }
}
