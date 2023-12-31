/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.unifiedapi.unifiedto.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Type {
    ACCOUNTS_PAYABLE("ACCOUNTS_PAYABLE"),
    ACCOUNTS_RECEIVABLE("ACCOUNTS_RECEIVABLE"),
    BANK("BANK"),
    CREDIT_CARD("CREDIT_CARD"),
    FIXED_ASSET("FIXED_ASSET"),
    LIABILITY("LIABILITY"),
    EQUITY("EQUITY"),
    EXPENSE("EXPENSE"),
    REVENUE("REVENUE"),
    OTHER("OTHER");

    @JsonValue
    public final String value;

    private Type(String value) {
        this.value = value;
    }
}
